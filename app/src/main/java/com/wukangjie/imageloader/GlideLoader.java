package com.wukangjie.imageloader;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;

public class GlideLoader implements ILoaderStrategy {


    private volatile static GlideLoader sGlideLoader;

    public static GlideLoader getGlideLoader(Context context) {
        if (sGlideLoader == null) {
            synchronized (GlideLoader.class) {
                if (sGlideLoader == null) {
                    sGlideLoader = Glide.init(context, GlideBuilder.class);
                }
            }
        }
        return sGlideLoader;
    }

    @Override
    public void loadImage(LoaderOptions options) {

    }

    @Override
    public void clearMemoryCache() {

    }

    @Override
    public void clearDiskCache() {

    }
}
