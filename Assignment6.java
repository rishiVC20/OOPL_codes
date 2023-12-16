//Rishikesh Chaudhari
//E11 23304

/* Exception handling
Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2 are not integers, the program would throw a Number Format Exception. If Num2 were zero, the program would throw an Arithmetic Exception. Display the exception. 
*/

package OOPL_codes;

import java.util.Scanner;
// import java.util.InputMismatchException;
import java.util.InputMismatchException;

public class Assignment6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ch;
        do
        {
            System.out.println();
            System.out.println("-----WELCOME TO EXCEPTION HANDLING CODE-----");
            System.out.println();
            System.out.println("1. Arithmetic Exception\n2. Array Out of Bound Excpetion\n3. Input Mismatch Exception\n4. Number Format Exception");
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1: try{
                            System.out.println("Let's perform division");
                            System.out.println("Enter numerator");
                            int numerator = sc.nextInt();
                            System.out.println("Enter denominator");
                            int denominator = sc.nextInt();
                            System.out.println("The result of division is " + numerator/denominator);
                }
                catch(ArithmeticException e){
                    System.out.println("Arithmetic Exception occurred !! " + e.getMessage());
                }
                break;

                case 2: try{
                            System.out.println("Enter size of array ");
                            int size = sc.nextInt();
                            int[] arr = new int[size];
                            System.out.println("Enter elements in array");
                            for (int i=0; i<size; i++){
                                arr[i] = sc.nextInt();
                            }
                            System.out.println("Enter which index of array is need to found");
                            int index = sc.nextInt();
                            System.out.println("The element at that index is " + arr[index]);
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array Index Out of Bounds exception occurred " + e.getMessage());
                }
                break;

                case 3: try{
                            System.out.println("Enter two numbers ");
                            int num1 = sc.nextInt();
                            int num2 = sc.nextInt();
                            System.out.println("Addition of two numbers is " + (num1+num2));
                            System.out.println("Subtraction of 1st number from 2nd number is " + (num2-num1));
                            System.out.println("Multiplication of two numbers is " + num1*num2);
                            System.out.println("Division of 1st number from 2nd number " + num2/num1);
                }
                catch(InputMismatchException e){
                    System.out.println("Input Mismatch Exception occured!! " + e.getMessage());
                }
                

                case 4:try{
                        System.out.println("Enter a valid number");
                        int number = Integer.parseInt(sc.next());
                        System.out.println("You have entered " + number);
                }
                catch(NumberFormatException e){
                    System.out.println("Number Format Exception occurred " + e.getMessage());
                }
                break;

                default: System.out.println("Enter valid choice");
                        break;
            }
            System.out.println("Enter 1 for repetition");
            ch = sc.nextInt();
        }
        while (ch == 1);
    }
}
