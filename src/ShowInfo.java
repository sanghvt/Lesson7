import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ShowInfo {
    public static void main(String[] args) {
        People people;
        System.out.println("Choice the people type : ");
        System.out.println("1. Student");
        System.out.println("2. Employee");
        System.out.println("3. Customer");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 1 :{
                people  = new Student();
                people.inPut();
                System.out.println("Info Student : ");
                people.outPut();
                break;
            }
            case 3 :{
                people  = new Customer();
                people.inPut();
                System.out.println("Info Customer : ");
                people.outPut();
                break;
            }
            case 2:{
                people  = new Employee ();
                people.inPut();
                System.out.println("Info Employee : ");
                people.outPut();
                break;
            }
        }
    }
}
