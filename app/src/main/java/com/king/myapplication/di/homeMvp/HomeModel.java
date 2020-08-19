package com.king.myapplication.di.homeMvp;

import com.king.myapplication.data.Bean.BannerBean;
import com.king.myapplication.data.Bean.ShowBean;
import com.king.myapplication.data.util.ApiService;
import com.king.myapplication.data.util.HttpUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者：Administrator
 * on 2020/8/18
 * 14:32
 */
public class HomeModel implements HomeContract.IHomeModel {

    private HttpUtils utils;

    @Override
    public void RequestHomeData(String page, String count, HomeBack homeBack) {
        utils = new HttpUtils();
        ApiService service = utils.getService(ApiService.class);
        service.obtainReleased(page, count)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<ShowBean>() {
                    @Override
                    public void accept(ShowBean showBean) throws Exception {
                        homeBack.getHomeData(showBean);
                    }
                });
    }

    @Override
    public void RequestbannerData(BannerBack bannerBack) {
        ApiService apiService = utils.getService(ApiService.class);
        apiService.obtianBanner()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<BannerBean>() {
                    @Override
                    public void accept(BannerBean bannerBean) throws Exception {
                        bannerBack.getBannerData(bannerBean);
                    }
                });
    }
}
