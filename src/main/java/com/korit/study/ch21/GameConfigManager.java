package com.korit.study.ch21;

import java.util.Objects;

public class GameConfigManager {
    // TODO: 싱글톤 구현을 위한 필드들
    private static GameConfigManager instance = new GameConfigManager(0, "");

    // 설정 정보 필드들
    private int soundVolume = 50;           // 기본값 50
    private String resolution = "1280x720"; // 기본 해상도

    // TODO: 생성자 구현
    private GameConfigManager(int soundVolume, String resolution) {
        this.soundVolume = soundVolume;
        this.resolution = resolution;
    }

    // TODO: 싱글톤 인스턴스 반환 메서드 구현
    public static GameConfigManager getInstance() {
        if (Objects.isNull(instance)) {
            instance = new GameConfigManager(0, "");
        }
        return instance;
    }
    //null 인지 확인해서 null, 즉 최초의 한번만 생성하도록


    // Getter/Setter 메서드들
    public void setSoundVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.soundVolume = volume;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public String getConfigInfo() {
        return String.format("Sound: %d, Resolution: %s", soundVolume, resolution);
    }
}
