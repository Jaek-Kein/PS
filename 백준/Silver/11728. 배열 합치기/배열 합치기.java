import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        list1.addAll(list2);

        Integer[] answer = list1.toArray(new Integer[0]);

        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer).replaceAll("[\\[\\],]", ""));
    }
}
