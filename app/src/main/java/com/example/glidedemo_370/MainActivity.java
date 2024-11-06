package com.example.glidedemo_370;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.Target;

public class MainActivity extends AppCompatActivity {

    private String mUrl = "https://img.ayomet.com/upload/room_img/2024-09-17/100691807_1726566456098.jpeg?imageView2/0/w/160/h/160";
    private ImageView imgvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgvTest = findViewById(R.id.imgv_test);
    }

    public void onTest1(View v) {
        Utils.log("MainActivity onTest1");
//        Glide.with(this).load(mUrl).into(imgvTest);
        Glide.with(this)
                .load(mUrl)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
                .into(imgvTest);
    }
}