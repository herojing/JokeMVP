
package com.wangjing.jokemvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wangjing.jokemvp.R;
import com.wangjing.jokemvp.entity.JokeInfo;

import java.util.ArrayList;

/**
 * @author wangjing
 * @since 2016/5/20 17:28
 * @version 1.0
 *          <p>
 *          <strong>Features draft description.主要功能介绍</strong>
 *          </p>
 */
public class JokeAdapter extends BaseAdapter {

    private Context             mContext;

    private ArrayList<JokeInfo> mJokeInfoArrayList;

    public JokeAdapter(Context context, ArrayList<JokeInfo> jokeInfoArrayList) {
        mContext = context;
        mJokeInfoArrayList = jokeInfoArrayList;
    }

    @Override
    public int getCount() {
        return mJokeInfoArrayList == null ? 0 : mJokeInfoArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ret = null;
        if (convertView == null) {
            ret = LayoutInflater.from(mContext).inflate(R.layout.main_page_list_item, parent, false);
        }else {
            ret=convertView;
        }
        ViewHolder holder = (ViewHolder) ret.getTag();
        if(holder==null){
            holder=new ViewHolder(ret);
            ret.setTag(holder);
        }
        holder.setUI(mJokeInfoArrayList.get(position));

        return ret;
    }

    public static class ViewHolder {

        private TextView mJokeContent;

        private TextView mAddTime;

        public ViewHolder(View pView) {
            mJokeContent = (TextView) pView.findViewById(R.id.joke_content);
            mAddTime = (TextView) pView.findViewById(R.id.add_time);
        }

        public void setUI(JokeInfo pJokeInfo) {
            mJokeContent.setText(pJokeInfo.getContent());
            mAddTime.setText(pJokeInfo.getAddTime());
        }
    }
}
