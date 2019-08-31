import java.util.Scanner;

public class Employee extends People {
    private float salary;
    private String position;

    @Override
    public void inPut() {
        super.inPut();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Position : ");
        position = in.nextLine();
        System.out.println("Enter the salary");
        salary = in.nextFloat();
    }
    public void editInfo(Employee employ){
        setName(employ.getName());
        setAdress(employ.getAdress());
    }
    public void editDetail(Employee employ){
        Scanner in = new Scanner(System.in);
        boolean run = true;
        int choice;
        System.out.println(" 1. Edit Salary");
        System.out.println(" 2. Edit Position");
        choice = in.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Enter the current salary :");
                employ.salary = in.nextFloat();
                break;
            }
            case 2:{
                System.out.println("Enter the current Position :");
                employ.position = in.nextLine();
                break;
            }
        }
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Salary : " + salary);
        System.out.println("Position: " + position);
    }
}
