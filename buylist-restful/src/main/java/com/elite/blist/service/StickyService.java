package com.elite.blist.service;

import com.elite.blist.builder.StickyBuilder;
import com.elite.blist.dao.StickyStore;
import com.elite.blist.domain.Content;
import com.elite.blist.domain.ContentCommand;
import com.elite.blist.domain.Sticky;
import com.elite.blist.domain.StickyVo;
import com.elite.blist.mapper.StickyMap;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by wjc133
 * Date: 2016/3/19
 * Time: 10:46
 */
@Service
public class StickyService {
    @Autowired
    private StickyStore stickyStore;
    @Autowired
    private StickyMap stickyMap;

    public StickyVo saveSticky(long uid, String title, List<ContentCommand> messages) {
        List<Content> contents = Lists.newArrayList();
        for (ContentCommand message : messages) {
            Content content = new Content();
            content.setChecked(message.getChecked());
            content.setMessage(message.getMsg());
            content.setKeyword(getKeyword(message.getMsg()));
            content.setType(getType(message.getMsg()));
            contents.add(content);
        }
        Sticky sticky = new StickyBuilder().uid(uid).title(title)
                .ctime(new Date()).utime(new Date()).coverUrl("")
                .contents(contents).build();
        Sticky result = stickyStore.store(sticky);
        return stickyMap.poToVo(result);
    }

    private Byte getType(String msg) {
        return null;
    }

    private String getKeyword(String msg) {
        return null;
    }

    public List<StickyVo> queryStickys(long uid, Integer limit, Integer offset) {
        List<Sticky> stickies = stickyStore.findByUid(uid, limit, offset);
        List<StickyVo> vos = Lists.newArrayList();
        for (Sticky sticky : stickies) {
            vos.add(stickyMap.poToVo(sticky));
        }
        return vos;
    }
}
