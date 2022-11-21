
import java.util.Scanner;
class ComplexNumber {
    float real;
    float imag;

    ComplexNumber() {
        real = 0;

        imag = 0;
    }

    ComplexNumber(float a, float b) {
        this.real = a;
        this.imag = b;
    }

    public void showComplex()
    {
        System.out.println("Complex number is : " + this.real + " + " + this.imag + "i");
    }

    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2)
    {
        ComplexNumber result = new ComplexNumber(0, 0);
        result.real = c1.real + c2.real;
        result.imag = c1.imag + c2.imag;

        return result;
    }

    public ComplexNumber sub(ComplexNumber c1, ComplexNumber c2)
    {
        ComplexNumber result2 = new ComplexNumber(0, 0);
        result2.real = c1.real - c2.real;
        result2.imag = c1.imag - c2.imag;

        return result2;
    }

    public ComplexNumber mul(ComplexNumber c1, ComplexNumber c2)
    {
        ComplexNumber result3 = new ComplexNumber(0, 0);
        result3.real = (c1.real * c2.real) - (c1.imag * c2.imag);
        result3.imag = (c1.real * c2.imag) + (c1.imag * c2.real);

        return result3;
    }

    public ComplexNumber div(ComplexNumber c1, ComplexNumber c2)
    {
        ComplexNumber result4 = new ComplexNumber(0, 0);
        result4.real = ((c1.real * c2.real) + (c1.imag * c2.imag)) / ((c2.real * c2.real) + (c2.imag * c2.imag));
        result4.imag = ((c1.imag * c2.real) - (c1.real * c2.imag)) / ((c2.real * c2.real) + (c2.imag * c2.imag));

        return result4;
    }

}
public class ComplexAdd
{
    public static void main(String[] args)
    {
        int x;

        //using do while loop to change the previous user input

        do {
            ComplexNumber calci = new ComplexNumber();
            // Taking input from user
            System.out.println("Enter the real part of First complex number");
            Scanner sc1 = new Scanner(System.in);
            float real = sc1.nextFloat();
            System.out.println("Enter the imaginary part of First complex number");
            Scanner sc2 = new Scanner(System.in);
            float imag = sc2.nextFloat();
            ComplexNumber obj1 = new ComplexNumber(real, imag);

            System.out.println("Enter the real part of Second complex number");
            Scanner sc3 = new Scanner(System.in);
            float real1 = sc3.nextFloat();
            System.out.println("Enter the imaginary part of Second complex number");
            Scanner sc4 = new Scanner(System.in);
            float imag1 = sc4.nextFloat();
            ComplexNumber obj2 = new ComplexNumber(real1, imag1);
            System.out.print("The First complex number is : ");
            obj1.showComplex();
            System.out.print("The Second complex number is : ");
            obj2.showComplex();


            // do while loop to take choice from user repeatedly until the condition is true
            do {
                System.out.println("1 for Addition\n2 for Substraction\n3 for Multiplication\n4 for Division\n5 for change the input\n6 for exit");
                System.out.println("Enter Your Choice");
                Scanner sc7 = new Scanner(System.in);
                x = sc7.nextInt();
                switch (x) {
                    case 1:
                        ComplexNumber result = calci.add(obj1, obj2);
                        System.out.print("Addition of complex number is : ");
                        result.showComplex();
                        break;
                    case 2:
                        ComplexNumber result2 = calci.sub(obj1, obj2);
                        System.out.print("Subtraction of complex number is : ");
                        result2.showComplex();
                        break;
                    case 3:
                        ComplexNumber result3 = calci.mul(obj1, obj2);
                        System.out.print("Multiplication of complex number is : ");
                        result3.showComplex();
                        break;
                    case 4:
                        ComplexNumber result4 = calci.div(obj1, obj2);
                        System.out.print("Division of complex number is : ");
                        result4.showComplex();
                        break;
                    case 6:
                        break;
                }
            } while (x < 5);
        } while (x == 5);
    }
}