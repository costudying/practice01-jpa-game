package com.example.practice01.game.jpaTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {

    private GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    @Transactional
    public void registGame(GameInfoDTO gameInfo){
        Game game = new Game(
                gameInfo.getCategory()
                ,gameInfo.getClassification()
                ,gameInfo.getDistributor()
                ,gameInfo.getGameName()
                ,gameInfo.getReleaseDate()
                ,gameInfo.getDeveloper()
                ,new GameSpec(
                    gameInfo.getRecommendedSpec().getOs()
                        ,gameInfo.getRecommendedSpec().getCpu()
                        ,gameInfo.getRecommendedSpec().getMemory()
                        ,gameInfo.getRecommendedSpec().getHdd()
                        ,gameInfo.getRecommendedSpec().getGraphicCard()
                        ,gameInfo.getRecommendedSpec().getGpuMemory()
                )
        );

        gameRepository.save(game);

    }



}
