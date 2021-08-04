package com.example.appdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et_add_text = findViewById(R.id.et_add_text);
        Button btn = findViewById(R.id.btn);
        Button btn_view_page = findViewById(R.id.btn_view_page);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getData = et_add_text.getText().toString();
                AppData.demo_data = getData;
            }
        });

        btn_view_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShowData.class);
                startActivity(i);
            }
        });
    }
}