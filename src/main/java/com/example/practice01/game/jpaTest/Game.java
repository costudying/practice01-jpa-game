package com.example.practice01.game.jpaTest;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Game_Info")
public class Game {

    @Id
    @Column(name = "GAME_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gameNo;

    @Column(name = "CATEGORY")
    private String category; //게임 장르

    @Column(name = "CLASSIFICATION")
    @Enumerated(EnumType.STRING)
    private GameRating classification; //게임 등급 분류

    @Column(name = "DISTRIBUTOR")
    private String distributor; //유통사

    @Column(name = "GAME_NAME")
    private String gameName; //게임명

    @Column(name = "RELEASE_DATE")
    private LocalDate releaseDate; //출시일

    @Column(name = "DEVELOPER")
    private String developer; //개발사

    @Embedded
    private GameSpec recommendedSpec; // 권장 사양

    protected Game() {
    }

    public Game(String category, GameRating classification, String distributor, String gameName, LocalDate releaseDate, String developer, GameSpec recommendedSpec) {
        this.category = category;
        this.classification = classification;
        this.distributor = distributor;
        this.gameName = gameName;
        this.releaseDate = releaseDate;
        this.developer = developer;
        this.recommendedSpec = recommendedSpec;
    }

    public int getGameNo() {
        return gameNo;
    }

    public String getCategory() {
        return category;
    }

    public GameRating getClassification() {
        return classification;
    }

    public String getDistributor() {
        return distributor;
    }

    public String getGameName() {
        return gameName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getDeveloper() {
        return developer;
    }

    public GameSpec getRecommendedSpec() {
        return recommendedSpec;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameNo=" + gameNo +
                ", category=" + category +
                ", classification=" + classification +
                ", distributor='" + distributor + '\'' +
                ", gameName='" + gameName + '\'' +
                ", releaseDate=" + releaseDate +
                ", developer='" + developer + '\'' +
                ", recommendedSpec=" + recommendedSpec +
                '}';
    }
}
