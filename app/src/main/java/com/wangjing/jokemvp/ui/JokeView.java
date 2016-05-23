package com.wangjing.jokemvp.ui;

import com.wangjing.jokemvp.entity.Joke;

/**
 * @author wangjing
 * @since 2016/5/20 16:59
 * @version 1.0
 *          <p>
 *          <strong>Features draft description.主要功能介绍</strong>
 *          </p>
 */
public interface JokeView {

    void showLoading();

    void hideLoading();

    void setJoke(Joke pJoke);

    void showError();
}
