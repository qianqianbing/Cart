package com.king.myapplication.data.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者：Administrator
 * on 2020/8/18
 * 13:16
 */
public class HttpUtils {

    private final Retrofit mRetrfit;
    private static HttpUtils utils;
    private ConnectivityManager manager;
    private NetworkInfo info;

    public HttpUtils() {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();
        mRetrfit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Api.BaseUrl)
                .build();
    }

    public static final synchronized HttpUtils getHttputils() {
        if (utils != null) {
            utils = new HttpUtils();
        }
        return utils;
    }

    public boolean isNetwork(Context context) {
        manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        info = manager.getActiveNetworkInfo();
        if (info != null) {
            return info.isConnected();
        }
        return false;
    }

    public <T> T getService(Class<T> tClass) {
        return mRetrfit.create(tClass);
    }
}
