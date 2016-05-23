package com.wangjing.jokemvp;

import android.app.Application;

import com.wangjing.jokemvp.utils.VolleyRequest;

/**
 * @author wangjing
 * @since 2016/5/19 16:46
 * @version 1.0
 * <p><strong>Features draft description.主要功能介绍</strong></p>
 */
public class JokeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        VolleyRequest.buildRequestQueue(this);
    }
}
