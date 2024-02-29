package com.example.timestableapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class ListViewAdaptor extends BaseAdapter
{
    LayoutInflater inflater;

int value;
    public  ListViewAdaptor(Context context,int value){

        inflater=LayoutInflater.from(context);
        this.value=value;
    }



    @Override
    public int getCount() {
        return 10;
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
    public View getView(int i, View view, ViewGroup viewGroup)
    {

        view=inflater.inflate(R.layout.listview,null);
        int j=i+1;
         TextView text=view.findViewById(R.id.textview);
        text.setText(""+value*j);
        return view;
    }
}
