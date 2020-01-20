package com.tarea1.RestApp1;

import java.util.Scanner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tarea1 {

    @RequestMapping("/")
    public String index(Integer num1) {
        return calculateGrade(num1);
    }

    public static String calculateGrade(int grade) {

        if (grade < 0) {
            ;
        }
        else if (grade < 40) {
            return "Grade: D";
        }
        else if (grade < 50) {
            return "Grade: C";
        }
        else if (grade < 60) {
            return "Grade: B";
        }
        else if (grade < 75) {
            return "Grade: A";
        }
        else if (grade <= 100) {
            return "Grade: O";
        }
        return "Not a Valid Grade Number";
    }
}
