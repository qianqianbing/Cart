package com.king.myapplication.di.homeMvp;

import com.king.myapplication.data.Bean.ShowBean;

/**
 * 作者：Administrator
 * on 2020/8/18
 * 13:28
 */
public interface HomeContract {
    public interface IHomeView{
        public void ShowhomeData(ShowBean showBean);
    }
    public interface IhomePresenter{
        public void Attech();
        public void Deatch();
    }
    public interface IHomeModel{
        public void RequestHomeData(String page,String count,HomeBack homeBack);
        public interface HomeBack{
            void getHomeData(ShowBean showBean);
        }
    }
}
