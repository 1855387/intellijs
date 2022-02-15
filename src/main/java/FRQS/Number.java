package FRQS;
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
        randomNum=z;

    }

    public Number() {
        squirrels = new ArrayList<>();
    }

    public ArrayList<String> getSquirrel() {
        return squirrels;
    }

    public void setSquirrels(ArrayList<String> newSquirrels) {
        this.squirrels = newSquirrels;
    }

    public static void main(String[] args) {

        String[] used = {"squirrel1", "squirrel2", "squirrel3", "squirrel4", "squirrel5", "squirrel6", "squirrel7", "squirrel8", "squirrel9", "squirrel10"};
        Squirrel squirrel1 = new Squirrel("Squirrel1", "Squirrel2");
        System.out.println("Original list" + squirrel1);

    }

}
