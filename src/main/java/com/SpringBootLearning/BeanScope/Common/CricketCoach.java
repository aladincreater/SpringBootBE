package com.SpringBootLearning.BeanScope.Common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Scope Implementation
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do Fast Bowling.Do Batting for 15 Mins";
    }
}

//@Component
//public class CricketCoach implements Coach {
//    @Override
//    public String getDailyWorkout() {
//        return "Do Fast Bowling.Do Batting for 15 Mins";
//    }
//}
