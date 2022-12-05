import java.util.*;
class Publication
{
    String title;
    int copies,price;

    int sellcopy()
    {
        System.out.println("Total sale of publication is "+(copies * price));
        return(copies * price);
    }
    void setcopies(int c)
    {
        copies=c;
    }
    void setprice(int p)
    {
        price=p;
    }
}
class Book extends Publication
{
    String Author;
    int bprice,bcopies;
    public void order_copies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the Book: ");
        title = sc.nextLine();
        System.out.println("Enter Auhor: ");
        Author = sc.nextLine();
        System.out.println("Enter the number of copies of book: ");
        bcopies = sc.nextInt();
        setcopies(bcopies);
        System.out.println("Enter the price of book: ");
        bprice = sc.nextInt();
        setprice(bprice);
    }

    int sellcopy()
    {
        System.out.println("******Total Sale of book is: " +(copies * price)+"/-  ******");
        return (copies * price);
    }


}
class Magazine extends Publication
{
    int order_quantity,mprice, mcopies;
    String current_issue;

    public void receive_issue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Order Quantity: ");
        mcopies=sc.nextInt();
        setcopies(mcopies);
        System.out.println("Enter the price of Magazine: ");
        mprice = sc.nextInt();
        setprice(mprice);
    }

    int sellcopy()
    {
        System.out.println("******Total Sale of Magazine is: " + (copies * price)+"/-  ******");
        return (copies * price);
    }
}
class assignment03
{
    public static void main(String args[]) {


        Book b = new Book();
        Magazine m = new Magazine();
        Scanner sc = new Scanner(System.in);


//        for (int i = 0; i < 3; i++) {
            int flag = 0;
            int ch = 0;

            while (flag == 0) {
                System.out.println("Enter the choice");
                System.out.println("1.Books\n2.Magazine\n3.Total sale details\n4.Exit");
                ch = sc.nextInt();
                System.out.println("--------------------------------------------------------------");
                switch (ch) {
                    case 1:
                        b.order_copies();
                        b.sellcopy();
                        System.out.println("Number of copies of book sold :" + b.copies);
                        System.out.println("==================================================================");

                        break;
                    case 2:
                        m.receive_issue();
                        m.sellcopy();
                        System.out.println("Number of copies of Magazine sold :" + m.copies);
                        System.out.println("==================================================================");

                        break;
                    case 3:
                        System.out.println("Total number of Books and Magazine sold : " + (b.copies + m.copies));
                        System.out.println("Today's Total sale  : " + ((b.copies * b.price) + (m.copies * m.price)));

                        break;
                    default:
                        flag =1;
                        break;
                }
            }

    } }