import java.util.Scanner;

//num14

public class num14 { 
    public static void main(String[] args) {
        int hour,minute,seconds,time;

        Scanner second = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        time = second.nextInt();

        hour = time / 3600; 
        minute = (time - hour * 3600) / 60;
        seconds = time % 60;

        System.out.println(time + " seconds " + hour + " hour " + minute + " minute " + seconds + " seconds ");
          
    }
}