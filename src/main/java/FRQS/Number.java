package com.nighthawk.csa.starters.squirrel;

import FRQS.string;

import java.util.ArrayList;

// Write a Class Number
public class Number {
    private string odd;
    private string even;

    private ArrayList<String> squirrels;
    int randomNum = (int)(Math.random() * 33) + 3;
    public Number(string s, string r, int z) {
        odd=s;
        even=r;

    }




    // It contains a getter for Index, or the order it was initialized
public int getRandomNum()
{
    return randomNum;
}

    // Write a tester method
    public static void main(String[] args) {


        // Create an ArrayList of Type Number, my ArrayList is called squirrels

        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops


        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop

    }

}