import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Bill arrBill[] = new Bill[100];
        boolean kt = true;
        int i = 0;
        int coutBillDay = 0, coutBillHour = 0;
        while(kt){
            System.out.println("Choice the bill type : ");
            System.out.println("1. BillDay");
            System.out.println("2. BillHour");
            System.out.println("3. End");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1 :{
                    arrBill[i] = new BillHours();
                    arrBill[i].inPut();
                    i++;
                    coutBillHour ++;
                    break;
                }
                case 2 :{
                    arrBill[i] = new BillDays();
                    arrBill[i].inPut();
                    i++;
                    coutBillDay++;
                    break;
                }
                case 3:{
                    kt = false;
                    break;
                }
            }
        }
        for(int j = 0; j < i; j++)
            arrBill[j].outPut();
        System.out.println("There are " + coutBillHour + " BillHour");
        System.out.println("There are " + coutBillDay + " BillDay");
    }
}
