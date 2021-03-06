package com.elite.blist.domain;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * Created by wjc133
 * Date: 2016/3/18
 * Time: 23:31
 */
public class Content {
    @Field("checked")
    private boolean checked;
    @Field("type")
    private Byte type;
    @Field("keyword")
    private String keyword;
    @Field("msg")
    private String message;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Content{" +
                "checked=" + checked +
                ", type=" + type +
                ", keyword='" + keyword + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
