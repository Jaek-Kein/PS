
import java.io.*;
import java.util.*;

public class Main {

    static class Axis {
        int x;
        int y;

        public Axis(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Axis temp;

        Axis[] list = new Axis[N];
        for (int i = 0; i < N; i++) { //좌표 배열 생성
            int[] axis = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list[i] = new Axis(axis[0], axis[1]);
        }

        Arrays.sort(list, (p1, p2) -> {
            if (p1.x == p2.x) {
                return Integer.compare(p1.y, p2.y);
            }
            return Integer.compare(p1.x, p2.x);
        });

        for (int i = 0; i < N; i++) {
            System.out.println(list[i].x + " " + list[i].y);
        }
    }
}
