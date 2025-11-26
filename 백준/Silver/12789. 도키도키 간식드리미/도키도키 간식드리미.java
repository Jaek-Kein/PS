import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> row = new ArrayDeque<>();
        Stack<Integer> side = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N ; i++){ // row Deque 완성
            row.add(Integer.parseInt(st.nextToken()));
        }

        int ref = 0;
        boolean available = true;

        while (!row.isEmpty()){
            if (!side.isEmpty() && side.peek() == ref+1) { // 아 옆에 빠져계신분 있으신가요? 있으면 현재 대기순번 맞으시면 들어가실게요
                ref += 1; //들어가셨으니까 대기열도 바뀔게요
                side.pop(); // 그쪽은 나오시구요
                continue;
            }

            int now = row.pollFirst(); // 대기열 첫번째 사람 데려오기

            /*
            * 2가지 조건
            * 1. 현재 맞는 인덱스일 경우 (reference starts at 0 now === ref+1 => pop)
            * 2. side로 보낼꺼면 side top 보다 작은수일것
            * */

            if (now == ref+1){ // 현재 순번이 맞는사람이면 그냥 지나가세요
                ref+=1; //순번 바뀌었으니까 다음순번 부를께요
            }else if (side.isEmpty() || now < side.peek()){ // 아 옆에 빠져계신 분없네, 그리고 지금 이분 대기열 들어가도 될 것 같아요
                side.push(now); // 옆에 별도줄에 잠시 대기해주세요
            } else {
                available = false; //아 이거 줄관리 망해버렸다.
                break;
            }
        }

        if (available){
            System.out.println("Nice");
        } else{
            System.out.println("Sad");
        }
    }
}