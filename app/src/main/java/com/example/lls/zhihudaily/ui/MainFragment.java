package com.example.lls.zhihudaily.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.lls.zhihudaily.R;
import com.example.lls.zhihudaily.adapter.StoryListAdopter;
import com.example.lls.zhihudaily.entity.Story.LatestNews;
import com.example.lls.zhihudaily.entity.Story.Stories;
import com.example.lls.zhihudaily.ui.base.BaseFragment;
import com.example.lls.zhihudaily.util.Api;
import com.example.lls.zhihudaily.util.ApiService;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by LLS on 2018/3/1.
 */

public class MainFragment extends BaseFragment{

    private RecyclerView recyclerView;

    private List<Stories> storiesList=new ArrayList<>();
    private StoryListAdopter storyListAdopter;

    private static final String TAG = "MainFragment";

    @Override
    protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        recyclerView=(RecyclerView)view.findViewById(R.id.main_recycle_item);
        recyclerView.setLayoutManager(new LinearLayoutManager(getRootActivity()));
        return view;
    }

    @Override
    protected void initData() {
        Api api=ApiService.create();
        api.getLatest()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LatestNews>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d(TAG,"onSubscribe");
                    }

                    @Override
                    public void onNext(LatestNews latestNews) {
                        storiesList=latestNews.getStories();
                        storyListAdopter=new StoryListAdopter(storiesList);
                        recyclerView.setAdapter(storyListAdopter);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError");
                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "onComplete");
                    }
                });
    }

}
