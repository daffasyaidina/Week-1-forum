//num10

import java.util.Scanner;

public class num10  {
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        System.out.println("Enter first num");
        double first =  num.nextDouble();

        System.out.println("Enter second num");
        double second = num.nextDouble();

        System.out.println("Enter third num");
        double third = num.nextDouble();

        double mean = (first + second + third) / 3;
        double variance = (Math.pow((first - mean ), 2) + Math.pow((second - mean), 2) + Math.pow((third - mean), 2)) / 3;
        double standard_deviation = Math.sqrt(variance);

        System.out.println("Mean: " + mean);
        System.out.println("variance: " + variance);
        System.out.println("Standar Deviation" + standard_deviation);
    }
}