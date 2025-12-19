import java.util.Scanner;
public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill;
        if(units<=100) bill = units*1.5;
        else if(units<=300) bill = 100*1.5 + (units-100)*2;
        else bill = 100*1.5 + 200*2 + (units-300)*3;
        System.out.println(bill);
    }
}
