package com.SpringBootLearning.BeanScope.RestControllers;


import com.SpringBootLearning.BeanScope.Common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class CricketCoachController {
    private Coach myCoach;
    private Coach urCoach;

    //Setter Injection in Spring.
    @Autowired
    public void setCoach(
            @Qualifier("cricketCoach") Coach myCoach,
            @Qualifier("cricketCoach") Coach urCoach
    ){

        this.myCoach = myCoach;
        this.urCoach =  urCoach;
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: MYCOACH === URCOACH, "+ (myCoach==urCoach);
    }

    @GetMapping ("/dailyworkout")
    public String getdailyworkout(){
        return myCoach.getDailyWorkout();
    }
}
