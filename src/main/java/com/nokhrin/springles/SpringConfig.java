package com.nokhrin.springles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;

@Configuration

@PropertySource("classpath:musicPlayers.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
    @Bean
    public ArrayList<Music> musicList(){
        ArrayList<Music> ml=new ArrayList<>();
        ml.add(rockMusic());
        ml.add(classicalMusic());
        ml.add(jazzMusic());
        return ml;
    }

}
