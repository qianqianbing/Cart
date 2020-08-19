package com.king.myapplication.ui.activiy;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.king.myapplication.R;
import com.king.myapplication.data.Bean.BannerBean;
import com.king.myapplication.data.Bean.ShowBean;
import com.king.myapplication.di.homeMvp.HomeContract;
import com.king.myapplication.di.homeMvp.HomePresenter;
import com.king.myapplication.ui.adapter.PopulaAdapter;
import com.king.myapplication.ui.base.BaseActivity;
import com.stx.xhb.xbanner.XBanner;
import com.stx.xhb.xbanner.transformers.Transformer;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity<HomeContract.IHomeView, HomePresenter<HomeContract.IHomeView>> implements HomeContract.IHomeView {

    @BindView(R.id.rv_view)
    RecyclerView rvView;
    @BindView(R.id.iv_banner)
    XBanner ivBanner;

    @Override
    protected void initData() {
        //presenter绑定
        mPresenter.requestHomeData("1", "10");
        mPresenter.requestBannerData();
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

    @Override
    public void BannerData(BannerBean bannerBean) {
        ivBanner.setBannerData(bannerBean.result);
        ivBanner.setmAdapter(new XBanner.XBannerAdapter() {
            @Override
            public void loadBanner(XBanner banner, Object model, View view, int position) {
                Glide.with(getApplicationContext()).load(bannerBean.result.get(position).imageUrl).into((ImageView) view);
            }
        });
    }
}