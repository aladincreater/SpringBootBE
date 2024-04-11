package com.SpringBootLearning.Primary.Common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in Batting Practice";
    }
}
