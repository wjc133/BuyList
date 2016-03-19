package com.elite.blist.mapper;

/**
 * Created by wjc133
 * Date: 2016/3/19
 * Time: 13:10
 */

import com.elite.blist.domain.Content;
import com.elite.blist.domain.ContentVo;
import com.google.common.collect.Lists;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

@Mapper
public abstract class ContentsMap {
    @Contents
    public List<ContentVo> map(List<Content> value) {
        List<ContentVo> vos = Lists.newArrayList();
        for (Content content : value) {
            ContentVo vo = new ContentVo();
            vo.setChecked(content.isChecked());
            vo.setMsg(content.getMessage());
            vo.setType(content.getType());
            vo.setKeyword(content.getKeyword());
            vos.add(vo);
        }
        return vos;
    }

    @Mappings({
            @Mapping(target = "msg", source = "content.message"),
            @Mapping(target = "checked", source = "content.checked"),
            @Mapping(target = "type", source = "content.type"),
            @Mapping(target = "keyword", source = "content.keyword")
    })
    public abstract ContentVo toContentVo(Content content);


    @Qualifier
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface ContentsTranslator {
    }

    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Contents {
    }
}
