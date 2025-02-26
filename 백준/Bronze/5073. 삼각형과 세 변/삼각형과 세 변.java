import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] input = br.readLine().split(" " );
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			
			//마지막줄 000 이면 break, 삼각형이 안되면 invalid
			if(a+b+c == 0) {
				bw.close();
				br.close();
				break;
			}
			if(a+b <= c || a+c <= b || b+c <= a) {
				bw.write("Invalid\n");
				bw.flush();
				continue;
			}
			
			if(a==c && b==c) {
				System.out.println("Equilateral");
			} else if (a==b || b==c ||a==c) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		}
	}
}