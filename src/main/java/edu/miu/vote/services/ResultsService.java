package edu.miu.vote.services;

import edu.miu.vote.domain.Result;
import edu.miu.vote.domain.Winner;

import java.util.List;

public interface ResultsService {
    List<Result> displayResult();
    Winner getWinner();

     Result createResult(Result result);
}
