package edu.miu.vote.model;

import java.util.Date;

public class Ballot {
    private int voterId;
    private Option option;
    private Date timeVoted;

    public Ballot() {}

    public Ballot(int voterId, Option option) {
        this.voterId = voterId;
        this.option = option;
        this.timeVoted = new Date();
    }

    public int getVoterId() {
        return voterId;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public Date getTimeVoted() {
        return timeVoted;
    }

    public void setTimeVoted(Date timeVoted) {
        this.timeVoted = timeVoted;
    }

    public void addBallot(int voterId, Option option) {
        this.voterId = voterId;
        this.option = option;
        this.timeVoted = new Date();
    }

}
