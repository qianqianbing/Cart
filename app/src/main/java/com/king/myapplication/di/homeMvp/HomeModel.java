package com.king.myapplication.di.homeMvp;

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

    @Override
    public void RequestHomeData(String page, String count, HomeBack homeBack) {
        HttpUtils utils = new HttpUtils();
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
}
