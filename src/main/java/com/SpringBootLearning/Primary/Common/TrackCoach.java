package com.SpringBootLearning.Primary.Common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Running 5K!";
    }
}
