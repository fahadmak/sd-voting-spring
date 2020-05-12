package edu.miu.vote.dao;

import edu.miu.vote.domain.Ballot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BallotDao extends JpaRepository<Ballot, Long> {
}
