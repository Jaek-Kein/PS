import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(bf.readLine());
        int [] arr = new int[len];
        
        //배열생성
        String[] inputs = bf.readLine().split(" ");
        for (int i = 0 ; i < len ; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        
        //배열 복사(중복제거) 정렬
        int[] check = Arrays.stream(arr).distinct().toArray();
        Arrays.sort(check);
        
          for (int i : arr) {
            int index = Arrays.binarySearch(check, i);
            bw.write(index+" ");
        }
    
    bw.flush();
    bw.close();
    bf.close();
    }
}