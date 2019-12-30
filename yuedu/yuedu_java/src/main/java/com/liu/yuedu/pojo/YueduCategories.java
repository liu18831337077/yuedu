package com.liu.yuedu.pojo;

/**
 * 文章分组
 */
public class YueduCategories {
    private Integer cate_id;

    private Integer cate_pid;

    private String cate_name;

    private Integer cate_order;

    public Integer getCate_id() {
        return cate_id;
    }

    public void setCate_id(Integer cate_id) {
        this.cate_id = cate_id;
    }

    public Integer getCate_pid() {
        return cate_pid;
    }

    public void setCate_pid(Integer cate_pid) {
        this.cate_pid = cate_pid;
    }

    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name == null ? null : cate_name.trim();
    }

    public Integer getCate_order() {
        return cate_order;
    }

    public void setCate_order(Integer cate_order) {
        this.cate_order = cate_order;
    }
}