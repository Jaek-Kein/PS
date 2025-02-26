import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int cost = 0;
		
		/*
		 * 단일구매 3원
		 * 2중구매 5원
		 * 3중구매 7원
		 * */
		
		for (int i = 0 ; i < N ; i ++) {
			//현재 공장에서 0개 구매할 경우 스킵
			if(input[i] == 0) continue;
			
			//현재 공장에서 1개 이상 구매할 경우의수
			//TODO N+1공장과 N+2공장에 구매여부 확인 후 수 저하
			//While(input[i] >0) 을 사용할꺼임
			//어차피 if는 분기문이라 시간복잡도 영향 x
			
			while(input[i]>0) {
				//3중 구매에 대한 분기문
				//2중 try catch로 배열 마지막 부분 커버
				//continue문의 필요성? 없는것 같은데 
				
				if (i + 2 < N && input[i + 1] > 0 && input[i + 2] > 0) {  
					// 3중 구매가 가능한 경우
					if(input[i+1]>input[i+2]) {
						input[i]--;
						input[i + 1]--;
						cost += 5;
					} else {
						input[i]--;
						input[i + 1]--;
						input[i + 2]--;
						cost += 7;
					}
				} else if (i + 1 < N && input[i + 1] > 0) {  
					// 2중 구매가 가능한 경우
					input[i]--;
					input[i + 1]--;
					cost += 5;
				} else {  
					// 단일 구매
					input[i]--;
					cost += 3;
				}
				}
			}
		////////////////출력문
		bw.write(cost+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
