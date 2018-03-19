package com.example.lls.zhihudaily.util;

import com.example.lls.zhihudaily.entity.Story.LatestNews;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by LLS on 2018/3/1.
 */

public interface Api {

    @GET("api/4/news/latest")
    Observable<LatestNews> getLatest();

}
