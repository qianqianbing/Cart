package com.king.myapplication.di.homeMvp;

/**
 * 作者：Administrator
 * on 2020/8/18
 * 13:28
 */
public interface HomeContract {
    public interface IHomeView{
        public void ShowhomeData();
    }
    public interface IhomePresenter{
        public void Attech();
        public void Deatch();
    }
    public interface IHomeModel{
        public void RequestHomeData(HomeBack homeBack);
        public interface HomeBack{
            void getHomeData();
        }
    }
}
