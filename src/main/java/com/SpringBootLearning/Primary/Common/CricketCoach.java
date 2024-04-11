package com.SpringBootLearning.Primary.Common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do Fast Bowling.Do Batting for 15 Mins.This is the Qualifer";
    }
}
