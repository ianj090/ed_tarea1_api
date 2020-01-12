package com.tarea1.RestApp1;

import java.util.Scanner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tarea1 {

    @RequestMapping("/")
    public String index() {
        Scanner myObj = new
                Scanner(System.in);

        System.out.println("Enter a Grade Number ");
        int num1 = myObj.nextInt();
//        int num1 = 50;

        if (num1 < 0) {
            ;
        }
        else if (num1 < 40) {
            return "Grade: D";
        }
        else if (num1 < 50) {
            return "Grade: C";
        }
        else if (num1 < 60) {
            return "Grade: B";
        }
        else if (num1 < 75) {
            return "Grade: A";
        }
        else if (num1 <= 100) {
            return "Grade: O";
        }
        return "Not a Valid Grade Number";
    }
}
