//Rishikesh Chaudhari
//E11 23304

/* Strategy Design Pattern
Implement and apply Strategy Design pattern for simple Shopping Cart where three payment strategies are used such as Credit Card, PayPal, BitCoin. Create an interface for strategy pattern and give concrete implementation for payment 
*/

package OOPL_codes;

import java.util.Scanner;

interface PaymentStrategy{
    public abstract void pay(int amount);
}

class CreditCardPaymentStrategy implements PaymentStrategy 
{
    private String cardNumber;
    CreditCardPaymentStrategy(String cardNumber){
        this.cardNumber = cardNumber;
    } 
    @Override
    public void pay(int amount){
        System.out.println("Paid " + amount + " with Credit Card ending with " + cardNumber.substring(cardNumber.length()-4));
    }
}

class PayPalPaymentStrategy implements PaymentStrategy{
    private String email;
    PayPalPaymentStrategy(String email){
        this.email = email;
    }
    @Override
    public void pay(int amount){
        System.out.println("Paid "+amount+" using PayPal with email "+email);
    }
}

class BitCoinPaymentStrategy implements PaymentStrategy{
    private String bitcoinaddress;
    BitCoinPaymentStrategy(String bitcoinaddress){
        this.bitcoinaddress = bitcoinaddress;
    }
    @Override
    public void pay(int amount){
        System.out.println("Paid "+amount+" using BitCoin with bitcoin address " + bitcoinaddress);
    }
}
class ShoppingCart{
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
} 
public class Assignment10 {
    public static void main(String[] args){
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy("1234-5678-9012-3456");
        PaymentStrategy payPalStrategy = new PayPalPaymentStrategy("modi@gmail.com");
        PaymentStrategy bitcoinStrategy = new BitCoinPaymentStrategy("123PYTG4455ljgjgjg");
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Select Payment Method:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. BitCoin");
            System.out.println("0. Exit");
            System.out.print("Enter your choice ");
            choice = sc.nextInt();
            switch(choice){
                case 1: cart.setPaymentStrategy(creditCardPaymentStrategy);
                        break;
                case 2: cart.setPaymentStrategy(payPalStrategy); 
                        break;
                case 3: cart.setPaymentStrategy(bitcoinStrategy);  
                        break;
                case 0:System.out.println("Exiting program.");
                        break;
                default: System.out.println("Invalid choice. Please enter a valid option.");
                        break;                     
            }
            if (choice != 0){
                System.out.print ("Enter amount");
                int amount = sc.nextInt();
                cart.checkout(amount);
            }
        }
        while (choice != 0);
        sc.close();
    }
}
