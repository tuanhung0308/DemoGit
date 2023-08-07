/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;



/**
 *
 * @author DELL
 */
public class Article {
    private int aid;
    private String title;
    private Date published_date;
    private boolean open_access;

    public Article() {
    }

    public Article(int aid, String title, Date published_date, boolean open_access) {
        this.aid = aid;
        this.title = title;
        this.published_date = published_date;
        this.open_access = open_access;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }

    public boolean isOpen_access() {
        return open_access;
    }

    public void setOpen_access(boolean open_access) {
        this.open_access = open_access;
    }
    
    
}
