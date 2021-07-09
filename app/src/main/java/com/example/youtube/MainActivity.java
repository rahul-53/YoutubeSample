package com.example.youtube;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    ArrayList<YoutubeModel> youtubeList =new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniView();
        buildList();
        setRecyclerView();
    }
    private void buildList(){
        for (int i=0;i<15;i++) {
            YoutubeModel youtubeModel1 = new YoutubeModel("Elon Musk - CEO of Tesla Motors and SpaceX | Entrepreneurship | Khan Academy", R.drawable.musk);
            youtubeList.add(youtubeModel1);
        }

    }

    private void setRecyclerView() {
        YoutubeAdapter youtubeAdapter =new YoutubeAdapter(youtubeList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(youtubeAdapter);
    }

    private void iniView(){
                recyclerView=findViewById(R.id.recyclerView);
    }
    @Override
    public void onItemClicked(YoutubeModel model, int position){
        Intent intent = new  Intent(Intent.ACTION_VIEW);
        intent.setPackage("com.google.android.youtube");
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=vDwzmJpI4io&ab_channel=KhanAcademy"));

        startActivity(intent);
    }
}