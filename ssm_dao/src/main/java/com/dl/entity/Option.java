package com.dl.entity;

public class Option {
    private Integer id;
    private String optContent;
    private Integer vote;
    private Integer sid;

    public Option() {
    }

    public Option(Integer id, String optContent, Integer vote, Integer sid) {
        this.id = id;
        this.optContent = optContent;
        this.vote = vote;
        this.sid = sid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOptContent() {
        return optContent;
    }

    public void setOptContent(String optContent) {
        this.optContent = optContent;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}
