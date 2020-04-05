package edu.miu.vote.model;

public class Candidate extends Voter implements Option {
    private int score;
    private boolean isWinner;

    public Candidate() {
        super();
        this.score = 0;
        this.isWinner = false;
    }

    @Override
    public int getScore() {
        return 0;
    }

    @Override
    public String getWinner() {
        return null;
    }
}
