package edu.miu.vote.dao;

import edu.miu.vote.domain.Result;
import edu.miu.vote.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultDao extends JpaRepository<Result, Long> {
}
