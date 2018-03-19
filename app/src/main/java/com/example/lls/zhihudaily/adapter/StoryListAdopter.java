package com.example.lls.zhihudaily.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lls.zhihudaily.R;
import com.example.lls.zhihudaily.entity.Story.LatestNews;
import com.example.lls.zhihudaily.entity.Story.Stories;

import java.util.List;

/**
 * Created by LLS on 2018/2/28.
 */

public class StoryListAdopter extends RecyclerView.Adapter<StoryListAdopter.ViewHolder>{

    private Context context;
    private List<Stories> storiesList;

    public StoryListAdopter(List<Stories> stories){
        this.storiesList =stories;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView textView;
        ImageView imageView;

        public ViewHolder(View view){
            super(view);
            cardView=(CardView)view;
            textView=(TextView)view.findViewById(R.id.story_title);
            imageView=(ImageView)view.findViewById(R.id.story_image);
        }

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(context==null){
            context=parent.getContext();
        }
        View view= LayoutInflater.from(context).inflate(R.layout.main_card_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Stories stories=storiesList.get(position);
        holder.textView.setText(stories.getTitle());
        Glide.with(context).load(stories.getImages().get(0)).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return storiesList.size();
    }
}
