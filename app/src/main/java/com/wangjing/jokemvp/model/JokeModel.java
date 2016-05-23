
package com.wangjing.jokemvp.model;

import com.wangjing.jokemvp.presenter.OnJokeListener;

/**
 * @author wangjing
 * @since 2016/5/20 16:57
 * @version 1.0
 *          <p>
 *          <strong>Features draft description.主要功能介绍</strong>
 *          </p>
 */
public interface JokeModel {

    /**
     * 获取笑话内容
     * 
     * @param pNum   请求哪一页
     *
     * @param pSize    每页返回多少条
     *
     * @param pOnJokeListener    回调监听
     *
     */
    void getJoke(String pNum, String pSize, OnJokeListener pOnJokeListener);

}
