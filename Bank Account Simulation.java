import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;
        int choice = sc.nextInt();
        int amount = sc.nextInt();
        if(choice == 1) balance += amount;
        else if(choice == 2 && amount <= balance) balance -= amount;
        System.out.println(balance);
    }
}
