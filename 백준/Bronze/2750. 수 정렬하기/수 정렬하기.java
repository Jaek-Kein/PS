import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<>();
			Scanner scan =new Scanner(System.in);
			int n = scan.nextInt();
			for (int i = 0 ; i < n ; i++) {
				list.add(scan.nextInt());
			}
			Collections.sort(list);
			for (int j : list) {
				System.out.println(j);
			}
			
	}
}
