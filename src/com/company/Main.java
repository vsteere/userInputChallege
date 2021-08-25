package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        //a way to run a while statemention without an infinite loop with a break is to set up "count<10" as a condition
        while(true) {

            //setting up variable to limit the number of inputs to 10
            int order = count + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();

            //checking to see if the input is an integer
            if(isAnInt) {
                int number = scanner.nextInt();
                count ++;
                sum += number;
                if(count==10) {
                    break;
                }

            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); //handle end of line (enter key)
        }
        System.out.println("sum =" + sum);
        scanner.close();
    }
}
