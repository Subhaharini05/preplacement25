import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        boolean strong = p.length()>=8 && p.matches(".*\\d.*") && p.matches(".*[A-Z].*");
        System.out.println(strong);
    }
}
