package com.example.timestableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

private ListView listView;

private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar=findViewById(R.id.seekbar);
        listView=findViewById(R.id.listView1);



        seekBar.setMax(20);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            seekBar.setMin(1);
        }

        ListViewAdaptor listViewAdaptor=new ListViewAdaptor(getApplicationContext(),1);
        listView.setAdapter(listViewAdaptor);

        List<String> list=new ArrayList<>();
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


               ListViewAdaptor listViewAdaptor=new ListViewAdaptor(getApplicationContext(),i);
               listView.setAdapter(listViewAdaptor);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}