package edu.miu.vote.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Embeddable
public class Ballot {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id; // serial number later on.
    private Long voterId;
    @OneToOne
    private Candidate candidateVoted; // direct 1 : 1
    private Date timeVoted;

    public Ballot() {}

    public Ballot(Long voterId, Candidate candidateVoted) {
        this.voterId = voterId;
        this.candidateVoted  = candidateVoted; ;
        this.timeVoted = new Date();
    }


    public Long getId() {
        return id;
    }

    public Long getVoterId() {
        return voterId;
    }

    public Candidate getCandidateVoted() {
        return candidateVoted;
    }

    public Date getTimeVoted() {
        return timeVoted;
    }

    public void setOptionVoted(Candidate candidateVoted) {
        this.candidateVoted = candidateVoted;
        this.timeVoted = new Date();
    }
}
