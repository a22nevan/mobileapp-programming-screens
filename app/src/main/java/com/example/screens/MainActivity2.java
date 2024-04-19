package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView3);

        Glide.with(this).load(R.drawable.maxwell).into(imageView);

        Bundle extras = getIntent().getExtras();

        if(extras != null) {

            textView.setText(extras.getString("name"));

        }



    }
}