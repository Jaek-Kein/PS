import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[][] arr = new String[5][];
		int maxLength = 0;
		
		for(int i = 0 ; i < 5 ; i ++) {
			String temp = br.readLine();
			if (temp.length() > maxLength) {
				maxLength = temp.length();
			}
			arr[i] = temp.split("");
		}
		for(int i = 0 ; i < maxLength ; i++) {
			for (int j = 0 ; j < 5 ; j++ ) {
				try {
					System.out.print(arr[j][i]);
				} catch (IndexOutOfBoundsException e) {
					continue;
				}
			}
		}
	}
}
