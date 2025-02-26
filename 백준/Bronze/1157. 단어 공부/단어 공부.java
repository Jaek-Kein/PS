import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] word = br.readLine().toUpperCase().split("");

        String[] element = Arrays.stream(word).distinct().toArray(String[]::new);
        int count = 0;
        int merge = 0;
        String now = null;
        for (String e: element){
             int temp;
            temp = Collections.frequency(Arrays.asList(word), e);
            if (temp == count) {
            	merge++;
            } else if (temp > count) {
            	now = e;
            	count = temp;
            	merge=0;
            }
            
        }
        if (merge > 0) {
        	bw.write('?');
        	bw.flush();
        	bw.close();
        } else {
	        bw.write(now);
	        bw.flush();
	        bw.close();
        }
    }
}