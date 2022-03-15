package Week8;

import java.util.Scanner;

public class CircleWithException
{
    private double radius,diameter;
    double PI = 3.14159265358979;

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double newRad)
    {
        if(newRad > 0)
        {
            this.radius = newRad;
        }
        else
        {
            throw new IllegalArgumentException("It must be a positive number for radius!");
        }
    }

    public double getDiameter()
    {
        return this.diameter;
    }

    public void setDiameter(double newDia)
    {
        this.diameter = newDia;
    }

    public Double area()
    {
        double area = PI * radius * radius;

        if(area < 1001)
        {
            System.out.println("Area for Circle: " + area);
        }
        else
        {
            System.out.println("Area for Circle is too big! It is bigger then 1000!");
        }

        double roundOff = Math.round(area*100.0)/100.0;

        return roundOff;
    }
}
