
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Stack<Integer> input = new Stack<>();

        for(int i = 0 ; i < n ; i++){
            int k = scan.nextInt();
            if(k==0) input.pop();
            else input.push(k);
        }

        int answer = 0;

        while(!input.isEmpty()){
            answer += input.pop();
        }

        System.out.println(answer);
    }
}
