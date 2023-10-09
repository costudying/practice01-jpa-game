package com.example.practice01.game.jpaTest;

import java.time.LocalDate;

public class GameInfoDTO {

    private String category; //게임 장르

    private GameRating classification; //게임 등급 분류

    private String distributor; //유통사

    private String gameName; //게임명

    private LocalDate releaseDate; //출시일

    private String developer; //개발사

    private GameSpec recommendedSpec; // 권장 사양


    public GameInfoDTO() {
    }

    public GameInfoDTO(String category, GameRating classification, String distributor, String gameName, LocalDate releaseDate, String developer, GameSpec recommendedSpec) {
        this.category = category;
        this.classification = classification;
        this.distributor = distributor;
        this.gameName = gameName;
        this.releaseDate = releaseDate;
        this.developer = developer;
        this.recommendedSpec = recommendedSpec;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public GameRating getClassification() {
        return classification;
    }

    public void setClassification(GameRating classification) {
        this.classification = classification;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public GameSpec getRecommendedSpec() {
        return recommendedSpec;
    }

    public void setRecommendedSpec(GameSpec recommendedSpec) {
        this.recommendedSpec = recommendedSpec;
    }

    @Override
    public String toString() {
        return "GameInfoDTO{" +
                "category='" + category + '\'' +
                ", classification='" + classification + '\'' +
                ", distributor='" + distributor + '\'' +
                ", gameName='" + gameName + '\'' +
                ", releaseDate=" + releaseDate +
                ", developer='" + developer + '\'' +
                ", recommendedSpec='" + recommendedSpec + '\'' +
                '}';
    }
}
