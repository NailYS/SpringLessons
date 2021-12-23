package ru.YusupovSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("thisMusicPlayer")

public class MusicPlayer {


    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music;

    private Music music1;


    @Autowired

    public MusicPlayer(@Qualifier("thisClassicalMusic") Music music, @Qualifier("thisRockMusic") Music music1) {
        this.music = music;
        this.music1 = music1;
    }
                    

    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic(MyEnum myEnum) {
        if (myEnum.name() == "CLASSICAl") {
            return music.getSong() + "";
        } else {
            return music1.getSong() + "";
        }

    }
}

