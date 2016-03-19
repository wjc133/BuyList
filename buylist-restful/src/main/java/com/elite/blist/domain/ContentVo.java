package com.elite.blist.domain;

/**
 * Created by wjc133
 * Date: 2016/3/19
 * Time: 11:28
 */
public class ContentVo {
    private Boolean checked;
    private String msg;
    private Byte type;
    private String keyword;

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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "ContentVo{" +
                "checked=" + checked +
                ", msg='" + msg + '\'' +
                ", type=" + type +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
