package com.king.myapplication.ui.activiy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.king.myapplication.R;
import com.king.myapplication.data.Bean.ShowBean;
import com.king.myapplication.di.homeMvp.HomeContract;
import com.king.myapplication.di.homeMvp.HomePresenter;
import com.king.myapplication.ui.base.BaseActivity;

public class HomeActivity extends BaseActivity<HomeContract.IHomeView, HomePresenter<HomeContract.IHomeView>> implements HomeContract.IHomeView {

    @Override
    protected void initData() {
        mPresenter.requestHomeData("1","5");
    }

    @Override
    protected HomePresenter<HomeContract.IHomeView> oncreatePresenter() {
        return new HomePresenter<>();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }


    @Override
    public void ShowhomeData(ShowBean showBean) {

    }
}