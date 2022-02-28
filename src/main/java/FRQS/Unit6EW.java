package FRQS;

public class Unit6EW {
    public static void main(String[] args) {
        //initialize array
        String words[] = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
        //enhanced for loop to loop through the array
        for (String word : words) {
            //lastIndexOf() method returns the position of the last found occurrence
            //of the substring specified in a string
            if (word.lastIndexOf("ing") == word.length() - 3) {
                System.out.println(word);
            }
        }
    }
}

// test
