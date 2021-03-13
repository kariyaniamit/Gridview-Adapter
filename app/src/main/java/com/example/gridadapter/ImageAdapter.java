package com.example.gridadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class ImageAdapter extends BaseAdapter {
    Context mContext;
    Integer[] CountryImages={
            R.drawable.argentina,
            R.drawable.aus,
            R.drawable.banglades,
            R.drawable.bhutan,
            R.drawable.eng,
            R.drawable.in,
            R.drawable.pk,
    };
    public ImageAdapter(Context c) {
        mContext=c;
    }

    @Override
    public int getCount() {
        return CountryImages.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if(view==null)
        {
            imageView=new ImageView(mContext);
            imageView.setPadding(5,5,5,0);
            imageView.setLayoutParams(new GridView.LayoutParams(100,70));
        }
        else
        {
            imageView=(ImageView)view;
        }
        imageView.setImageResource(CountryImages[i]);
        return imageView;
    }
}
