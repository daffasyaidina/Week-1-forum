import java.util.Scanner;

//num13

public class num13 {
    public static void main(String[] args) {
        double a,b,c,x;
        double determinant,root1,root2;
        
        a = 0;

        Scanner value = new Scanner(System.in);

        System.out.println("Enter B: ");
        b = value.nextDouble();

        System.out.println("Enter C: ");
        c = value.nextDouble();

        determinant = (b * b) - (4 * a * c);

        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b + Math.sqrt(determinant)) / (2 * a);

        if (determinant > 0){
            System.out.println("X value: " + root1 + root2);
        }
        else{
            x = -b / (2 * a);
            System.out.println("X value: " + x);
        }

        
    }
}