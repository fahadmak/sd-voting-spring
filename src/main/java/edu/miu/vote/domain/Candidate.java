package edu.miu.vote.domain;

import javax.persistence.*;

@Entity
@Embeddable
public class Candidate extends Voter { // implements  Option
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long candidateId;
    private int score;
    private boolean isWinner;

    public void setScore(int score) { // calculated
        this.score = score;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public Candidate() {
        super();
        this.score = 0;
        this.isWinner = false;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public int getScore() {
        return score;
    }

}


