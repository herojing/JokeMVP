package com.wangjing.jokemvp.ui;

import android.widget.ListView;
import android.widget.TextView;

import com.wangjing.jokemvp.BaseActivity;
import com.wangjing.jokemvp.R;
import com.wangjing.jokemvp.adapter.JokeAdapter;
import com.wangjing.jokemvp.entity.Joke;
import com.wangjing.jokemvp.entity.JokeInfo;
import com.wangjing.jokemvp.presenter.JokePresenter;
import com.wangjing.jokemvp.presenter.impl.JokePresenterImpl;

import java.util.ArrayList;
/**
 * @author wangjing
 * @since 2016/5/20 10:28
 * @version 1.0
 *          <p>
 *          <strong>Features draft description.主要功能介绍</strong>
 *          </p>
 */
public class MainActivity extends BaseActivity implements JokeView {

    // 不做分页加载的操作，所以这两个参数写死
    public static final String  PAGE_NUM           = "1";

    public static final String  PAGE_SIZE          = "20";

    private ListView            mListView;

    private JokePresenter       mJokePresenter     = null;

    private ArrayList<JokeInfo> mJokeInfoArrayList = null;

    private JokeAdapter         mJokeAdapter;

    @Override
    public void initVariables() {
        mJokeInfoArrayList = new ArrayList<>();
        mJokePresenter = new JokePresenterImpl(this);
    }

    @Override
    public void initView() {
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.main_page_joke_lv);
    }

    @Override
    public void loaderData() {
        mJokeAdapter = new JokeAdapter(this, mJokeInfoArrayList);
        mListView.setAdapter(mJokeAdapter);
        //通知 Presenter 加载数据
        mJokePresenter.getJoke(PAGE_NUM, PAGE_SIZE);
    }

    @Override
    public void showLoading() {
        // TODO 显示进度条

    }

    @Override
    public void hideLoading() {
        // TODO 隐藏进度条
    }

    @Override
    public void setJoke(Joke pJoke) {
        if (pJoke != null) {
            Joke.Result result = pJoke.getResult();
            if (result != null) {
                ArrayList<JokeInfo> jokeInfoArrayList = result.getJokeInfoArrayList();
                mJokeInfoArrayList.addAll(jokeInfoArrayList);
                mJokeAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public void showError() {
        TextView errorView = new TextView(this);
        errorView.setTextSize(20);
        errorView.setText("请求失败了");
        mListView.setEmptyView(errorView);
    }
}
