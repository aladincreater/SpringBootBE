package com.SpringBootLearning.JavaBeanConfig.RestControllers;


import com.SpringBootLearning.JavaBeanConfig.Common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/api/v2/")
public class LifeCycleController {
    private final Coach myCoach;
    @Autowired
    public LifeCycleController( Coach myCoach ){

        this.myCoach = myCoach;
    }
    //defining the PostConstruct Method as a part of the Life Cycle Process

    //This done usually for starting/Connecting the database connections
    @PostConstruct
    public void postConstruct(){            //Name is user-defined
        System.out.println("PostConstruct: "+ getClass().getSimpleName());
    }

    //defining the PreDestroy Method as a part of the Life Cycle Process
    //This done usually for terminating the database connections
    @PreDestroy
    public void preDestroy(){            //Name is user-defined
        System.out.println("PreDestroy: "+ getClass().getSimpleName());
    }
    @GetMapping("/cricket")
    public String getdailyworkout(){
        return myCoach.getDailyWorkout();
    }
}
