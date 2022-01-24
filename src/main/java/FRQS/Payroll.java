package FRQS;

public class Payroll
{
    private int[] itemsSold;
    private double[] wages;
    //constructor is just kept for demonstrating the code output
    public Payroll()
    {
        itemsSold = new int[] {48,50,37,62,38,70,55,37,64,60};
        wages = new double[10];
    }
    /*to compute Bonus Threshold, you have to find sum Of Items Sold, highest and lowest
    deduct highest and lowest from sum Of Items Sold and then divide by number of items -2
    to find the bonus Threshold*/
    public double computeBonusThreshold()
    {
        int highest = itemsSold[0];
        int lowest = itemsSold[0];
        int sumOfItemsSold = itemsSold[0];

        double bonusThreshold =0;

//iterate over items , find sum of items sold and highest and lowest
        for (int i = 1; i < itemsSold.length ; i++)
        {
            sumOfItemsSold += itemsSold[i];

            if(itemsSold[i] > highest)
                highest = itemsSold[i];

            if(itemsSold[i] < lowest )
                lowest = itemsSold[i];
        }

        bonusThreshold = (sumOfItemsSold - lowest - highest ) / (itemsSold.length -2.0);

        return bonusThreshold;
    }

    /*
    Compute wages as asked, wage for an employee is fixed wage added with itemSold * perItemWage
    When an employee sold items more than bonus Threshold Items then he will get extra 10%
    */
    public void computeWages(double fixedWage, double perItemWage)
    {
        double bonusThresholdForWages = computeBonusThreshold();
        for (int i = 0; i < wages.length ; i++)
        {
            wages[i] = fixedWage + ( itemsSold[i] * perItemWage);

            if(itemsSold[i] > bonusThresholdForWages)
            {
                wages[i] = wages[i] * 1.1 ; //which is 10 % extra of current wage of employee
            }
        }
    }

    /*
    Method to show itemsold, wages for the employee
    */
    public void printWages()
    {
        for (int i = 0; i < wages.length ; i++)
        {
            System.out.printf("Employee =%d , ItemsSold = %d, Wage = %.2f\n",i,itemsSold[i], wages[i]);
        }
    }
}