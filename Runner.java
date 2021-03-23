package com.arafat.junit1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class Runner {
    public static void main(String[]args){
        Result result= JUnitCore.runClasses(test2.class);
        for(Failure failure :result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("result=="+result.wasSuccessful());
    }
}
