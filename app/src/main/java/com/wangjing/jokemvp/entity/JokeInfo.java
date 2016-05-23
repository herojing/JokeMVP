
package com.wangjing.jokemvp.entity;

/**
 * @author wangjing
 * @since 2016/5/20 10:39
 * @version 1.0
 * <p><strong>Features draft description.主要功能介绍</strong></p>
 */

import com.google.gson.annotations.SerializedName;

/**
 *
 * { "status": "0", "msg": "ok", "result": { "total": "35328", "pagenum": "1",
 * "pagesize": "1", "list": [ { "content":
 * "刚才肚子饿下去吃夜宵，遇见一刚下班的程序猿来吃晚饭，一脸落魄。我坐他旁边跟他说：年轻人，生活总是苦尽甘来有笑有泪的，你看我，我五点半就下班了。",
 * "addtime": "2016-05-19 16:59:40", "url":
 * "http://m.kaixinhui.com/detail-38125.html" } ] } }
 *
 */
public class JokeInfo {

    @SerializedName("content")
    private String mContent;

    @SerializedName("addtime")
    private String mAddTime;


    public String getContent() {
        return mContent;
    }

    public String getAddTime() {
        return mAddTime;
    }
}
