package FRQS;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;

// Write a Class Number
public class Number2 {
    // instance variables

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number2() {
        // constructor
    }
    public int getNumber(){
        int min = 3;
        int max = 36;
        int number = (int)(Math.random()*(max-min+1)+min);
        return number;
    }
    // It contains a getter for the Random Number


    // It contains a getter for Index, or the order it was initialized


    // Write a tester method
    public static void main(String[] args) {

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        ArrayList squirrels = new ArrayList<Number2>();
        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
        Number2 sq1 = new Number2();
        Number2 sq2 = new Number2();
        Number2 sq3 = new Number2();
        Number2 sq4 = new Number2();
        Number2 sq5 = new Number2();
        Number2 sq6 = new Number2();
        Number2 sq7 = new Number2();
        Number2 sq8 = new Number2();
        Number2 sq9 = new Number2();
        Number2 sq10 = new Number2();
        sq1.getNumber();
        sq2.getNumber();
        sq3.getNumber();
        sq4.getNumber();
        sq5.getNumber();
        sq6.getNumber();
        sq7.getNumber();
        sq8.getNumber();
        sq9.getNumber();
        sq10.getNumber();
        squirrels.add(sq1);
        squirrels.add(sq2);
        squirrels.add(sq3);
        squirrels.add(sq4);
        squirrels.add(sq5);
        squirrels.add(sq6);
        squirrels.add(sq7);
        squirrels.add(sq8);
        squirrels.add(sq9);
        squirrels.add(sq10);

        Collections.sort(squirrels);


        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        System.out.println(squirrels);
