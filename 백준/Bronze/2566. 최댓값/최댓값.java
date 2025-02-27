
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] board = new int[9][9];
		
		for(int i = 0; i < 9 ; i ++) {
			board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		int Max = -1;
		int y = 0;
		int x = 0;
		for(int i = 0 ; i < 9 ; i++) {
			for(int j = 0 ; j < 9 ; j++) {
				if(board[i][j] > Max) {
					Max = board[i][j] ;
					y = i+1; x = j+1;
				}
			
			}
		}
	
	bw.write(Max + "\n" + y + " " + x);
	bw.flush();
	bw.close();
	br.close();
	}
}
