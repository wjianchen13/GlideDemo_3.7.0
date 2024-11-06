package com.example.glidedemo_370;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.GlideModule;

import java.io.InputStream;

import okhttp3.OkHttpClient;

public class MyGlideModule implements GlideModule {

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        Utils.log("MyGlideModule applyOptions");
    }

    @Override
    public void registerComponents(Context context, Glide glide) {
        Utils.log("MyGlideModule registerComponents");
//        glide.register(GlideUrl.class, InputStream.class, new OkHttpGlideUrlLoader.Factory());
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new ProgressInterceptor());
        OkHttpClient okHttpClient = builder.build();
        glide.register(GlideUrl.class, InputStream.class, new OkHttpGlideUrlLoader.Factory(okHttpClient));

    }

}
