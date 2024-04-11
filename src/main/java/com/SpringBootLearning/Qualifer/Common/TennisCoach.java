package com.SpringBootLearning.Qualifer.Common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in Serving Practice";
    }
}