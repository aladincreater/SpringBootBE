package com.SpringBootLearning.LazyInitialization.RestControllers;


import com.SpringBootLearning.LazyInitialization.Common.Coach;
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
    private Coach coach;

    //Setter Injection in Spring.
    @Autowired
    public void CricketCoachController(
            @Qualifier("cricketCoach") Coach coach
    ){
        this.coach = coach;
    }



    @GetMapping ("/dailyworkout")
    public String getdailyworkout(){
        return coach.getDailyWorkout();
    }
}
