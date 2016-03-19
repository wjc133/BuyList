package com.elite.blist.builder;

import com.elite.blist.domain.Content;
import com.elite.blist.domain.Sticky;

import java.util.Date;
import java.util.List;

/**
 * Created by wjc133
 * Date: 2016/3/19
 * Time: 11:12
 */
public class StickyBuilder {
    private Sticky sticky;

    public StickyBuilder() {
        sticky = new Sticky();
    }

    public StickyBuilder uid(long uid) {
        sticky.setUid(uid);
        return this;
    }

    public StickyBuilder title(String title) {
        sticky.setTitle(title);
        return this;
    }

    public StickyBuilder ctime(Date ctime) {
        sticky.setCreateTime(ctime);
        return this;
    }

    public StickyBuilder utime(Date utime) {
        sticky.setUpdateTime(utime);
        return this;
    }

    public StickyBuilder coverUrl(String coverUrl) {
        sticky.setCoverUrl(coverUrl);
        return this;
    }

    public StickyBuilder contents(List<Content> contents) {
        sticky.setContents(contents);
        return this;
    }

    public Sticky build() {
        return sticky;
    }
}
