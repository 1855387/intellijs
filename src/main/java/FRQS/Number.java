package FRQS;
import java.util.ArrayList;
// Write a Class Number
public class Number {
    // instance variables

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number() {
        // constructor
    }

    // It contains a getter for the Random Number


    // It contains a getter for Index, or the order it was initialized


    // Write a tester method
    public static void main(String[] args) {

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        ArrayList<Number> squirrels = new ArrayList<Number>();
        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
        Number sq1 = new Number();
        Number sq2 = new Number();
        Number sq3 = new Number();
        Number sq4 = new Number();
        Number sq5 = new Number();
        Number sq6 = new Number();
        Number sq7 = new Number();
        Number sq8 = new Number();
        Number sq9 = new Number();
        Number sq10 = new Number();

        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        for (Number i: squirrels){
            System.out.println(i);
        }
    }

}
