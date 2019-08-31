import java.util.Scanner;

public class BillHours extends Bill{
    private int hour;
    BillHours(){
        cout ++;
    }
    @Override
    public void inPut() {
        super.inPut();
//        System.out.println("Enter rented hour < 30:  ");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter unit price/hour: ");
        int unitPrice = in.nextInt();
        setUnitPrice(unitPrice);

        int tmp;
        do {
            System.out.println("Enter the hour < 30 : ");
            tmp = in.nextInt();
        }while(tmp >= 30);
        hour = tmp;
    }

    @Override
    public void outPut() {
        System.out.println(" Bill " + cout + ":");
        super.outPut();
        System.out.println("/Hour");
        System.out.println("Grand Total : " + getGrandTotal() + " USD");
    }

    public long getGrandTotal() {
        if(hour < 24 ) return hour * getUnitPrice();
        else return 24* getUnitPrice();
    }
}
