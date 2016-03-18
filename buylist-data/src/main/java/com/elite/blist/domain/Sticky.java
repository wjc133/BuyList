package com.elite.blist.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * Created by wjc133
 * Date: 2016/3/18
 * Time: 23:28
 */
@Document(collection = "stickies")
public class Sticky {
    @Id
    private String id;
    @Field("uid")
    private Long uid;
    @Field("content")
    private Content content;
    @Field("ctime")
    private Date createTime;
    @Field("utime")
    private Date updateTime;
    @Field("cover_url")
    private String coverUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
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

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    @Override
    public String toString() {
        return "Sticky{" +
                "id='" + id + '\'' +
                ", uid=" + uid +
                ", content=" + content +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", coverUrl='" + coverUrl + '\'' +
                '}';
    }
}
