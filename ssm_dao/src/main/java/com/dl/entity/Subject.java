package com.dl.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Subject implements Comparable{
    private Integer id;
    private String title;
    private Integer totalVotes;
    private Integer viewTimes;
    private Date creatDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Integer getViewTimes() {
        return viewTimes;
    }

    public void setViewTimes(Integer viewTimes) {
        this.viewTimes = viewTimes;
    }

    public String getCreatDate() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return  sdf.format(creatDate);
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public long getCreatDate(int flag) {

        return  creatDate.getTime();
    }




    @Override
    public int compareTo(Object o) {
        Subject subject=(Subject) o;
        if(this.getCreatDate(1)<subject.getCreatDate(1)){
            return 1;
        }else if(this.getCreatDate(1)>subject.getCreatDate(1))
        {
            return -1;
        }
        else{
            return 0;
        }
    }
}
