//package StrategyDesignPattern
import java.io.*;
import java.util.*;
import java.util.ArrayList;
interface paymentstratergy{
    public void pay(int amount);
}

class ShoppingCart{
    ArrayList<Item>items=new ArrayList<Item>();
    ShoppingCart(){
        this.items=items;
    }
    void additems(Item item){
        items.add(item);

    }
    void removeitems(Item item){
        items.remove(item);

    }
    int calculatetotal(){
        int sum=0;
        for(Item item:items){
            sum=sum+item.getprice();
        }

        return sum;
    }
    void pay(paymentstratergy paymethod){
        int amount=calculatetotal();
        paymethod.pay(amount);
    }
}
class Item{
    String upcode;
    int price;
    Item(String upc,int p){
        this.upcode=upc;
        this.price=p;
    }
    String getupcode(){
        return this.upcode;
    }
    int getprice(){
        return this.price;
    }
}

class PayPalStrategy implements paymentstratergy{
    String emailid;
    String password;
    PayPalStrategy(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the email id");
        emailid=sc.next();
        System.out.println("enter the password:");
        password=sc.next();
    }
    public void pay(int amount){
        System.out.println(+amount+"pay through paypal");

    }
}

class CreditCardStrategy implements paymentstratergy{
    String creditcardno;
    String name;
    String cardtype;
    String expdate;
    String cvv;
    CreditCardStrategy(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the person :");
        name=sc.next();
        System.out.println("enter the card number:");
        creditcardno=sc.next();
        System.out.println("enter the cvv= ");
        cvv=sc.next();
        System.out.println("the expdate:");
        expdate=sc.next();

    }
    public void pay(int amount){
        System.out.println(+amount+"paid through credit card");
    }

}

class BitcoinStrategy implements paymentstratergy{
    String emailId;
    String password;
    BitcoinStrategy()
    {
        Scanner sc = new Scanner(System.in);;
        System.out.println("Enter email id=");
        emailId = sc.next();
        System.out.println("Enter password=");
        password = sc.next();
    }
    public void pay(int amount)
    {
        System.out.println(amount+" paid through Bitcoin");
    }
}


public class strategy_assign11 {
    public static void main(String[]args)
    {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("abc",200);
        Item item2 = new Item("xyz",300);
        Item item3 = new Item("pqr",1000);
        cart.additems(item1);
        cart.additems(item2);
        cart.additems(item3);
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Total bill is Rs. "+cart.calculatetotal());
        System.out.println("Enter your Payment Choice choice \n1.Credit Card \n2.Pay Pal \n3.Bitcoin");
        ch = sc.nextInt();

        switch(ch){
            case 1:
                cart.pay(new CreditCardStrategy());

                break;
            case 2:
                cart.pay(new PayPalStrategy());
                break;
            case 3:
                cart.pay(new BitcoinStrategy());
                break;
    }
}}