package com.elite.blist.web;

import com.elite.blist.domain.StickyCommand;
import com.elite.blist.domain.StickyVo;
import com.elite.blist.service.StickyService;
import com.elite.blist.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by wjc133
 * Date: 2016/3/18
 * Time: 23:49
 */
@Controller
@RequestMapping("/")
public class StickyController {
    @Autowired
    private StickyService stickyService;
    @Autowired
    private UserService userService;

    private static final Logger LOG = LoggerFactory.getLogger(StickyController.class);

    @RequestMapping(value = "sticky", method = RequestMethod.POST)
    @ResponseBody
    public StickyVo saveSticky(@RequestBody StickyCommand command) {
        LOG.info("saveSticky invoked... ticket={}", command.getTicket());
        long uid = userService.authTicket(command.getTicket());
        return stickyService.saveSticky(uid, command.getTitle(), command.getMessages());
    }

    @RequestMapping(value = "sticky", method = RequestMethod.GET)
    @ResponseBody
    public List<StickyVo> getStickys(String ticket, Integer limit, Integer offset) {
        LOG.info("getSticky invoked... ticket={}, limit={}, offset={}", ticket, limit, offset);
        long uid = userService.authTicket(ticket);
        return stickyService.queryStickys(uid, limit, offset);
    }
}
