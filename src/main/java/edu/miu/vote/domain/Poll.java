package edu.miu.vote.domain;

import javax.persistence.ElementCollection;
import java.util.Date;
import java.util.List;

public abstract class Poll {

    private String title;
    private String description;
    private String guidelines;
    private Date startTime;
    private Date endTime;

    @ElementCollection
    private List<Ballot> ballot;

    public Poll() {}

    public Poll(String title, String description, String guidelines, Date startTime, Date endTime) {

        this.title = title;
        this.description = description;
        this.guidelines = guidelines;
        this.startTime = startTime;
        this.endTime = endTime;
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

}
