package com.SpringBootLearning.JavaBeanConfig.Common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//Scope Implementation
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Primary
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do Fast Bowling for 15 Mins";
    }
}

//@Component
//public class CricketCoach implements Coach {
//    @Override
//    public String getDailyWorkout() {
//        return "Do Fast Bowling.Do Batting for 15 Mins";
//    }
//}
