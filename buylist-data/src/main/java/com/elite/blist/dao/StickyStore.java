package com.elite.blist.dao;

import com.elite.blist.domain.Sticky;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wjc133
 * Date: 2016/3/19
 * Time: 10:05
 */
@Repository
public class StickyStore {
    @Autowired
    private MongoTemplate mongoTemplate;

    public Sticky store(Sticky sticky) {
        sticky.setValid(1);
        mongoTemplate.save(sticky);
        return sticky;
    }

    public void remove(Sticky sticky) {
        this.mongoTemplate.updateFirst(new Query(Criteria.where("_id").is(sticky.getId())), new Update().set("valid", 0), Sticky.class);
    }

    public Sticky findOne(String stickyId) {
        return this.mongoTemplate.findOne(new Query(Criteria.where("_id").is(stickyId).and("valid").is(1)), Sticky.class);
    }

    public List<Sticky> findDesireAll() {
        return mongoTemplate.find(new Query(Criteria.where("valid").is(1)), Sticky.class);
    }

    public List<Sticky> findDesire(int offset, int limit) {
        return mongoTemplate.find(new Query(Criteria.where("valid").is(1)).skip(offset).limit(limit), Sticky.class);
    }

    public List<Sticky> findByIds(List<String> ids) {
        return mongoTemplate.find(new Query(Criteria.where("_id").in(ids).and("valid").is(1)), Sticky.class);
    }

    public List<Sticky> findByUid(Long uid) {
        return mongoTemplate.find(new Query(Criteria.where("uid").is(uid).and("valid").is(1)), Sticky.class);
    }

    public List<Sticky> findByUid(Long uid, int limit, int offset) {
        return mongoTemplate.find(new Query(Criteria.where("uid").is(uid).and("valid").is(1)).skip(offset).limit(limit), Sticky.class);
    }
}
