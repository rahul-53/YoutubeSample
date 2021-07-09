package com.example.youtube;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class YoutubeAdapter extends RecyclerView.Adapter<YoutubeViewHolder> {
    private ArrayList<YoutubeModel> youtubeList;
private ItemClickListener itemClickListener;

    public YoutubeAdapter(ArrayList<YoutubeModel> youtubeList, ItemClickListener itemClickListener) {
        this.youtubeList=youtubeList;
        this.itemClickListener=itemClickListener;
    }


    @NonNull
    @Override
    public YoutubeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new YoutubeViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull YoutubeViewHolder holder, int position) {
        YoutubeModel youtubeModel =youtubeList.get(position);
        holder.setData(youtubeModel);

    }

    @Override
    public int getItemCount() {
        return youtubeList.size();
    }
}
