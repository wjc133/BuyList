package com.elite.blist.domain;

/**
 * Created by wjc133
 * Date: 2016/3/19
 * Time: 11:01
 */
public class ContentCommand {
    private Boolean checked;
    private String msg;

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ContentDto{" +
                "checked=" + checked +
                ", msg='" + msg + '\'' +
                '}';
    }
}
