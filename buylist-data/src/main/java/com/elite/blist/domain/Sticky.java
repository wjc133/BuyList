package com.elite.blist.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

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
    @Field("title")
    private String title;
    @Field("contents")
    private List<Content> contents;
    @Field("ctime")
    private Date createTime;
    @Field("utime")
    private Date updateTime;
    @Field("cover_url")
    private String coverUrl;
    @Field("valid")
    private int valid;

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

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> content) {
        this.contents = content;
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

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Sticky{" +
                "id='" + id + '\'' +
                ", uid=" + uid +
                ", title='" + title + '\'' +
                ", contents=" + contents +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", coverUrl='" + coverUrl + '\'' +
                ", valid=" + valid +
                '}';
    }
}
