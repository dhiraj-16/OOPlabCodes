import java.util.Scanner;

abstract class shape{

    double b, h, l, be;

    abstract void compulte_area();

}

class triangle extends shape {

    double area;



    @Override

    void compulte_area() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of base:");

        b = sc.nextDouble();

        System.out.println("enter the value of height:");

        h = sc.nextDouble();

        area = 0.5 * b * h;

        System.out.println("the area of the triangle is:" + area);

    }
}

class rectangle extends shape {

    double arear;



    void compulte_area() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of base:");

        be = sc.nextDouble();

        System.out.println("enter the value of height:");

        l = sc.nextDouble();

        arear = be * l;

        System.out.println("the area of the rectangle is:" + arear);

    }
}

class area {

    public static void main(String args[]){

        shape s=new triangle();

        s.compulte_area();

        shape r=new rectangle();

        r.compulte_area();

    }

}
