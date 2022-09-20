import java.util.Scanner;

public class Lab2_1
{
    public static void main(String[] args)
    {
        //print Lab2_1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of point 1:");
        double x1 = input.nextDouble();
        System.out.println("Enter the y-coordinate of point 1:");
        double y1 = input.nextDouble();
        System.out.println("Enter the z-coordinate of point 1:");
        double z1 = input.nextDouble();
        System.out.println("Enter the x-coordinate of point 2:");
        double x2 = input.nextDouble();
        System.out.println("Enter the y-coordinate of point 2:");
        double y2 = input.nextDouble();
        System.out.println("Enter the z-coordinate of point 2:");
        double z2 = input.nextDouble();
        //set up P1 and P2
        double distance = (Math.sqrt(Math.pow(x1-x1,2) + Math.pow(y1-y2,2) + Math.pow(z1-z2,2)));
        System.out.println("The distance between point 1 and point 2 is: " +distance);
        int distance0 = (int)(Math.sqrt(Math.pow(x1-x1,2) + Math.pow(y1-y2,2) + Math.pow(z1-z2,2)));
        System.out.println("The integer part of the distance between point 1 and 2 is: " +distance0);
        double distance1 = (Math.sqrt(Math.pow(x1-x1,2) + Math.pow(y1-y2,2) + Math.pow(z1-z2,2)));
        System.out.println("The fractional part of the distance between point 1 and 2 is: " distance1-distance0);




    }
}
