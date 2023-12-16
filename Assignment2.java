//Rishikesh Chaudhari
//E11 23304

/*Polymorphism
Identify commonalities and differences between Publication, Book and Magazine classes. Title, Price, Copies are common instance variables and saleCopy is common method. The differences are, Bookclass has author and order Copies(). Magazine Class has methods orderQty, Currentissue, receiveissue().Write a program to find how many copies of the given books are ordered and display total sale of publication. */

package OOPL_codes;

import java.util.Scanner;

class Publication
{
    String title, author;;
    float price,copies;
    Scanner sc = new Scanner(System.in);
    float saleCopy(){
        System.out.println("The total sale of publication is "+ price*copies);
        return price*copies;
    } 
}

class Book extends Publication
{
    
    public void getDetails()
    {   
        
        System.out.print("Enter the title of the book : ");
        title = sc.next();
        System.out.print("Enter the name of author : ");
        author = sc.next();
        System.out.print("Enter the price of book : ");
        price = sc.nextFloat();
        System.out.print("Enter the copies of book : ");
        copies = sc.nextFloat();
    }
    public void displaySales()
    {
        System.out.println("The title of book is " + title);
        System.out.println("The author of book is " + author);
        System.out.println("The price of book is " + price);
        System.out.println("The total copies of book is " + copies);
        System.out.println("The total sale of book is " + saleCopy());
    }

    float saleCopy()
    {
        return price*copies;
    }
}

class Magazine extends Publication
{
    int currentIssue;
    void receiveIssue()
    {
         System.out.print("Enter the name of the magazine : ");
        title = sc.nextLine();
        System.out.print("Enter the name of the Publication : ");
        author = sc.nextLine();
        System.out.print("Enter the current issue no : ");
        currentIssue = sc.nextInt();
        System.out.print("Enter the price of the magazine : ");
        price = sc.nextFloat();
        System.out.print("Enter the copies of the magazine : ");
        copies = sc.nextFloat();
    }
    void displaySales()
    {
        System.out.println("The title of magazine is "+title);
        System.out.println("The author of magazine is " + author);
        System.out.println(("current Issue no. " + currentIssue));
        System.out.println("Price "+ price);
        System.out.println("Copies " + copies );
        System.out.println("Total sales "+saleCopy());
    }
    float saleCopy(){
        return price*copies;
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();
        Magazine m1 = new Magazine();
        System.out.println("book details");
        b1.getDetails();
        b1.displaySales();
        System.out.println();
        System.out.println("MAgazine details");
        m1.receiveIssue();
        m1.displaySales();
        System.out.println();
        System.out.println("Books sale " +b1.saleCopy());
        System.out.println("Magazine sale " +m1.saleCopy());
        System.out.println("Total sales "+ (b1.saleCopy()+m1.saleCopy()));
    }
}
