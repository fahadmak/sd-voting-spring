package edu.miu.vote.services.impl;

import edu.miu.vote.dao.BallotDao;
import edu.miu.vote.domain.Ballot;
import edu.miu.vote.services.BallotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BallotServiceImpl implements BallotService {

    @Autowired
    BallotDao ballotDao;

    public Ballot createBallot(Ballot ballot){
        return ballotDao.save(ballot);
    }

    public List<Ballot> displayBallots(){
        return (List<Ballot> )ballotDao.findAll();
    }

}
