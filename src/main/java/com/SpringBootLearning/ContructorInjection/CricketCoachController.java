package com.SpringBootLearning.ContructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class CricketCoachController {
    private final Coach cricketCoach;
    private final Coach footBallCoach;
    @Autowired
    public CricketCoachController(@Qualifier("cricketCoach") Coach cricketCoach,@Qualifier("footBallCoach") Coach footBallCoach){
        this.cricketCoach = cricketCoach;
        this.footBallCoach =footBallCoach;
    }
    @GetMapping ("/dailyworkout")
    public List<String> getdailyworkout(){
        List<String> workOut = new ArrayList<>();
        workOut.add(cricketCoach.getDailyWorkout());
        workOut.add(footBallCoach.getDailyWorkout());
        return workOut;
    }
    @GetMapping("/dailyworkout/{data}")
    public String getdailyworkout(@PathVariable int data){
        List<String> workOut = new ArrayList<>();
        workOut.add(cricketCoach.getDailyWorkout());
        workOut.add(footBallCoach.getDailyWorkout());
        if(data==1){
            return workOut.get(0);
        }
        else{
            return workOut.get(1);
        }
    }
}
