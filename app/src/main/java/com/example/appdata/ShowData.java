package com.example.appdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        TextView tv_show_data = findViewById(R.id.tv_show_data);
        tv_show_data.setText(AppData.demo_data);
    }
}