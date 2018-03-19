package com.example.lls.zhihudaily.util;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by LLS on 2018/3/1.
 */

public class ApiService {

    private static final String url="https://news-at.zhihu.com/";

    private static Retrofit retrofit=new Retrofit.Builder().baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

    public static Api create(){
        return retrofit.create(Api.class);
    }

}
