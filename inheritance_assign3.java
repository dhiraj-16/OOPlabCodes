import  java.util.*;

class Employee {

    int employee_id;

    String moblieno,address,name,mail;

    void getdata() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name of the employee:");

        name = sc.nextLine();

        System.out.println("enter the  email id of the employee:");

        mail = sc.nextLine();

        System.out.println("enter the moblie no of the employee:");

        moblieno = sc.nextLine();

        System.out.println("enter the address of the employee:");

        address = sc.nextLine();

        System.out.println("enter the employee id :");

        employee_id = sc.nextInt();

    }



    void display() {

        System.out.println("the name of the employee is :" + name);

        System.out.println("the emailid of the employee is:" + mail);

        System.out.println("the moblie no of the employee is:" + moblieno);

        System.out.println("the address of the employee is:" + address);

        System.out.println("the employee id is : " + employee_id);

    }



}

class programmer extends Employee{

    double basicpay;

    double netsalary,grosssalary;

    void getinfo(){

        System.out.println("enter the basic pay of programmer:");

        Scanner sc=new Scanner(System.in);

        basicpay=sc.nextDouble();


    }

    void salary_calculation(){

        grosssalary = basicpay + (basicpay * 0.97) + (basicpay * 0.1);

        netsalary = grosssalary  - (basicpay * 0.001) - (basicpay * 0.12);

    }

    void displaysalary() {

        System.out.print("\nThe DA :: " + basicpay * 0.97);

        System.out.print("\nThe HRA:: " + basicpay * 0.10);

        System.out.print("\nThe PF:: " + basicpay * 0.12);

        System.out.print("\nThe Staff club fund:: " + basicpay * 0.001);

        System.out.print("\nThe Gross Salary:: " + grosssalary);

        System.out.print("\nThe Net Salary:: " + netsalary + "\n");

        System.out.print("\n<<---------------------------------->>");

    }

}

class teamlead extends Employee{

    double basicpay;

    double netsalary,grosssalary;

    void getinfo(){

        System.out.println("enter the basic pay:");



        Scanner sc=new Scanner(System.in);

        basicpay=sc.nextDouble();



    }

    void salary_calculation(){

        grosssalary = basicpay + (basicpay * 0.97) + (basicpay * 0.1);

        netsalary = grosssalary  - (basicpay * 0.001) - (basicpay * 0.12);

    }

    void displaysalary() {

        System.out.print("\nThe DA :: " + basicpay * 0.97);

        System.out.print("\nThe HRA:: " + basicpay * 0.10);

        System.out.print("\nThe PF:: " + basicpay * 0.12);

        System.out.print("\nThe Staff club fund:: " + basicpay * 0.001);

        System.out.print("\nThe Gross Salary:: " + grosssalary);

        System.out.print("\nThe Net Salary:: " + netsalary + "\n");

        System.out.print("\n<<---------------------------------->>");

    }



}

class assistantprojectmanager extends Employee{

    double basicpay;

    double netsalary,grosssalary;

    void getinfo(){

        System.out.println("enter the basic pay:");

        Scanner sc=new Scanner(System.in);

        basicpay=sc.nextDouble();



    }

    void salary_calculation(){

        grosssalary = basicpay + (basicpay * 0.97) + (basicpay * 0.1);

        netsalary = grosssalary  - (basicpay * 0.001) - (basicpay * 0.12);

    }

    void displaysalary() {

        System.out.print("\nThe DA :: " + basicpay * 0.97);

        System.out.print("\nThe HRA:: " + basicpay * 0.10);

        System.out.print("\nThe PF:: " + basicpay * 0.12);

        System.out.print("\nThe Staff club fund:: " + basicpay * 0.001);

        System.out.print("\nThe Gross Salary:: " + grosssalary);

        System.out.print("\nThe Net Salary:: " + netsalary + "\n");

        System.out.print("\n<<---------------------------------->>");

    }

}

class projectmaneger extends Employee{

    double basicpay;

    double netsalary,grosssalary;

    void getinfo(){

        System.out.println("enter the basic pay:");

        Scanner sc=new Scanner(System.in);

        basicpay=sc.nextDouble();



    }

    void salary_calculation(){

        grosssalary = basicpay + (basicpay * 0.97) + (basicpay * 0.1);

        netsalary = grosssalary  - (basicpay * 0.001) - (basicpay * 0.12);

    }

    void displaysalary() {

        System.out.print("\nThe DA :: " + basicpay * 0.97);

        System.out.print("\nThe HRA:: " + basicpay * 0.10);

        System.out.print("\nThe PF:: " + basicpay * 0.12);

        System.out.print("\nThe Staff club fund:: " + basicpay * 0.001);

        System.out.print("\nThe Gross Salary:: " + grosssalary);

        System.out.print("\nThe Net Salary:: " + netsalary + "\n");

        System.out.print("\n<<---------------------------------->>");

    }



}

class inheritance_assign3{

    public static void main(String arg[]){

        int ch;

        System.out.println("1.programmer\n2.team lead\n3.assisant project maneger\n4.project maneger");

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of choice:");

        ch=sc.nextInt();

        switch(ch){

            case 1:

                programmer p=new programmer();

                p.getdata();

                p.display();

                p.getinfo();

                p.salary_calculation();

                p.displaysalary();

            case 2:

                teamlead t=new teamlead();

                t.getdata();

                t.display();

                t.getinfo();

                t.salary_calculation();

                t.displaysalary();

            case 3:

                assistantprojectmanager a=new assistantprojectmanager();

                a.getdata();

                a.display();

                a.getinfo();

                a.salary_calculation();

                a.displaysalary();

            case 4:

                projectmaneger p1=new projectmaneger();

                p1.getdata();

                p1.display();

                p1.getinfo();

                p1.salary_calculation();

                p1.displaysalary();

        }



    }

}
