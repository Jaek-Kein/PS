import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		
		int row = scan.nextInt();
		int col = scan.nextInt();
		
		int[][] arr1 = new int[row][col];
		
		for (int i = 0 ; i < row ; i++) {
			for (int j = 0 ; j < col ; j++) {
				arr1[i][j] = scan.nextInt();
			}
		}
		
		int row2 = scan.nextInt();
		int col2 = scan.nextInt();
		int[][] arr2 = new int[row2][col2];
		
		for (int i = 0 ; i < row2 ; i++) {
			for (int j = 0 ; j < col2 ; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}
		
		int[][] result = new int[row][col2];
		
		/*
		최외곽 = arr3에 index 값
		arr1값에 row 조건 추가
		arr2값 기준으로 row2 col 2 로 제한두고 곱
		*/
		for (int i = 0 ; i < row ; i++) { //결과행렬 row
			for(int j = 0 ; j < col2 ; j++) {  //결과헹렬 col
				for(int k = 0 ; k < col ; k++) { 
						result[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	}
}