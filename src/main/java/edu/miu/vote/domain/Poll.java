package edu.miu.vote.domain;

import java.util.Date;


public abstract class Poll {
    Long id;
    String title;
    String description;
    String guidelines;
    Date startTime;
    Date endTime;

    Result result;

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

//    public void setResult(Result result) {
//        this.result = result;
//    }
}
