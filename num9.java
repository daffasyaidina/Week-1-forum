//num9
import java.util.Scanner;

public class num9 {
    public static void main(String[] args){
        Scanner temp = new Scanner(System.in); 
        System.out.println("Enter temp in Celcius: "); 

        int imperials = temp.nextInt(); 

        int metrics = (imperials *  + 160)/5; 

        System.out.println(imperials + " Celsius degrees are " + metrics + " Fahrenheit degrees" );
}
}