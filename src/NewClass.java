/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeo
 */

import java.util.*;

public class NewClass {

    public static Scanner sc = new Scanner(System.in);

    public void subjectAmount() { //main method transfers here
        System.out.print("Enter the amount of subjects: ");
        int subjects = sc.nextInt();
        NewClas sendGrade = new gradeCheck();
        //int grade = score;
        if (subjects < 0) {
            System.out.println("\nERROR: NEGATIVE NUMBER DETECTED.\nTERMINATING PROGRAM...");
            System.exit(0);
        } else if (subjects == 0) {
            System.out.print("");
            System.exit(0);
        }

        sendGrade.average(subjects);
    }

    public void average(int subjects) {
        int sum = 0;
        int grade2;
        int temp;

        int num[] = new int[subjects];
        System.out.println("Please type the " + subjects + " subject/s in the list below:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter grade for subject #" + (i + 1) + ": ");
            num[i] = sc.nextInt();

            if (num[i] < 0) {
                System.out.print("\nWARNING: NEGATIVE NUMBER DETECTED.\nTERMINATING PROGRAM...");
                System.exit(0);
            }
        }
        sc.close();

        for (int i = 0; i < subjects; i++) {
            for (int j = i + 1; j < subjects; j++) {
                if (num[i] > num[j]) {

                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("Would you want to check another grade for student?");
        // temp.printGrade
    }

}

class Main {

    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);

        NewClass checker = new NewClass();
        checker.subjectAmount(); //transfers code to different method in gradeCheck class
        //sc.close();
    }

    public void printGrade() {

    }
}
