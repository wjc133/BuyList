package com.elite.blist.domain;

import java.util.List;

/**
 * Created by wjc133
 * Date: 2016/3/19
 * Time: 10:53
 */
public class StickyCommand {
    private String ticket;
    private String title;
    private List<ContentCommand> messages;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public List<ContentCommand> getMessages() {
        return messages;
    }

    public void setMessages(List<ContentCommand> messages) {
        this.messages = messages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "StickyCommand{" +
                "ticket='" + ticket + '\'' +
                ", title='" + title + '\'' +
                ", messages=" + messages +
                '}';
    }
}
