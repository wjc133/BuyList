package com.elite.blist.mapper;

import com.elite.blist.domain.Sticky;
import com.elite.blist.domain.StickyVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Created by wjc133
 * Date: 2016/3/19
 * Time: 12:55
 */
@Mapper(uses = ContentsMap.class)
public interface StickyMap {
    @Mappings({
            @Mapping(target = "lastModify", source = "sticky.updateTime"),
            @Mapping(target = "messages", source = "sticky.contents",
                    qualifiedBy = {ContentsMap.ContentsTranslator.class, ContentsMap.Contents.class})
    })
    StickyVo poToVo(Sticky sticky);
}
