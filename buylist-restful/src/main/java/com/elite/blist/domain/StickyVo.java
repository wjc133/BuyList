package com.elite.blist.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by wjc133
 * Date: 2016/3/19
 * Time: 11:09
 */
public class StickyVo {
    private String id;
    private Long uid;
    private String title;
    private Date lastModify;
    private String coverUrl;
    private List<ContentVo> messages;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    public List<ContentVo> getMessages() {
        return messages;
    }

    public void setMessages(List<ContentVo> messages) {
        this.messages = messages;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    @Override
    public String toString() {
        return "StickyVo{" +
                "id='" + id + '\'' +
                ", uid=" + uid +
                ", title='" + title + '\'' +
                ", lastModify=" + lastModify +
                ", coverUrl='" + coverUrl + '\'' +
                ", messages=" + messages +
                '}';
    }
}
