package com.nokhrin.springles;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Smoke on the water";
    }
}
