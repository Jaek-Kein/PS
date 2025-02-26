import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws  IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int people = Integer.parseInt(br.readLine());
		int result = 0;
		int[] times = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(times);
		
		for (int i = 0 ; i < people ; i++) {
			result = result + times[i]*(people-i);
		}
		
		bw.write(result+"");
		bw.flush();
		bw.close();
	}
}
