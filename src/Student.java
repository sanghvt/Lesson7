
import java.util.Scanner;

public class Student extends People {
    private float subjectPoint1, subjectPoint2;

    public float getSubjectPoint1() {
        return subjectPoint1;
    }

    public float getSubjectPoint2() {
        return subjectPoint2;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the subjectPoint1 : ");
        subjectPoint1 = in.nextFloat();

        System.out.println("Enter the subjectPoint2 : ");
        subjectPoint2 = in.nextFloat();
    }
    public float sumPoint(){
        return subjectPoint2+subjectPoint1;
    }
    public void editInfo(Student sinhvien){
        setName(sinhvien.getName());
        setAdress(sinhvien.getAdress());
    };
    public void editPoint(Student student){
        Scanner in = new Scanner(System.in);
        boolean run = true;
        int choice;
        System.out.println(" 1. Edit Subject Point 1");
        System.out.println(" 2. Edit Subject Point 2");
        choice = in.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Enter the exact point :");
                student.subjectPoint1 = in.nextFloat();
                break;
            }
            case 2:{
                System.out.println("Enter the exact point :");
                student.subjectPoint2 = in.nextFloat();
                break;
            }
        }
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Subject Point 1 : " + subjectPoint1);
        System.out.println("Subject Point 1 : " + subjectPoint2);
    }
}
