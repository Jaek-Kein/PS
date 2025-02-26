
import java.io.*;

public class Main {
	public static void main(String[] args)	throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String alphabet = br.readLine();
		int count = 0;
		
		for(int i = 0 ; i < alphabet.length() ; i++) {
			count++;
			if(alphabet.charAt(i) == '=' || alphabet.charAt(i) == '-') {
				count--;
				try{
					if(alphabet.charAt(i-2) == 'd' && alphabet.charAt(i-1) == 'z') {
						count--;
					}
				} catch (StringIndexOutOfBoundsException e) {
					continue;
				}
			}
			if (alphabet.charAt(i) == 'j') {
				try{	
						if(alphabet.charAt(i-1) == 'l' ||alphabet.charAt(i-1) == 'n' ) {
						count--;
					}
				} catch (StringIndexOutOfBoundsException e) {
					continue;
				}
			}
		}
		
		bw.write(count + "");
		br.close();
		bw.close();
	}
}
