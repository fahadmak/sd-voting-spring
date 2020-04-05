package edu.miu.vote.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class Election extends Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ElementCollection
    List<Candidate> candidates;

    public Election(){}

    public Election(String title, String description, String guidelines, Date startTime, Date endTime) {
        super(title, description, guidelines, startTime, endTime);
        this.candidates = new ArrayList<>();            // new keyword here
    }

    public Long getId() {
        return id;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> options) {
        this.candidates = candidates;
    }
}
