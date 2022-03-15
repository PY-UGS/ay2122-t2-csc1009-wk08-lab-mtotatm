package Week8;

import Week5.*;

import java.util.Scanner;

public class Week8Q1
{
    public static void main(String[] args)
    {
        CircleWithException c = new CircleWithException();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");
        RadCheck(input,c);

        double area = AreaCheck(input,c);

        System.out.println("The area for the circle is: " + area);
    }

    private static double RadCheck(Scanner input, CircleWithException c)
    {
        double rad;
        RAD:
        while (true)
        {
            try
            {
                rad = input.nextDouble();
                if (rad > 0)
                {
                    c.setRadius(rad);
                    break RAD;
                }
                else
                {
                    throw new IllegalArgumentException("It must be a positive number for radius!");
                }
            }
            catch (Exception e)
            {
                System.out.println("ERROR, you did not enter a number");
                e.printStackTrace();
            }
        }

        return rad;
    }

    private static double AreaCheck(Scanner input, CircleWithException c)
    {
        double Area = c.area();

        AREA:
        while (true)
        {
            try
            {
                if(Area > 1000)
                {
                    System.out.println("Please re-enter a smaller radius of the circle: ");
                    RadCheck(input,c);
                    Area = c.area();
                }
                else
                {
                    break AREA;
                }
            }
            catch (Exception e)
            {
                System.out.println("ERROR, you did not enter a number");
                e.printStackTrace();
            }
        }

        return Area;
    }
}
