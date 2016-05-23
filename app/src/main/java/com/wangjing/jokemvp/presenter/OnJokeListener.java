package com.wangjing.jokemvp.presenter;

import com.wangjing.jokemvp.entity.Joke;

/**
 * @author wangjing
 * @version 1.0
 *          <p><strong>Features draft description.主要功能介绍</strong></p>
 * @since 2016/5/20 17:03
 */
public interface OnJokeListener {

    /**
     * 成功的时候回调
     * @param pJoke joke
     */
    void  onSuccess(Joke pJoke);

    /**
     * 失败的时候回调
     */
    void  onError();
}
