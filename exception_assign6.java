import java.util.*;

public class exception_assign6{
    public static void main(String args[]){
        try{
            int num1,num2;
            int n;
            int array[]=new int [5];
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number:");
            num1=Integer.parseInt(sc.nextLine());
            System.out.println("enter the number:");
            num2=Integer.parseInt(sc.nextLine());
            float div= num1/num2;
            System.out.println("the division of the numbers would be:"+div);
            System.out.println("\n enter the value of n");
            n=Integer.parseInt(sc.nextLine());
            array[n]=8;
            System.out.print(+array[n]);


        }
        catch(ArithmeticException e1){
            System.out.println("arithematic eception error!!!please cheak the inputs again");
        }
        catch(NumberFormatException e1){
            System.out.println(" number format exception error!!!please cheak the inputs again");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}