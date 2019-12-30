package com.liu.yuedu.pojo;

import java.util.Date;

public class YueduArticles {
    private Integer art_id;

    private Integer art_cate;

    private String art_title;

    private Integer art_uid;

    private Date art_createtime;

    private String art_content;

    @Override
    public String toString() {
        return "YueduArticles{" +
                "art_id=" + art_id +
                ", art_cate=" + art_cate +
                ", art_title='" + art_title + '\'' +
                ", art_uid=" + art_uid +
                ", art_createtime=" + art_createtime +
                ", art_content='" + art_content + '\'' +
                '}';
    }

    public Integer getArt_id() {
        return art_id;
    }

    public void setArt_id(Integer art_id) {
        this.art_id = art_id;
    }

    public Integer getArt_cate() {
        return art_cate;
    }

    public void setArt_cate(Integer art_cate) {
        this.art_cate = art_cate;
    }

    public String getArt_title() {
        return art_title;
    }

    public void setArt_title(String art_title) {
        this.art_title = art_title == null ? null : art_title.trim();
    }

    public Integer getArt_uid() {
        return art_uid;
    }

    public void setArt_uid(Integer art_uid) {
        this.art_uid = art_uid;
    }

    public Date getArt_createtime() {
        return art_createtime;
    }

    public void setArt_createtime(Date art_createtime) {
        this.art_createtime = art_createtime;
    }

    public String getArt_content() {
        return art_content;
    }

    public void setArt_content(String art_content) {
        this.art_content = art_content == null ? null : art_content.trim();
    }
}