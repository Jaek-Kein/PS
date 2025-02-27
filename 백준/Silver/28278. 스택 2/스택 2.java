
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n ; i ++) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			int job = Integer.parseInt(st.nextToken());
			
			switch(job) {
	        case 1:
	            stack.push(Integer.parseInt(st.nextToken()));
	            break;
	            
	        case 2:
	            if(stack.isEmpty()) {
	                bw.write("-1\n");
	            } else {
	                bw.write(stack.pop() + "\n");
	            }
	            break;
	            
	        case 3:
	            bw.write(stack.size() + "\n");
	            break;
	            
	        case 4:
	            bw.write(stack.isEmpty() ? "1\n" : "0\n");
	            break;
	            
	        case 5:
	            if(stack.isEmpty()) {
	                bw.write("-1\n");
	            } else {
	                bw.write(stack.peek() + "\n");
	            }
	            break;
			}
			bw.flush();
		}
	}
}
