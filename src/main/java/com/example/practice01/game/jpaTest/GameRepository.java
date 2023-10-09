package com.example.practice01.game.jpaTest;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class GameRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(Game game){
        manager.persist(game);
    }

}
