import java.util.Scanner;

public class BillDays extends Bill{
    private int day;

    BillDays(){
        cout++;
    }
    @Override
    public void inPut() {
        super.inPut();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter unit price/day: ");
        int unitPrice = in.nextInt();
        setUnitPrice(unitPrice);

        System.out.println("Enter the rented day : ");
        day = in.nextInt();
    }

    @Override
    public void outPut() {
        System.out.println(" Bill " + cout + ":");
        super.outPut();
        System.out.println("/Day");
        System.out.println("Grand Total : " + getGrandTotal() + " USD");
    }
    double getGrandTotal(){
        if (day <= 7) return day * getUnitPrice();
        else return 7 * getUnitPrice() + (day - 7) * getUnitPrice() * 0.2;
    }
}
