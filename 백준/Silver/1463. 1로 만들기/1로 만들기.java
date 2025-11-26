import java.util.*;

public class Main {
    static Integer[] dp;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        dp = new Integer[x + 1];
        dp[0] = dp[1] = 0;

        System.out.println(Calc(x));
    }

    public static int Calc(int x){
        if(dp[x] == null) {
            if (x % 6 == 0){
                dp[x] = Math.min(Calc(x / 3), Math.min(Calc(x/2), Calc(x-1))) + 1;
        } else if (x % 3 == 0) {
                dp[x] = Math.min(Calc(x / 3), Calc(x - 1)) + 1;
            } else if (x % 2 == 0) {
                dp[x] = Math.min(Calc(x / 2), Calc(x - 1)) + 1;
            } else {
                dp[x] = Calc(x - 1) + 1;
            }
        }
        return dp[x];
    }
}
