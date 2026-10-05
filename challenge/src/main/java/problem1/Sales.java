package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of salesperson : ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);

        double avg = sum / (double) sales.length;
        System.out.println("\nAverage sales : " + avg);

        int maxSale = sales[0];
        int maxIdx = 0;
        for(int i = 0; i < sales.length; i++) {
            if(maxSale < sales[i]) {
                maxSale = sales[i];
                maxIdx = i;
            }
        }
        System.out.println("\nSalesperson " + (maxIdx + 1) + " has the highest sale with $" + maxSale);

        int minSale = sales[0];
        int minIdx = 0;
        for(int i = 0; i < sales.length; i++) {
            if(minSale > sales[i]) {
                minSale = sales[i];
                minIdx = i;
            }
        }
        System.out.println("\nSalesperson " + (minIdx + 1) + " has the lowest sale with $" + minSale);

        System.out.print("\nEnter a lower bound : ");
        int bound = scan.nextInt();
        int count = 0;
        for(int i = 0; i < sales.length; i++) {
            if(sales[i] > bound) {
                System.out.println("\nSalesperson " + (i + 1) + " has a greater sale than $" + bound + " ($" + sales[i] + ")");
                count++;
            }
        }
        System.out.println("\nTotal number of sales exceeding $" + bound + " : " + count);


    }
}