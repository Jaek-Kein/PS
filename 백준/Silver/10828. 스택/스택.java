import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> layer = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		int trial = scan.nextInt();
		for(int i = 0 ; i < trial ; i++) {
			String orderstr = scan.next();
			switch(orderstr) {
			case "push":
				layer.push(scan.nextInt());
				break;
			case "pop":
				try{
					System.out.println(layer.pop());
				} catch (EmptyStackException e) {
					System.out.println("-1");
				}
				break;
			case "size":
				System.out.println(layer.size());
				break;
			case "empty":
				if (layer.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "top":
				try{
					System.out.println(layer.get(layer.size()-1));
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("-1");
				}
				break;
			}
		}
	}
}
