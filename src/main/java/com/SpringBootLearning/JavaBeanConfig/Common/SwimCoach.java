package com.SpringBootLearning.JavaBeanConfig.Common;



public class SwimCoach implements Coach{
    public SwimCoach(){
        System.out.println("Component Name: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warmUp";
    }
}
