package com.SpringBootLearning.ContructorInjection;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do Fast Bowling.";
    }
}
