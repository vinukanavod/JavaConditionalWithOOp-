package java_week1_homework_exercise2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birth year : ");
         int year = sc.nextInt();

        GetbirthYear get = new GetbirthYear();
       get.calculateBirthYear(year);
       get.calculateAge(year);
       get.yearAchiveHundred(year);

    }
}
