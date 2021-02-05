package com.nokhrin.springles;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;
    private ArrayList<Music> musicList;

    public MusicPlayer(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }


    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(){
        int r=(int)(Math.random()*3);
        return "Playing: "+musicList.get(r).getSong();
    }


}
