package com.journaldev.androidrssfeedtutorial;


public class RSSItem {

    public String title;
    public String link;
    public String description;
    public String pubdate;
    public String guid;
    public String image;




    public RSSItem(String title, String link, String description, String pubdate, String guid,String image) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubdate = pubdate;
        this.guid = guid;
        this.image=image;
    }
    public String getImg() {
        return image;
    }

    }
