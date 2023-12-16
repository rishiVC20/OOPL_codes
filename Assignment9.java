//Rishikesh Chaudhari
//E11 23304

/*Factory Design Pattern
Implement Factory design pattern for the given context. Consider Car building process, which requires many steps from allocating accessories to final makeup. These steps should be written as methods and should be called while creating an instance of a specific car type. Hatchback, Sedan, SUV could be the subclasses of Car class. Car class and its subclasses, CarFactory and TestFactoryPattern should be implemented. */

package OOPL_codes;

import java.util.Scanner;
abstract class Car
{
    String company,carName;
    double price;

    abstract void getPrice(double price);
    abstract void getDetails(String comp, String carN);
    abstract void accessories();

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of company");
        company = sc.next();
        System.out.println("Enter name of car");
        carName = sc.next();
        System.out.println("Enter rough budget in lakhs");
        price = sc.nextDouble();
    }

    public void display(Car obj)
    {
        obj.getPrice(price);
        obj.getDetails(company, carName);
        obj.accessories();
    }
}

class CarFactory
{
    public Car buildCar(CarType ctype)
    {
            switch (ctype){
                case SMALL: 
                    return new SmallCar();

                case SEDAN: 
                    return new SedanCar();

                case HETCHBACK: 
                    return new HetchBackCar();

                case LUXURY: 
                    return new LuxuryCar();
            }
            return null;
    }
}

enum CarType
{
    SMALL, SEDAN, HETCHBACK, LUXURY;    
}

class HetchBackCar extends Car
{
    String featuresAvail;
    @Override
    void getPrice(double price)
    {
        if (price >5)
            featuresAvail = "YES";
        else
            featuresAvail = "NO";    
    }
    @Override
    public void getDetails(String comp,String carN)
    {
        System.out.println("Company : " + comp);
        System.out.println("Car name : " + carN);
        System.out.println("Colors : Black, White, Golden, Navy Blue");
        System.out.println("Gears : Auto");
    }

    @Override
    public void accessories()
    {
        System.out.println("Types of Wheels : MRF,CEAT");
        System.out.println("Airbags : " + featuresAvail);
        System.out.println("Back Wiper : " + featuresAvail);
        System.out.println("Touch screen music player : " + featuresAvail);
    }
}

class LuxuryCar extends Car
{
    String featuresAvail;
    @Override
    public void getPrice(double price)
    {
        if (price > 15)
            featuresAvail = "YES";
        else
            featuresAvail = "NO";    
    }

    @Override
    public void getDetails(String comp,String carN)
    {
        System.out.println("Company : " + comp);
        System.out.println("Car name : " + carN);
        System.out.println("Colors : Black, White, Golden, Silver, Navy Blue,Apple Red");
        System.out.println("Gears : Auto");
    }

    @Override
    public void accessories()
    {
        System.out.println("Types of Wheels : MRF,CEAT");
        System.out.println("Airbags : " + featuresAvail);
        System.out.println("Back Wiper : " + featuresAvail);
        System.out.println("Touch screen music player : " + featuresAvail);
        System.out.println("Sunroof : " + featuresAvail);
    }
}

class SedanCar extends Car
{
    String featuresAvail;
    @Override
    public void getPrice(double price)
    {
        if (price > 5)
            featuresAvail = "YES";
        else
            featuresAvail = "NO";    
    }

    @Override
    public void getDetails(String comp,String carN)
    {
        System.out.println("Company : " + comp);
        System.out.println("Car name : " + carN);
        System.out.println("Colors : Black, White, Navy Blue, Yellow, Purple");
        System.out.println("Gears : Manual");
    }

    @Override
    public void accessories()
    {
        System.out.println("Types of Wheels : MRF,CEAT");
        System.out.println("Airbags : " + featuresAvail);
        System.out.println("Back Wiper : " + featuresAvail);
        System.out.println("Touch screen music player : " + featuresAvail);
    } 
} 

class SmallCar extends Car
{
    String featuresAvail;
    @Override
    public void getPrice(double price)
    {
        if (price > 2)
            featuresAvail = "YES";
        else
            featuresAvail = "NO";    
    }

    @Override
    public void getDetails(String comp,String carN)
    {
        System.out.println("Company : " + comp);
        System.out.println("Car name : " + carN);
        System.out.println("Colors : Black, White, Grey, Navy Blue, Yellow, Purple");
        System.out.println("Gears : Manual");
    }

    @Override
    public void accessories()
    {
        System.out.println("Types of Wheels : MRF,CEAT");
        System.out.println("Airbags : " + featuresAvail);
        System.out.println("Back Wiper : " + featuresAvail);
        System.out.println("Touch screen music player : " + featuresAvail);
    } 
}
public class Assignment9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        CarFactory carFactory = new CarFactory();
        do
        {
            System.out.println();
            System.out.println("Welcome to Factory Design Pattern program");
            System.out.println("1. Small Car\n2. Sedan Car\n3. HetchBack Car\n4. Luxury Car");
            System.out.print("Enter which car you want to build : ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1: Car obj = carFactory.buildCar(CarType.SMALL);
                        obj.input();
                        obj.display(obj);
                        break;
                   
                case 2: Car obj1 = carFactory.buildCar(CarType.SEDAN);
                        obj1.input();
                        obj1.display(obj1);
                        break;
                        
                case 3: Car obj2 = carFactory.buildCar(CarType.HETCHBACK);
                        obj2.input();
                        obj2.display(obj2);
                        break;

                case 4: Car obj3 = carFactory.buildCar(CarType.LUXURY);
                        obj3.input();
                        obj3.display(obj3);
                        break;        
                        
                case 0: System.out.println("Program Terminated Successfully!!");
                        System.exit(1);
                        break;
                  
                default: System.out.println("Please enter valid input");
                        
            }
        }
        while (choice != 0);
    }
}