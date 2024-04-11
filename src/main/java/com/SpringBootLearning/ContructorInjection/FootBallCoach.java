package com.SpringBootLearning.ContructorInjection;


import org.springframework.stereotype.Service;

@Service
public class FootBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do Running for 15 Mins. ";
    }
}
