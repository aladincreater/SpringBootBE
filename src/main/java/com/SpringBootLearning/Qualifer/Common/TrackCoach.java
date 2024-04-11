package com.SpringBootLearning.Qualifer.Common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Running 5K!";
    }
}
