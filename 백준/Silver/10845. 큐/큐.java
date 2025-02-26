
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Deque<Integer> queue = new LinkedList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		int order = scan.nextInt();
		int back;
		for(int i = 0; i < order ; i++) {
			String orderstr = scan.next();
			switch(orderstr) {
			case "push":
				back = scan.nextInt();
				queue.offer(back);
				break;
			case "pop":
				try{
					System.out.println(queue.remove());
				} catch (NoSuchElementException e) {
					System.out.println(-1);
				}
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if (queue.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				try {
				System.out.println(queue.element());
				} catch (NoSuchElementException e) {
					System.out.println(-1);
				}
				break;
			case "back":
				try {
					System.out.println(queue.getLast());
				} catch (NoSuchElementException e) {
					System.out.println(-1);
				}
				break;
			}
		}
		
	}
}
