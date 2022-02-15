package com.nighthawk.intellijs;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

// Write a Class Number
public class Number {
    static int choose;
    static int max = 36;
    static int min = 3;

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number() {

    }

    // It contains a getter for the Random Number


    // It contains a getter for Index, or the order it was initialized


    // Write a tester method
    public static void main(String[] args) {

        ArrayList squirrels = new ArrayList();
        Random rand = new Random();

        for (int j = 0; j<20; j++)
        {
            choose = rand.nextInt(max-min)+min;
            squirrels.add(choose);
        }
        Collections.sort(squirrels);

        System.out.println("Squirrels: " + squirrels);
    }

}

