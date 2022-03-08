//num10

import java.util.Scanner;

public class num10  {
    public static void main(String[] args) {
        double first, second, third;
        double mean, variance, standard_deviation
        
        Scanner num = new Scanner(System.in);
        System.out.println("Enter first num");
        first =  num.nextDouble();

        System.out.println("Enter second num");
        second = num.nextDouble();

        System.out.println("Enter third num");
        third = num.nextDouble();

        mean = (first + second + third) / 3;
        variance = (Math.pow((first - mean ), 2) + Math.pow((second - mean), 2) + Math.pow((third - mean), 2)) / 3;
        standard_deviation = Math.sqrt(variance);

        System.out.println("Mean: " + mean);
        System.out.println("variance: " + variance);
        System.out.println("Standar Deviation" + standard_deviation);
    }
}
