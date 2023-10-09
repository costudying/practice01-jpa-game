package com.example.practice01.game.jpaTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootTest
public class GameJpaTests {

    @Autowired
    private GameService gameService;


    private static Stream<Arguments> getGame() {
        return Stream.of(
                Arguments.of(
                        "스포츠 게임"
                        , "ALL"
                        , "넥슨"
                        , "FC온라인"
                        , LocalDate.of(2023,9,21)
                        ,"EA 코리아 스튜디오"
                        ,new GameSpec(
                        "Windows 7/8/8.1/10/11 - 64-Bit"
                        , "Intel i5-2550K @ 3.4Ghz AMD FX-6350 Six-Core"
                        , "8 GB"
                        , "40GB"
                        , "NVIDIA GeForce GTX 460 AMD Radeon HD 6870"
                        , "3 GB"
                        )
                ),
                Arguments.of(
                        "AOS"
                        , "TWELVE"
                        , "라이엇 게임즈"
                        , "FC온라인"
                        , LocalDate.of(2011,12,4)
                        ,"라이엇 게임즈"
                        ,new GameSpec(
                                "Windows 10 (x64)"
                                , "Intel: Core i5-3300 / AMD: Ryzen 3 1200 / ARM: 미지원"
                                , "4 GB"
                                , "SSD 16GB 이상"
                                , "NVIDIA GeForce 560[13]\n" +
                                "AMD HD 6950[AMD]\n" +
                                "Intel UHD 630 내장 그래픽"
                                , "2 GB"
                        )
                ),
                Arguments.of(
                        "MMORPG"
                        , "ALL"
                        , "넥슨"
                        , "메이플스토리"
                        , LocalDate.of(2003,4,29)
                        ,"넥슨"
                        ,new GameSpec(
                                "Windows 7 (x64)"
                                , "Pentium Dual Core급 이상"
                                , "4 GB"
                                , "20GB 이상"
                                , "GeForce 9600 GT / Radeon HD 5670 이상\n" +
                                "(Shader 3.0 이상 지원 그래픽 카드)"
                                , "2 GB"
                        )
                )
        );
    }

    @DisplayName("저장하기")
    @ParameterizedTest
    @MethodSource("getGame")
    void testCreateGame(String category, GameRating classification, String distributor
            , String gameName, LocalDate releaseDate, String developer
            , GameSpec recommendedSpec) {

        GameInfoDTO gameInfo = new GameInfoDTO(category, classification, distributor, gameName, releaseDate, developer, recommendedSpec);

        Assertions.assertDoesNotThrow(
                () -> gameService.registGame(gameInfo)
        );

    }


}
