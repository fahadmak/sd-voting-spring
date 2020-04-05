package edu.miu.vote.services.impl;

import edu.miu.vote.dao.ResultDao;
import edu.miu.vote.domain.Result;
import edu.miu.vote.domain.Winner;
import edu.miu.vote.services.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultsService {

    @Autowired
    ResultDao resultDao;

    public Result createResult(Result result){
        return resultDao.save(result);
    }

    public List<Result> displayResult(){
        return (List<Result> )resultDao.findAll();
    }

    public Winner getWinner(){
        return null; // impl
    }
}
