package com.liu.yuedu.pojo;

import java.util.Date;

/**
 * 用户
 */
public class YueduMembers {
    private Integer u_id;

    private String u_openid;

    private String u_name;

    private String u_face;

    private String u_random;

    private Integer u_integral;

    private Integer u_remainder;

    private Date u_regtime;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_openid() {
        return u_openid;
    }

    public void setU_openid(String u_openid) {
        this.u_openid = u_openid == null ? null : u_openid.trim();
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name == null ? null : u_name.trim();
    }

    public String getU_face() {
        return u_face;
    }

    public void setU_face(String u_face) {
        this.u_face = u_face == null ? null : u_face.trim();
    }

    public String getU_random() {
        return u_random;
    }

    public void setU_random(String u_random) {
        this.u_random = u_random == null ? null : u_random.trim();
    }

    public Integer getU_integral() {
        return u_integral;
    }

    public void setU_integral(Integer u_integral) {
        this.u_integral = u_integral;
    }

    public Integer getU_remainder() {
        return u_remainder;
    }

    public void setU_remainder(Integer u_remainder) {
        this.u_remainder = u_remainder;
    }

    public Date getU_regtime() {
        return u_regtime;
    }

    public void setU_regtime(Date u_regtime) {
        this.u_regtime = u_regtime;
    }
}