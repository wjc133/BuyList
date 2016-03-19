package com.elite.blist.service;

import org.springframework.stereotype.Service;

/**
 * Created by wjc133
 * Date: 2016/3/19
 * Time: 11:05
 */
@Service
public class UserService {
    public long authTicket(String ticket) {
        return Long.parseLong(ticket);
    }
}
