
import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static boolean[][] check;
    static int[] MoveX = {1, 0, -1, 0};
    static int[] MoveY = {0, -1, 0, 1};
    //동남서북
    static int n, m;

    static Queue<Spot> q = new LinkedList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        check = new boolean[n][m];

        for(int i = 0 ; i < n ; i++){
            String input = br.readLine();
            for(int k = 0 ; k < m ; k++){
                arr[i][k] = Character.getNumericValue(input.charAt(k));
            }
        }

        check[0][0] = true;
        BFS(0,0);

        System.out.println(arr[n-1][m-1]);
    }

    public static void BFS(int x, int y){
        q.add(new Spot(x,y));

        while(!q.isEmpty()){
            Spot s = q.poll();
            for (int i = 0 ; i < 4 ; i++){
                int nextX = s.x + MoveX[i];
                int nextY = s.y + MoveY[i];

                if (nextX < 0 || nextY < 0 || nextX > n-1 || nextY > m-1) continue;
                if(check[nextX][nextY] || arr[nextX][nextY] == 0) continue;

                q.add(new Spot(nextX, nextY));
                arr[nextX][nextY] = arr[s.x][s.y] + 1;
                check[nextX][nextY] = true;
            }
        }
    }
}

class Spot{
    int x;
    int y;
    Spot(int x, int y){
        this.x = x;
        this.y = y;
    }
}

