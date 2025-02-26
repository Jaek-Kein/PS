import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int trial = scan.nextInt();
		for(int i = 0 ; i < trial ; i++) {
			int left = 0,  right = 0;
			String str = scan.next();
			for (int j = 0 ; j < str.length(); j++) {
				char check = str.charAt(j);
				if(check == '(') left +=1;
				else right += 1;
				if (right > left) {
					break;
				}
			}
			
			if (left == right) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
