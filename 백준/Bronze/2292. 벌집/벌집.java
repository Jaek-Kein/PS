import java.util.Scanner;

public class Main {
	//1 6 12 18 24 30 36 42 48 54 60 66 72 78
	//1, 2 ~ 7 , 8 ~ 19, 20 ~ 37, 	
	
	public static void main(String[] args) {
		int stand = 1, count = 1;
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		input = input -1;
		while(true){
			if (input < 1) {System.out.println(count); break;}
			input = input - (count * 6);
			count++;
		}
	}
}
