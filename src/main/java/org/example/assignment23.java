/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Objects;
import java.util.Scanner;

public class assignment23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = null;

        System.out.println("Is the car silent when you turn the key?");
        answer = scan.nextLine();

        if(Objects.equals(answer, "y")) {
            System.out.println("Are the battery terminals corroded?");
            answer = scan.nextLine();
            if (Objects.equals(answer, "y")) {
                System.out.println("Clean terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again.");
            }
            System.exit(0);
        }

        System.out.println("Does the car make a slicking noise?");
        answer = scan.nextLine();

        if(Objects.equals(answer, "y")) {
            System.out.println("Replace the battery.");
        } else {
            System.out.println("Does the car crank up but fail to start?");
            answer = scan.nextLine();
            if(Objects.equals(answer, "y")) {
                System.out.println("Check spark plug connections");
            } else {
                System.out.println("Does the engine start and then die?");
                answer = scan.nextLine();
                if(Objects.equals(answer, "y")) {
                    System.out.println("Does your car have fuel injection?");
                    answer = scan.nextLine();
                    if(Objects.equals(answer, "y")) {
                        System.out.println("Get it in for service.");
                    } else {
                        System.out.println("Check to ensure the choke is opening and closing");
                    }
                } else {
                    System.out.println("This should not be possible");
                }
            }
        }
    }
}
