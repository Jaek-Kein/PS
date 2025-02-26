import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int house = scan.nextInt();
		int[][] list = new int[house][3];
		
		for (int i = 0; i < house ; i ++) {
			for (int j = 0; j < 3 ; j++) {
				if (i == 0) {
					list[i][j] = scan.nextInt();
					continue;
				} else {
					int src = scan.nextInt();
					switch(j) {
					case 0:
						list[i][j] = src + Math.min(list[i-1][1],list[i-1][2]);
						break;
					case 1:
						list[i][j] = src + Math.min(list[i-1][0],list[i-1][2]);
						break;
						
					case 2:
						list[i][j] = src + Math.min(list[i-1][0],list[i-1][1]);
						break;
					}
				}
			}
		}
		house = house -1;
		System.out.println(Math.min(Math.min(list[house][0], list[house][1]), list[house][2]));
	}
}
