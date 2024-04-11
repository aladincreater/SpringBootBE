package com.SpringBootLearning.ComponentScanning.RestControllers;


import com.SpringBootLearning.ComponentScanning.Common.Coach;
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

    //Setter Injection in Spring.
    @Autowired
    public void setCoach(Coach coach){
        myCoach = coach;
    }



    @GetMapping ("/dailyworkout")
    public String getdailyworkout(){
        return myCoach.getDailyWorkout();
    }
}
