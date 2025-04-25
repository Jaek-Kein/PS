import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int hands = Integer.parseInt(input[0]); //핸드의 갯수
		int aim = Integer.parseInt(input[1]); // 목표하는 수
		
		int[] cards = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		 
		Arrays.sort(cards); //오름차순 배열
		int max = 0; //최대 체크
		for(int st = 0; st < hands-2 ; st++) {
			int hand1 = cards[st];
			for(int nd = st+1; nd < hands-1 ; nd++) {
				int hand2 = cards[nd];
				for (int rd = nd+1 ; rd < hands ; rd++) {
					int hand3 = cards[rd];
					int total = hand1+hand2+hand3;
					if(total == aim){
						bw.write(total+"");
						bw.flush();
						System.exit(0);
					} else if(total < aim && total > max ) {
						max = total;
					}
				}
			}
		}
		bw.write(max + "");
		bw.flush();
		bw.close();
		br.close();
	}
}