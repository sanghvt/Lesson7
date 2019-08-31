import java.util.Scanner;

public class People {
    private String name;
    private String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void inPut(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name : " );
        name = in.nextLine();
        System.out.println("Enter the adress: ");
        adress = in.nextLine();
    }
    public void outPut(){
        System.out.println(getName());
        System.out.println(getAdress());
    }
}
