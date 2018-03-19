package com.example.lls.zhihudaily.entity.Comment;

/**
 * Created by LLS on 2018/2/26.
 */

public class Comments {

    /**
     * author : 巨型黑娃儿
     * content : 也不算逻辑问题。其实小时候刚刚听说这个玩意的时候我也奇...
     * avatar : http://pic3.zhimg.com/4131a3385c748c9e2d02ab80e29a0c52_im.jpg
     * time : 1479706360
     * id : 27276057
     * likes : 2
     */

    private String author;
    private String content;
    private String avatar;
    private int time;
    private int id;
    private int likes;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

}
