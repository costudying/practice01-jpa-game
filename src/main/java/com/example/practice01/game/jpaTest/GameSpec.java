package com.example.practice01.game.jpaTest;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GameSpec {

    @Column(name = "OS")
    private String os; //운영체제

    @Column(name = "CPU")
    private String cpu; //CPU

    @Column(name = "MEMORY")
    private String memory; //메모리

    @Column(name = "HDD")
    private String hdd; //하드 디스크 여유 공간

    @Column(name = "GRAPHIC_CARD")
    private String graphicCard; //그래픽 카드

    @Column(name = "GPU_MEMORY")
    private String gpuMemory; //GPU 메모리

    protected GameSpec() {
    }


    public GameSpec(String os, String cpu, String memory, String hdd, String graphicCard, String gpuMemory) {
        this.os = os;
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.graphicCard = graphicCard;
        this.gpuMemory = gpuMemory;
    }

    public String getOs() {
        return os;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getHdd() {
        return hdd;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getGpuMemory() {
        return gpuMemory;
    }

    @Override
    public String toString() {
        return "GameSpec{" +
                "os='" + os + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", hdd='" + hdd + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", gpuMemory='" + gpuMemory + '\'' +
                '}';
    }
}
