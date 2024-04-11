package com.SpringBootLearning.Qualifer.RestControllers;


import com.SpringBootLearning.Qualifer.Common.Coach;
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
    private Coach cricketCoach;
    private  Coach baseBallCoach;
    private  Coach tennisCoach;
    private  Coach trackCoach;

    //Setter Injection in Spring.
    @Autowired
    public void CricketCoachController(
            @Qualifier("cricketCoach") Coach cricketCoach,
            @Qualifier("baseBallCoach") Coach baseBallCoach,
            @Qualifier("tennisCoach") Coach tennisCoach,
            @Qualifier("trackCoach") Coach trackCoach
    ){
        this.cricketCoach = cricketCoach;
        this.baseBallCoach = baseBallCoach;
        this.tennisCoach = tennisCoach;
        this.trackCoach = trackCoach;
    }



    @GetMapping ("/dailyworkout")
    public String getdailyworkout(){
        return trackCoach.getDailyWorkout();
    }
}
