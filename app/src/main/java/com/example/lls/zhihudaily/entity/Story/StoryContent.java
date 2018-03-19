package com.example.lls.zhihudaily.entity.Story;

import java.util.List;

/**
 * Created by LLS on 2018/2/23.
 */

public class StoryContent {

    /**
     * body : <div class="main-wrap content-wrap">...</div>
     * image_source : Yestone 邑石网正版图库
     * title : 有办法研制出一种能用于所有流感的疫苗吗？
     * image : https://pic2.zhimg.com/v2-6279e2e23a956c9a5838cdb0654cfbcd.jpg
     * share_url : http://daily.zhihu.com/story/9664757
     * js : []
     * ga_prefix : 022315
     * images : ["https://pic3.zhimg.com/v2-909dc292e0bec9eec4de7325848e4756.jpg"]
     * type : 0
     * id : 9664757
     * css : ["http://news-at.zhihu.com/css/news_qa.auto.css?v=4b3e3"]
     */

    private String body;
    private String image_source;
    private String title;
    private String image;
    private String share_url;
    private String ga_prefix;
    private int type;
    private int id;
    private List<?> js;
    private List<String> images;
    private List<String> css;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImage_source() {
        return image_source;
    }

    public void setImage_source(String image_source) {
        this.image_source = image_source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<?> getJs() {
        return js;
    }

    public void setJs(List<?> js) {
        this.js = js;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getCss() {
        return css;
    }

    public void setCss(List<String> css) {
        this.css = css;
    }
}
