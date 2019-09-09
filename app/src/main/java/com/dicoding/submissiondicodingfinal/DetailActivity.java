package com.dicoding.submissiondicodingfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.dicoding.submissiondicodingfinal.model.varData;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        varData varData = getIntent().getParcelableExtra("key");

        ImageView imageProgram = findViewById(R.id.img_item_photo);
        TextView tvDataRecievedTitle = findViewById(R.id.tv_item_title);
        TextView titleValue = findViewById(R.id.tv_item_titlevalue);



//        String name = getIntent().getStringExtra(EXTRA_NAME);
//        int year = getIntent().getIntExtra(EXTRA_AGE, 0);
//        String text = "Name : " + name + ",\nYour Age : " + age;
//        tvDataReceived.setText(text);
    }

}
