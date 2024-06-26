package com.SpringBootLearning.LazyInitialization.Common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

    public BaseBallCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in Batting Practice";
    }
}
