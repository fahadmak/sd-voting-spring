package edu.miu.vote.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Election extends Poll {
    List<Candidate> candidates;

    public Election(int id, String title, String description, String guidelines, Date startTime, Date endTime) {
        super(id, title, description, guidelines, startTime, endTime);
        this.candidates = new ArrayList<>();
    }

    public List<Candidate> displayCandidates() {
        return candidates;
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    @Override
    public Result displayResults() {
        return null;
    }

    @Override
    public Result generateResults() {
        return null;
    }
}
