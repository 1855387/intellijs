package FRQS;
import java.util.Scanner;

public class Unit5CZ {
    private String hostName;

    private String address;



    public Unit5CZ(String n, String a)

    {

        hostName = n;

        address = a;

    }

    public String getHostName(){
        return hostName;
    }  //part 1a

    public String updateAddress(String newAddress) {  //part 1b
        String newaddress = newAddress;
        return newaddress;
    }
    public String whoInvited( String personInvited){
        String personInvited1 = personInvited;
        String greeting = "Dear " + personInvited1 + ", please attend my event at " + address + ". See you then, " + hostName;
        return greeting;
    }
    public Unit5CZ(String address)

    {

        String address1 = address;

        hostName = "Host";

    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}
