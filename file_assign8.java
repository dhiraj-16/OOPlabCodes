import java.awt.desktop.SystemEventListener;

import java.io.*;


import java.io.File;


import java.util.*;

public class file_assign8 {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public void addRecords() throws IOException {

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st.txt", true)));


        String studentname, address;


        int studentid, rollno, Class;


        float marks;


        String s;


        boolean addMore = false;


// Read Data


        do {


            System.out.print("\nEnter Student Name: ");


            studentname = br.readLine();


            System.out.print("Student Id: ");


            studentid = Integer.parseInt(br.readLine());


            System.out.print("Roll no: ");


            rollno = Integer.parseInt(br.readLine());


            System.out.print("Address: ");


            address = br.readLine();


            System.out.print("Class: ");


            Class = Integer.parseInt(br.readLine());


            System.out.print("Marks : ");


            marks = Float.parseFloat(br.readLine());

            pw.println(studentname + " " + studentid + " " + rollno + " " + address + " " + Class + " " + marks);


            System.out.print("\nRecords added successfully !\n\nDo you want to add more records ? (y/n) : ");


            s = br.readLine();


            if (s.equalsIgnoreCase("y")) {


                addMore = true;


                System.out.println();


            } else


                addMore = false;


        }


        while (addMore);


        pw.close();


        showmenu();

    }

    public void readreader() throws IOException {

        try {

            BufferedReader file = new BufferedReader(new FileReader("st.text"));

            String name;


            int i = 1;

            while ((name = file.readLine()) != null) ;

            {

                System.out.println(name);

                System.out.print("");

            }

            file.close();

            showmenu();


        } catch (FileNotFoundException e) {

            System.out.println("the file not found!!!");

        }

    }

    public void searchrecords() throws IOException {

        try {

            BufferedReader file = new BufferedReader(new FileReader("st.txt"));

            String name;

            int flag = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("enter the id of the student:");

            String searchname = sc.next();

            while ((name = file.readLine()) != null) {

                String[] line = name.split("");

                if (searchname.equalsIgnoreCase(line[1])) {

                    System.out.println("record form");

                    System.out.println(name);

                    System.out.println("");

                    flag = 1;

                    break;

                }

            }

            if (flag == 0) {

                System.out.println("record not found");

                file.close();

                showmenu();


            }

        } catch (FileNotFoundException e) {

            System.out.println("the file is not found");


        }


    }

    public void deleterecords() throws IOException {

        try {

            BufferedReader file1 = new BufferedReader(new FileReader("st.txt"));

            PrintWriter pw = new PrintWriter(new FileWriter("st1.txt"));

            String name;

            int flag = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("enter the number of the student you want to delete:");

            String searchname = sc.next();

            while ((name = file1.readLine()) != null) {

                String[] line = name.split("");

                if (!searchname.equalsIgnoreCase(line[0])) {

                    pw.println(name);

                    flag = 0;


                } else {

                    System.out.println("record found");

                    flag = 1;


                }

            }

            file1.close();

            pw.close();

            File delname = new File("st.txt");

            File oldname = new File("st1.txt");

            File newName = new File("st.txt");

            if (delname.delete()) {

                System.out.println("deleted sucessfully");


            } else {

                System.out.println("error");

            }

            if (oldname.renameTo((newName))) {

                System.out.println("renamed sucessfully");

            } else {

                System.out.println("error");


            }

            showmenu();


        } catch (FileNotFoundException e) {

            System.out.println("\n ERROR FILE NOT FOUND");


        }

    }

    public void updaterecords() throws IOException {

        try {

            BufferedReader file1 = new BufferedReader(new FileReader("st.txt"));

            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st1.txt", true)));

            String name;

            int flag = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("enter the nameof the student you want to update:");

            String searchname = sc.next();

            while ((name = file1.readLine()) != null) {

                String[] line = name.split("");

                if (!searchname.equalsIgnoreCase(line[0])) {

                    pw.println(name);

                    flag = 0;

                } else {

                    System.out.println("record found");

                    System.out.println("enter the updated markks:");

                    String up_marks = sc.next();

                    pw.println(line[0] + " " + line[1] + " " + line[2] + " " + line[3] + " " + line[4] + " " + up_marks);

                    flag = 1;


                }

            }

            file1.close();


            pw.close();


            File delName = new File("st.txt");


            File oldName = new File("st1.txt");


            File newName = new File("st.txt");


            if (delName.delete())


                System.out.println("record updated successfully");


            else


                System.out.println("Error");


            if (oldName.renameTo(newName))


                System.out.println("Renamed successfully");


            else


                System.out.println("Error");


            showmenu();

        } catch (FileNotFoundException e) {

            System.out.println("error exception");


        }

    }

    public void showmenu() throws IOException {


        System.out.println("");


        System.out.print("1. Add Records\n2. Display Records\n3. Clear All Records\n4. Search Records\n5.Delete Records\n6. Update Records \n7. Exit\n\nEnter your choice : ");


        int choice = Integer.parseInt(br.readLine());


        System.out.println("");

        switch (choice) {


            case 1:


                addRecords();


                break;


            case 2:


                readreader();


                break;


            case 3:


                searchrecords();


                break;


            case 4:


                deleterecords();


                break;


            case 5:


                updaterecords();


                break;

            case 6:


                System.exit(0);

                break;


            default:


                System.out.println("\nInvalid Choice !");


                break;

        }

    }

    public static void main(String args[]) throws IOException {

        file_assign8 call = new file_assign8();

        call.showmenu();

    }

}
