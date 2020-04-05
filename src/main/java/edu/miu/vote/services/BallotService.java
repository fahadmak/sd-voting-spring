package edu.miu.vote.services;

import edu.miu.vote.domain.Ballot;

import java.util.List;

public  interface BallotService {
    public abstract List<Ballot> displayBallots();
     public abstract Ballot createBallot(Ballot ballot);
}
