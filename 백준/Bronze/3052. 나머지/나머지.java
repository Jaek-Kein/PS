import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> uniqueRemainders = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            int n = scan.nextInt();
            int remainder = n % 42;
            if (!uniqueRemainders.contains(remainder)) {
                uniqueRemainders.add(remainder);
            }
        }
        
        scan.close();
        System.out.println(uniqueRemainders.size());
    }
}
