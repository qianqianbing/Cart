package com.king.myapplication.ui.activiy;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.king.myapplication.R;
import com.king.myapplication.data.Bean.ShowBean;
import com.king.myapplication.di.homeMvp.HomeContract;
import com.king.myapplication.di.homeMvp.HomePresenter;
import com.king.myapplication.ui.adapter.PopulaAdapter;
import com.king.myapplication.ui.base.BaseActivity;

import butterknife.BindView;

public class HomeActivity extends BaseActivity<HomeContract.IHomeView, HomePresenter<HomeContract.IHomeView>> implements HomeContract.IHomeView {

    @BindView(R.id.rv_view)
    RecyclerView rvView;

    @Override
    protected void initData() {
        mPresenter.requestHomeData("1", "10");
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
        rvView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        PopulaAdapter populaAdapter = new PopulaAdapter(R.layout.item_popular, showBean.getResult());
        rvView.setAdapter(populaAdapter);
    }
}