package com.example.gridadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Detailview extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailview);
        imageView=(ImageView)findViewById(R.id.imageView);
        Intent i=getIntent();
        int position=i.getExtras().getInt("id");
        ImageAdapter imageAdapter=new ImageAdapter(this);
        imageView.setImageResource(imageAdapter.CountryImages[position]);
    }
}