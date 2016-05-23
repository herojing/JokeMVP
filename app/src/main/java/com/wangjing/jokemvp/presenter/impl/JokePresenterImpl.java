
package com.wangjing.jokemvp.presenter.impl;

import com.wangjing.jokemvp.entity.Joke;
import com.wangjing.jokemvp.model.JokeModel;
import com.wangjing.jokemvp.model.impl.JokeModelImpl;
import com.wangjing.jokemvp.presenter.JokePresenter;
import com.wangjing.jokemvp.presenter.OnJokeListener;
import com.wangjing.jokemvp.ui.JokeView;

/**
 * @author wangjing
 * @since 2016/5/20 17:12
 * @version 1.0
 *          <p>
 *          <strong>Features draft description.主要功能介绍</strong>
 *          </p>
 */
public class JokePresenterImpl implements JokePresenter, OnJokeListener {

    // P层作为M层和V层的衔接者，需要持有JokeView和JokeModel的引用

    private JokeModel mJokeModel = new JokeModelImpl();

    private JokeView  mJokeView;

    public JokePresenterImpl(JokeView jokeView) {
        mJokeView = jokeView;
    }

    /**
     * 调用M层取数据
     * 
     * @param pNum
     * @param pSize
     */
    @Override
    public void getJoke(String pNum, String pSize) {
        mJokeView.showLoading();
        mJokeModel.getJoke(pNum, pSize, this);

    }

    @Override
    public void onSuccess(Joke pJoke) {
        mJokeView.setJoke(pJoke);
    }

    @Override
    public void onError() {
        mJokeView.showError();
    }
}
