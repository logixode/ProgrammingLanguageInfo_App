package com.dicoding.submissiondicodingfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        TextView tvDataRecievedTitle = findViewById(R.id.tv_item_title);

//        String name = getIntent().getStringExtra(EXTRA_NAME);
//        int year = getIntent().getIntExtra(EXTRA_AGE, 0);
//        String text = "Name : " + name + ",\nYour Age : " + age;
//        tvDataReceived.setText(text);
    }

}
