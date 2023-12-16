//Rishikesh Chaudhari
//E11 23304

/*Template
Implement a generic program using any collection class to count the number of elements in a collection that have a specific property such as even numbers, odd number, prime number andpalindromes. 
*/

package OOPL_codes;

import java.util.Scanner;

class Generics
{
    static boolean isPrime(int num)
    {
        for (int i=2; i<=num/2; i++)
        {
            if (num%i == 0)
                return false;
        }
        return true;
    }

    static <T> void countNums(String opt, T ele[])
    {
        int even=0, odd=0, palin=0, prime=0;
        if (opt == "EVEN"){
            for (T num:ele){
                if (Integer.parseInt(num.toString()) %2 ==0){
                    even++;
                }
            }
            System.out.println("Total even : " + even);
        }
        if (opt == "ODD"){
            for (T num:ele){
                if (Integer.parseInt(num.toString())%2 != 0){
                    odd++;
                }
            }
            System.out.println("Total odd : " + odd);
        }
        if (opt == "PRIME"){
            for (T num:ele){
                if (isPrime(Integer.parseInt(num.toString()))){
                    prime++;
                }
            }
            System.out.println("Total prime : " + prime);
        }
        if (opt == "PALIN"){
            for (T num:ele){
                StringBuilder sb = new StringBuilder(num.toString());
                if (sb.toString().equals(sb.reverse().toString()));
                    palin++;
            }
            System.out.println("Total palindrome : " + palin);
        }

    }
}

public class Assignment7 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        Integer intArray[] = {1, 2, 4,5,6,7,8};
        Byte byteArray[] = {1, 3, 5,6,7, 2, 8,9, 11};
        Short shortArray[] = {1, 3, 6, 7, 8, 9, 121, 343, 787, 10};
        String arr[] = {"ac", "bgb", "bb", "ada"};
        do{
            System.out.println("Enter operation for ");
            System.out.println("1. EVEN     2. ODD      3.PRIME     4. PALINDROME");
            num1 = sc.nextInt();
            switch(num1){
                case 1: Generics.countNums("EVEN",intArray);
                        break;
                case 2: Generics.countNums("ODD",byteArray);
                        break;
                case 3: Generics.countNums("PRIME", shortArray);
                        break;
                case 4: Generics.countNums("PALIN", arr);
                        break;                
            }
            System.out.println("Enter 1 for repetition");
            num2 = sc.nextInt();
        }
        while (num2 == 1);
    }
}
