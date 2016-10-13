package com.jiguang.jbox.data;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Message")
public class Message extends Model {

    @Column(name = "Title")
    public String title;

    @Column(name = "Content")
    public String content;

    @Column(name = "Time")
    public long time;

    @Column(name = "DevKey")
    public String devKey;

    @Column(name = "Channel")
    public String channelName;

    public Message() {
        super();
    }

    public Message(String devKey, String channelName, String title, String content, long time) {
        super();
        this.devKey = devKey;
        this.channelName = channelName;
        this.title = title;
        this.content = content;
        this.time = time;
    }

}
