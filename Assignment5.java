//Rishikesh Chaudhari
//E11 23304

/*Interface
Design and develop a context for given case study and implement an interface for Vehicles Consider the example of vehicles like bicycle, car and bike. All Vehicles have common functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all these common functionalities. Bicycle, Bike, Car classes should be implemented for all these functionalities in their own class in their own way */

package OOPL_codes;

import java.util.Scanner;
interface Vehicle
{
    public abstract void gearChange(int g); //public abstract void ges
    public abstract void speedUp();
    public abstract void applyBrakes();//public abstract final int a
    public abstract void getStatus();
}

class Bicycle implements Vehicle
{
    int gear = 0;
    int speed = 15;
    public void gearChange(int g)
    {
        if (g>0 && g<6)
        {
            gear = g;
            System.out.println("Gear changed....");
        }
        else 
            System.out.println("Can't change gears!!");     
    }
    public void speedUp()
    {
        speed += 10;
        System.out.println("Speed has increased!!");
    }
    public void applyBrakes()
    {
        if (speed-10 >= 0)
        {
            speed -= 10;
            System.out.println("Brakes has been applied");
        }
        else
            System.out.println("Can't apply brakes!!");    
    }
    public void getStatus()
    {
        System.out.println("Speed of bicycle is " + speed + " km/hr");
        System.out.println("The bicycle is on " + gear + " gear");
    }
}

class Bike implements Vehicle
{
    int gear = 0;
    int speed = 25;
    public void gearChange(int g)
    {
        if (g>0 && g<6)
        {
            gear = g;
            System.out.println("Gear changed.....");
        }
        else
            System.out.println("Can't change gears!!");
    }
    public void speedUp()
    {
        speed += 10;
        System.out.println("Speed has increased!!");
    }
    public void applyBrakes()
    {
        if (speed-10 >= 0)
        {
            speed -= 10;
            System.out.println("Brakes has been applied!!");
        }
        else
            System.out.println("Can't apply brakes!!");
    }
    public void getStatus()
    {
        System.out.println("Speed of bike is " + speed + " km/hr");
        System.out.println("The bike is on " + gear + " gear");
    }
}

class Car implements Vehicle
{
    int gear = 0;
    int speed = 30;
    public void gearChange(int g)
    {
        if (g>0 && g<6)
        {
            gear = g;
            System.out.println("Gear changed.....");
        }
        else
            System.out.println("Can't change gears!!");
    }
    public void speedUp()
    {
        speed += 10;
        System.out.println("Speed has increased!!");
    }
    public void applyBrakes()
    {
        if (speed-10 >= 0)
        {
            speed -= 10;
            System.out.println("Brakes has been applied!!");
        }
        else
            System.out.println("Can't apply brakes!!");
    }
    public void getStatus()
    {
        System.out.println("Speed of car is " + speed + " km/hr");
        System.out.println("The bike is on " + gear + " gear");
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Vehicle v1;

        do
        {
            System.out.println();
            System.out.println("Welcome to Interface Program");
            System.out.println("1. For Bicycle\n2. For Bike\n3. For Car\n0. Exit");
            System.out.println("Which vehicle you want to drive");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1: 
                {
                    v1 = new Bicycle();
                    v1.gearChange(4);
                    v1.getStatus();
                    System.out.println();
                    v1.applyBrakes();
                    v1.getStatus();
                    System.out.println();
                    v1.speedUp();
                    v1.getStatus();
                    System.out.println();
                    v1.applyBrakes();
                    v1.getStatus();
                    break;
                }

                case 2:
                {
                    v1 = new Bike();
                    v1.gearChange(4);
                    v1.getStatus();
                    System.out.println();
                    v1.applyBrakes();
                    v1.getStatus();
                    System.out.println();
                    v1.speedUp();
                    v1.getStatus();
                    System.out.println();
                    v1.applyBrakes();
                    v1.getStatus();
                    break;
                }

                case 3:
                {
                    v1 = new Car();
                    v1.gearChange(4);
                    v1.getStatus();
                    System.out.println();
                    v1.applyBrakes();
                    v1.getStatus();
                    System.out.println();
                    v1.speedUp();
                    v1.getStatus();
                    System.out.println();
                    v1.applyBrakes();
                    v1.getStatus();
                    break;
                }
                case 0:
                {
                    System.out.println("Program terminated successfully");
                    System.exit(0);
                }
            }
        }
        while (choice != 0);
    }
}
