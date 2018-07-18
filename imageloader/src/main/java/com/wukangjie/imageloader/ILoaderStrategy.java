package com.wukangjie.imageloader;

public interface ILoaderStrategy {

    /**
     * 将属性赋值给图片
     * @param options
     */
    void loadImage(LoaderOptions options);

    /**
     * 清理内存缓存
     */
    void clearMemoryCache();

    /**
     * 清理磁盘缓存
     */
    void clearDiskCache();

}
