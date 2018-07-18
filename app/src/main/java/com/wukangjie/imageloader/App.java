package com.wukangjie.imageloader;

import android.app.Application;

public class App extends Application {
    public static App gApp;

    @Override
    public void onCreate() {
        super.onCreate();
        gApp = this;
        //初始化图片库
        ImageLoader.getInstance().setGlobalImageLoader(new PicassoLoader());
    }
}
