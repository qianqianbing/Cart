package com.king.myapplication.di.homeMvp;

import com.king.myapplication.ui.base.BasePresenter;

/**
 * 作者：Administrator
 * on 2020/8/18
 * 14:32
 */
public class HomePresenter<V extends HomeContract.IHomeView> extends BasePresenter<V> {

    private final HomeModel homeModel;

    public HomePresenter() {
        homeModel = new HomeModel();
    }
    public void requestHomeData(){
        homeModel.RequestHomeData(new HomeContract.IHomeModel.HomeBack() {
            @Override
            public void getHomeData() {
                getView().ShowhomeData();
            }
        });

    }
}