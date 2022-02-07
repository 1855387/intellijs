package FRQS;

public class Main
{
    public static void main(String[] args) {
        //create an object of payroll class, where itemsSolds are hard coded for demo
        Payroll payroll = new Payroll();

        System.out.println("Bonus threshold items are : " + payroll.computeBonusThreshold());

        //call computeWages which will internally class bonus threshold as well
        payroll.computeWages(10.0,1.5);

        payroll.printWages();
    }
}
