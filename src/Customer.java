import java.util.Scanner;

public class Customer extends People {
    private String typeCar;

    @Override
    public void inPut() {
        super.inPut();
        System.out.println("Enter the typeCar : ");
        Scanner in = new Scanner(System.in);
        typeCar = in.nextLine();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("CarType : " + typeCar);
    }
}
