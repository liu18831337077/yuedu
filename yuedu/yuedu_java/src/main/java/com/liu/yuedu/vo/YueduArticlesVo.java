package com.liu.yuedu.vo;

import com.liu.yuedu.pojo.YueduArticles;

/**
 * 文章的视图对象，扩展了作者的姓名和头像
 */
public class YueduArticlesVo extends YueduArticles {

    private String u_face;
    private String u_name;

    public String getU_face() {
        return u_face;
    }

    public void setU_face(String u_face) {
        this.u_face = u_face;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }
}
