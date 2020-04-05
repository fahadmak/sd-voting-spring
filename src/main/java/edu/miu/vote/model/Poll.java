package edu.miu.vote.model;

import java.util.Date;
import java.util.List;

public abstract class Poll {
    private int id;
    private String title;
    private String description;
    private String guidelines;
    private Date startTime;
    private Date endTime;
    private Result result;
    private List<Ballot> ballot;

    public Poll() {}

    public Poll(int id, String title, String description, String guidelines, Date startTime, Date endTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.guidelines = guidelines;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGuidelines() {
        return guidelines;
    }

    public void setGuidelines(String guidelines) {
        this.guidelines = guidelines;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public List<Ballot> getBallot() {
        return ballot;
    }

    public void setBallot(List<Ballot> ballot) {
        this.ballot = ballot;
    }

    public abstract Result displayResults();

    public abstract Result generateResults();

}
