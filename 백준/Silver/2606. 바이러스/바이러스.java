import java.util.*;
import java.io.*;

public class Main {
    static int node, line, count;
    static int[][] arr;
    static boolean[] check;

    static int start = 1;

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        for(int i = 0 ; i < line ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        BFS(start);
        System.out.println(count);
    }

    public static void BFS(int start){
        q.add(start);
        check[start] = true;
        count = -1;
        while(!q.isEmpty()){

            start = q.poll();
            count++;

            for(int i = 0; i <= node; i++){
                if(arr[start][i] == 1 && !check[i]){
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
