package com.king.myapplication.di.homeMvp;

import com.king.myapplication.data.Bean.BannerBean;
import com.king.myapplication.data.Bean.ShowBean;

/**
 * 作者：Administrator
 * on 2020/8/18
 * 13:28
 */
public interface HomeContract {
    public interface IHomeView {
        public void ShowhomeData(ShowBean showBean);
        public void BannerData(BannerBean bannerBean);
    }

    public interface IhomePresenter {
        public void Attech();

        public void Deatch();
    }

    public interface IHomeModel {
        public void RequestHomeData(String page, String count, HomeBack homeBack);

        public interface HomeBack {
            void getHomeData(ShowBean showBean);
        }
        public void RequestbannerData(BannerBack bannerBack);

        public interface BannerBack {
            void getBannerData(BannerBean bannerBean);
        }
    }
}
