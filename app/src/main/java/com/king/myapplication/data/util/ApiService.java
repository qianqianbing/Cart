package com.king.myapplication.data.util;

import com.king.myapplication.data.Bean.ShowBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者：王自阳
 * on 2020/8/18
 * 13:15
 */
public interface ApiService {
    //    @FormUrlEncoded
//    @POST("movieApi/user/v2/login")
//    Observable<LoginBean> obtainLogin(@Field("email") String email, @Field("pwd") String pwd);
//
//    @FormUrlEncoded
//    @POST("movieApi/user/v2/register")
//    Observable<RegisteBean> obtainRegister(@Field("nickName") String nickName, @Field("pwd") String pwd, @Field("email") String email, @Field("code") String code);
//
//    @FormUrlEncoded
//    @POST("movieApi/user/v2/sendOutEmailCode")
//    Observable<CodeBean> obtainCode(@Field("email") String email);
//
//    @GET("movieApi/movie/v2/findHotMovieList")
//    Observable<PopularmovieBean> obtainPopularmovie(@Query("page") String page, @Query("count") String count);
//
    @GET("movieApi/movie/v2/findComingSoonMovieList")
    Observable<ShowBean> obtainReleased(@Query("page") String page, @Query("count") String count);
//
//    @GET("movieApi/tool/v2/banner")
//    Observable<BannerBean> obtianBanner();
//
//    @GET("movieApi/movie/v2/findReleaseMovieList")
//    Observable<ReleaseBean> obtainRelease(@Query("page") String page, @Query("count") String count);
//
//    @GET("movieApi/movie/v2/findMoviesDetail")
//    Observable<DetailsBean> obtainDetails(@Header("userId") String userId, @Header("sessionId") String sessionId, @Query("movieId") String movieId);
//
//    @FormUrlEncoded
//    @POST("movieApi/user/v1/weChatBindingLogin")
//    Observable<ResponseBody> obtainWexin(@Field("code") String code);
//
//
//    @GET("movieApi/cinema/v1/findRecommendCinemas")
//    Observable<RecommendBean> obtainCinemas(@Header("userId") String userId, @Header("sessionId") String sessionId, @Query("page") String page, @Query("count") String count);
//
//
//    @GET("movieApi/cinema/v1/findNearbyCinemas")
//    Observable<NearBean> obtainNear(@Header("userId") String userId, @Header("sessionId") String sessionId, @Query("page") String page, @Query("count") String count);
//
//    @GET("movieApi/tool/v2/findRegionList")
//    Observable<AreaBean> obtainArea();
//
//    @FormUrlEncoded
//    @POST("movieApi/cinema/v2/findCinemaByRegion")
//    Observable<RegionBean> obtianRegion(@Field("regionId")String regionId);
//
//    @GET("movieApi/movie/v2/findAllMovieComment")
//    Observable<FileBean> obtianFile(@Header("userId") String userId, @Header("sessionId") String sessionId,@Query("movieId")String movieId, @Query("page") String page, @Query("count") String count);
//
//    @FormUrlEncoded
//    @POST("movieApi/movie/v1/verify/movieComment")
//    Observable<ReviewBean> obtainReview(@Header("userId")String userId,@Header("sessionId") String sessionId,@Field("movieId")String movieId,@Field("commentContent")String commentContent,@Field("score")double score);
//
//    @GET("movieApi/movie/v2/findMovieSchedule")
//    Observable<SelectionBean> obtianSelection(@Field("movieId")String movieId,@Field("cinemaId")String cinemaId);
}
