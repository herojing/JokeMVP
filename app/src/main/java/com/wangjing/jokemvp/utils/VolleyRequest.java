package com.wangjing.jokemvp.utils;

/**
 * @author wangjing
 * @since 2016/5/19 15:18
 * @version 1.0
 * <p><strong>Features draft description.主要功能介绍</strong></p>
 */

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

public class VolleyRequest {
    private static RequestQueue mRequestQueue;

    private VolleyRequest() {
    }

    /**
     * @param context ApplicationContext
     */
    public static void buildRequestQueue(Context context) {
        mRequestQueue = Volley.newRequestQueue(context);
        //... do something
    }

    public static VolleyRequest newInstance() {
        if (mRequestQueue == null) {
            throw new NullPointerException("Call buildRequestQueue method first.");
        }
        //...
        return new VolleyRequest();
    }

    /**
     * @param url
     * @param clazz
     * @param listener
     * @param errorListener
     * @return
     */
    public <T> GsonRequest<T> newGsonRequest(String url, Class<T> clazz, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        GsonRequest<T> request = new GsonRequest<T>(url, clazz, listener, errorListener);
        mRequestQueue.add(request);
        return request;
    }
}
