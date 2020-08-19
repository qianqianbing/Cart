package com.king.myapplication.data.Bean;

import com.stx.xhb.xbanner.entity.SimpleBannerInfo;

import java.util.List;

/**
 * 作者：Administrator
 * on 2020/8/19
 * 19:25
 */
public class BannerBean {


    /**
     * result : [{"imageUrl":"http://mobile.bwstudent.com/images/movie/stills/whwdzg/whwdzg1_h.jpg","jumpUrl":"wd://movie?movieId=23","rank":1},{"imageUrl":"http://mobile.bwstudent.com/images/movie/stills/zgjz/zgjz1_h.jpg","jumpUrl":"wd://movie?movieId=24","rank":2},{"imageUrl":"http://mobile.bwstudent.com/images/movie/stills/pdz/pdz1_h.jpg","jumpUrl":"wd://movie?movieId=25","rank":3},{"imageUrl":"http://mobile.bwstudent.com/images/movie/stills/sndn/sndn1_h.jpg","jumpUrl":"wd://movie?movieId=22","rank":4},{"imageUrl":"http://mobile.bwstudent.com/images/movie/stills/dwsj/dwsj1_h.jpg","jumpUrl":"wd://movie?movieId=10","rank":5}]
     * message : 查询成功
     * status : 0000
     */

    public String message;
    public String status;
    public List<ResultBean> result;

    public static class ResultBean extends SimpleBannerInfo {
        /**
         * imageUrl : http://mobile.bwstudent.com/images/movie/stills/whwdzg/whwdzg1_h.jpg
         * jumpUrl : wd://movie?movieId=23
         * rank : 1
         */

        public String imageUrl;
        public String jumpUrl;
        public int rank;

        @Override
        public Object getXBannerUrl() {
            return imageUrl;
        }
    }
}
