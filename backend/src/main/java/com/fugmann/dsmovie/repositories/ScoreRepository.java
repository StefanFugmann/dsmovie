package com.fugmann.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fugmann.dsmovie.entities.Score;
import com.fugmann.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
