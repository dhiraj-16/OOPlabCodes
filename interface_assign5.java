import java.util.*;

interface vehicle{

    public void speed();

    public void gearchange();

    public void  applybreak();

}

class car implements vehicle {
    int speed,gear,breakapply;
    @Override

    public void speed() {

        System.out.println("enter the speed of the vehicle:");

        Scanner sc = new Scanner(System.in);

        speed = sc.nextInt();

        System.out.println("the speed is:" + speed);
    }
    public void gearchange() {

        System.out.println("enter the gear number");

        Scanner sc = new Scanner(System.in);

        gear = sc.nextInt();

        System.out.println("the gear no is :" + gear);
    }
    public void applybreak() {

        System.out.println("enter the break no:");

        Scanner sc = new Scanner(System.in);

        breakapply = sc.nextInt();

        if (breakapply == 1) {

            System.out.println("the breaks are succesfully applied ");

        } else {

            System.out.println("the breaks are not successfully applied");

        }
    }

}

class bike implements vehicle {

    int speed,gear,breakapply;

    @Override

    public void speed() {

        System.out.println("enter the speed of the bike:");

        Scanner sc = new Scanner(System.in);

        speed = sc.nextInt();

        System.out.println("the speed is:" + speed);

    }


    public void gearchange() {

        System.out.println("enter the gear number of the bike");

        Scanner sc = new Scanner(System.in);

        gear = sc.nextInt();

        System.out.println("the gear no is :" + gear);

    }
    public void applybreak() {

        System.out.println("enter the break no of the bike:");

        Scanner sc = new Scanner(System.in);

        breakapply = sc.nextInt();

        if (breakapply == 1) {

            System.out.println("the breaks are succesfully applied ");

        } else {

            System.out.println("the breaks are not successfully applied");
        }
    }
}
class bicycle implements vehicle {

    int speed;

    int gear;

    int breakapply;


    @Override

    public void speed() {

        System.out.println("enter the speed of the bicycle :");

        Scanner sc = new Scanner(System.in);

        speed = sc.nextInt();

        System.out.println("the speed is:" + speed);

    }


    public void gearchange() {

        System.out.println("enter the gear number og the bicycle");

        Scanner sc = new Scanner(System.in);

        gear = sc.nextInt();

        System.out.println("the gear no is :" + gear);


    }


    public void applybreak() {

        System.out.println("enter the break no of the bicycle:");

        Scanner sc = new Scanner(System.in);

        breakapply = sc.nextInt();

        if (breakapply == 1) {

            System.out.println("the breaks are succesfully applied ");

        } else {

            System.out.println("the breaks are not successfully applied");
        }
    }
}

class info {

    public static void main(String args[]) {

        int ch;

        System.out.println("enter the choice number :");

        Scanner sc = new Scanner(System.in);

        ch = sc.nextInt();

        switch (ch) {

            case 1:

                car c = new car();

                c.speed();

                c.gearchange();

                c.applybreak();

                break;

            case 2:

                bike b = new bike();

                b.speed();

                b.gearchange();

                b.applybreak();

                break;

            case 3:

                bicycle bi = new bicycle();

                bi.speed();

                bi.gearchange();

                bi.applybreak();

                break;
        }
    }

}

