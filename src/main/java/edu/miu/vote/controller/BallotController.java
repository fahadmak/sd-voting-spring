package edu.miu.vote.controller;

import edu.miu.vote.domain.Ballot;
import edu.miu.vote.services.BallotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ballot")
public class BallotController {
    @Autowired
    BallotService ballotService;

    @PostMapping
    String createResult(@RequestBody Ballot ballot){
        Ballot b = ballotService.createBallot(ballot);
        return b.getVoterId()+ " successfully posted..";
    }

    @GetMapping("/sensitive") // sensitive
    List<Ballot> displayBallot(){
        return ballotService.displayBallots();
    }



}
