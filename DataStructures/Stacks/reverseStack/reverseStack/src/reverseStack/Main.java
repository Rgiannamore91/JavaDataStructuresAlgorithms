package reverseStack;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int size = random.nextInt(10);
		Stack stack = new Stack();
		Stack reverser = new Stack();
		for (int i = 0; i <= size; i++) {
			stack.push(random.nextInt(100));
		}
		for (int i = 0; i <= size; i++) {
			int num = stack.pop();
			System.out.print(num + " ");
			reverser.push(num);
		}
		System.out.println();
		for (int i = 0; i <= size; i++) {
			int num = reverser.pop();
			System.out.print(num + " ");
			stack.push(num);
		}

	}

}
