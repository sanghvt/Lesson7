import java.util.Scanner;

abstract  public class Bill {
    private String billCode;
    private String Date;
    private String nameCustomer;
    private int roomId;
    private int unitPrice;

    static int cout = 0;

    public String getDate() {
        return Date;
    }

    public String getBillCode() {
        return billCode;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void inPut(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter bill code : ");
        String billCode = in.nextLine();
        setBillCode(billCode);

        System.out.println("Enter the Date : ");
        String date = in.nextLine();
        setDate(date);

        System.out.println("Enter the customer name: ");
        String nameCustomer = in.nextLine();
        setNameCustomer(nameCustomer);

        System.out.println("Enter room ID: ");
        int roomId = in.nextInt();
        setRoomId(roomId);
    }
    public void outPut(){
        System.out.print(getRoomId() + "\t" + getNameCustomer() + "\t"
                            + getDate() + "\t" + getUnitPrice() + " USD");

    }
}
