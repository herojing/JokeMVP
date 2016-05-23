
package com.wangjing.jokemvp.model.impl;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.wangjing.jokemvp.entity.Joke;
import com.wangjing.jokemvp.model.JokeModel;
import com.wangjing.jokemvp.presenter.OnJokeListener;
import com.wangjing.jokemvp.utils.VolleyRequest;

/**
 * @author wangjing
 * @since 2016/5/20 16:58
 * @version 1.0
 * <p><strong>Features draft description.主要功能介绍</strong></p>
 */
public class JokeModelImpl implements JokeModel {


    public static final String REQUEST_SERVER_URL="http://api.jisuapi.com/xiaohua/text?";

    public static final String APPKEY="&appkey=9814b57c706d0a23";

    //http://api.jisuapi.com/xiaohua/text?pagenum=10&pagesize=3&appkey=9814b57c706d0a23
    @Override
    public void getJoke(String pNum, String pSize, final OnJokeListener pOnJokeListener) {

        VolleyRequest.newInstance().newGsonRequest(REQUEST_SERVER_URL+"pagenum="+pNum+"&"+"pagesize="+pSize+"&sort=addtime"+APPKEY,
                Joke.class, new Response.Listener<Joke>() {
                    @Override
                    public void onResponse(Joke pJoke) {
                        if (pJoke != null) {
                            pOnJokeListener.onSuccess(pJoke);
                        } else {
                            pOnJokeListener.onError();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        pOnJokeListener.onError();
                    }
                });
    }
}
