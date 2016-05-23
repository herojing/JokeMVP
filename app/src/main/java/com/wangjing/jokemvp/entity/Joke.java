
package com.wangjing.jokemvp.entity;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * @author wangjing
 * @since 2016/5/20 10:39
 * @version 1.0
 *          <p>
 *          <strong>Features draft description.主要功能介绍</strong>
 *          </p>
 */
public class Joke {

    @SerializedName("msg")
    private String msg;

    @SerializedName("status")
    private String status;

    @SerializedName("result")
    private Result mResult;

    public Result getResult() {
        return mResult;
    }


    public class Result {
        /**
         * "total": "35328", "pagenum": "1", "pagesize": "6", "list": []
         */
        @SerializedName("total")
        private int                 total;

        @SerializedName("pagenum")
        private int                 pageNum;

        @SerializedName("pagesize")
        private int                 pageSize;

        @SerializedName("list")
        private ArrayList<JokeInfo> mJokeInfoArrayList = new ArrayList<>();


        public ArrayList<JokeInfo> getJokeInfoArrayList() {
            return mJokeInfoArrayList;
        }
    }

}
