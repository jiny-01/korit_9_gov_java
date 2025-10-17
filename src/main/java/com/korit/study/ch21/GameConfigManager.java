package com.korit.study.ch21;

import java.util.Objects;

public class GameConfigManager {
    // TODO: 싱글톤 구현을 위한 필드들
    private static GameConfigManager instance;

    // 설정 정보 필드들
    private int soundVolume = 50;           // 기본값 50
    private String resolution = "1280x720"; // 기본 해상도

    // TODO: 생성자 구현
    // getInstance() 호출 시 매개변수를 아무것도 안 받기 때문에 기본 생성자
    private GameConfigManager() {

    }

//만약
// private int soundVolume;           // 기본값 50
// private String resolution; // 기본 해상도          이고 기본값이 50, 1280*720 일 땐
// AllArguConstructor 로 생성자 만들어줘야함


//    public GameConfigManager(int soundVolume, String resolution) {
//        this.soundVolume = soundVolume;
//        this.resolution = resolution;
//    }
//
//    public static GameConfigManager getInstance() {
//        if (Objects.isNull(instance)) {
//            instance = new GameConfigManager(50, "1280*720");
//        }
//        return instance;
//    }

    // TODO: 싱글톤 인스턴스 반환 메서드 구현
    public static GameConfigManager getInstance() {
        if (Objects.isNull(instance)) {
            instance = new GameConfigManager();
        }
        return instance;
    }

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
        return String.format("Sound: %d, Resolution: %s",
                soundVolume, resolution);
    }
}
