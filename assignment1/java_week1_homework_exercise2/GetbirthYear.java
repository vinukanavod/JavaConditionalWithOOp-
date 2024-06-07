package java_week1_homework_exercise2;

import java.sql.SQLOutput;

public class GetbirthYear {
     void calculateBirthYear ( int year){
        if(year > 2013){
            System.out.println("Generation Alpha");
        } else if (year > 1997 ) {
            System.out.println("Generation Z");
        } else if (year > 1981 ) {
            System.out.println("Millennials");
        } else if (year > 1965) {
            System.out.println("Generation X");
        } else if (year > 1946) {
            System.out.println("Baby Boomers");
        } else if (year > 1928) {
            System.out.println("Silent Generation");
        } else  {
            System.out.println("Greatest Generation");
        }
//        Generation Alpha: 2013 and later
//        •Generation Z: 1997 to 2012
//        •Millennials: 1981 to 1996
//        •Generation X: 1965 to 1980
//        •Baby Boomers: 1946 to 1964
//        •Silent Generation: 1928 to 1945
//        •Greatest Generation: Before 1928

    }

     int calculateAge (int year){
        int age = 2024 - year;
        System.out.println("The current age is : "+ age);
        return age;
    }

     void yearAchiveHundred (int year){
       GetbirthYear g1 = new GetbirthYear();
        int achive = year + ( 100 - g1.calculateAge(year));
        System.out.println("The Year That achive 100 age is : " + achive);
    }




}
