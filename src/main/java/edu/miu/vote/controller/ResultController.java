package edu.miu.vote.controller;

import edu.miu.vote.domain.Result;
import edu.miu.vote.services.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/results")
public class ResultController {
    @Autowired
    ResultsService resultService;

    @PostMapping
    String createResult(@RequestBody Result result){
        Result r = resultService.createResult(result);
        return r.getAnnouncement() + " successfully posted..";
    }

    @GetMapping
    List<Result> displayResult(){
        return resultService.displayResult();
    }



}
