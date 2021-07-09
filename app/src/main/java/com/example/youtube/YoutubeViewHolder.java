package com.example.youtube;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class YoutubeViewHolder extends RecyclerView.ViewHolder {

    private ImageView mThumbnail;
    private TextView mTvHeading;
    private ItemClickListener itemClickListener;
    private RelativeLayout mRelativeLayout;
    public YoutubeViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener=itemClickListener;
        iniView(itemView);
    }


    private void iniView(View itemView){
        mThumbnail=itemView.findViewById(R.id.ivThumbnail);
        mTvHeading =itemView.findViewById(R.id.tvHeading);

        mRelativeLayout =itemView.findViewById(R.id.relativeLayout);

    }
    public void setData(YoutubeModel youtubeModel) {
        mThumbnail.setImageResource(youtubeModel.getImageId());
        mTvHeading.setText(youtubeModel.getHeading());
        mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(youtubeModel,getAdapterPosition());
            }
        });

    }

}
