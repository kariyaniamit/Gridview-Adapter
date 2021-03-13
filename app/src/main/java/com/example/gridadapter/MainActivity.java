package com.example.gridadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
GridView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=(GridView)findViewById(R.id.Countrygrid);
        gv.setAdapter(new ImageAdapter(this));
        //final ImageAdapter imageAdapter=new ImageAdapter(this);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =new Intent(getApplicationContext(),Detailview.class);
                intent.putExtra("id",i);
                startActivity(intent);
              //Toast.makeText(getApplicationContext(), "Image of"+i, Toast.LENGTH_SHORT).show();
            }
        });

    }
}