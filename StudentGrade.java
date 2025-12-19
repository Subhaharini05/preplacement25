import java.util.Scanner;
public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for(int i=0;i<n;i++) total += sc.nextInt();
        double avg = total / (double)n;
        if(avg >= 90) System.out.println("Grade A");
        else if(avg >= 75) System.out.println("Grade B");
        else if(avg >= 60) System.out.println("Grade C");
        else System.out.println("Fail");
    }
}
