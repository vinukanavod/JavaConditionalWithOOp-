package jana_week1_homework;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scn1  = new Scanner(System.in);
        System.out.print("Please enter your marks bro :");
        int value =scn1.nextInt();
        new Getmarks( value);

//        Getmarks getmarks =  new Getmarks( value);
//        getmarks.createGrade();

    }
}
