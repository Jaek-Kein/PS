
import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int index;
        int movement;

        public Node(int index, int movement) {
            this.index = index;
            this.movement = movement;
        }
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Node> list = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int movement = Integer.parseInt(st.nextToken());
            list.add(new Node(i + 1, movement));
        }

        StringBuilder sb = new StringBuilder();

        while (!list.isEmpty()) {
            Node now = list.pollFirst();
            //첫번째 노드를 가져와
            sb.append(now.index).append(" ");
            //스트링빌더에 넣어

            if (list.isEmpty()) break; // 리스트가 비면 끝내

            int movement = now.movement;

            if (movement > 0) {
                for (int i = 0; i < movement - 1; i++) {
                    list.addLast(list.pollFirst());
                }
            } else if (movement < 0) {
                for (int i = 0; i < Math.abs(movement); i++) {
                    list.addFirst(list.pollLast());
                }
            }
        }

        bw.write(sb.toString().trim());
        bw.close();
        br.close();
    }
}
