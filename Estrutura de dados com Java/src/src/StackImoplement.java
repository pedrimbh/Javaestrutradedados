package src;
import java.util.Random;
import java.util.Stack;
public class StackImoplement {
	public static void main(String[] args) {
		Stack stack = new Stack<>();
		
		Random random = new Random();
		
		int i = 5;
		
		while(i != 0) {
			System.out.println("Push: " + stack.push(random.nextInt(20)));
			i--;
		}
		
		while(!stack.isEmpty()) {
			
		
		
		//for (int c = 0; c < 5; c++) {
			System.out.println("Pop: " + stack.pop());
		}
		
		//System.out.println("Get indice 0: " + stack.get(0));
	}
}
