package com.wukangjie.imageloader;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //使用方式
        ImageView imageView = findViewById(R.id.imageview);
        String url = "http://ww2.sinaimg.cn/large/7a8aed7bgw1eutsd0pgiwj20go0p0djn.jpg";
        ImageLoader.getInstance()
                .load(url)
                .angle(80)
                .resize(400, 600)
                .centerCrop()
                .config(Bitmap.Config.RGB_565)
                .placeholder(R.mipmap.test)
                .error(R.mipmap.test)
                .skipLocalCache(true)
                .rotate(0)
                .into(imageView);
    }
}
