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
    @Field("ctime")
    private Date createTime;
    @Field("utime")
    private Date updateTime;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", keyword='" + keyword + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
