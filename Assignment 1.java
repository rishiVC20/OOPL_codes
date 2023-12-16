import java.util.Scanner;

class Complex
{
    float real, imag;
    //Default constructor
    Complex()
    {

    }
    
    //Parameterized Constructor
    Complex(float real, float imag)
    {
        this.real = real;
        this.imag = imag;
    }
    //Addition
    Complex Addition(Complex C1, Complex C2)
    {
        Complex Add = new Complex();
        Add.real = C1.real + C2.real;
        Add.imag = C1.imag + C2.imag;
        return Add;
    }
    //Subtraction
    Complex Subtraction(Complex C1, Complex C2)
    {
        Complex Subtract = new Complex();
        Subtract.real = C1.real - C2.real;
        Subtract.imag = C1.imag - C2.imag;
        return Subtract;
    }
    //Multiply
    Complex Multiplication(Complex C1, Complex C2)
    {
        Complex Multiply = new Complex();
        Multiply.real = (C1.real*C2.real) - (C1.imag*C2.imag);
        Multiply.imag = (C1.real*C2.imag) + (C1.imag*C2.real);
        return Multiply;
    }
    //Division
    Complex Division(Complex C1, Complex C2)
    {
        Complex divide = new Complex();
        divide.real = ((C1.real*C2.real)+(C1.imag*C2.imag))/((C2.real*C2.real)+(C2.imag*C2.imag));
        divide.imag = ((C1.imag*C2.real)-(C1.real*C2.imag))/((C2.real*C2.real)+(C2.imag*C2.imag));
        return divide;
    }
    //Printing Complex Number
    void printComplexNumber()
    {
       System.out.println(real + " + " + imag + "i");
    }
}

public class pracAssign1 {
    public static void main(String[] args)
    {
        //Taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st real numvber");
        float real1 = sc.nextFloat();
        System.out.println("Enter 1st imaginary number");
        float imag1 = sc.nextFloat();
        System.out.println("Enter 2nd real number");
        float real2 = sc.nextFloat();
        System.out.println("Enter 2nd imaginary number");
        float imag2 = sc.nextFloat();

       //Creating objects
        System.out.println();
        System.out.println("Printing given complex numbers");
        Complex C1 = new Complex(real1,imag1);
        C1.printComplexNumber();
        Complex C2 = new Complex(real2, imag2);
        C2.printComplexNumber();
        Complex C3 = new Complex();
        System.out.println();

        //Executing Program
        System.out.println("Addition");
        C3 = C3.Addition(C1,C2);
        C3.printComplexNumber();

        System.out.println("Subtraction");
        C3 = C3.Subtraction(C1,C2);
        C3.printComplexNumber();

        System.out.println("Multiplication");
        C3 = C3.Multiplication(C1,C2);
        C3.printComplexNumber();
        
        System.out.println("Division");
        C3 = C3.Division(C1,C2);
        C2.printComplexNumber();
    } 
}
