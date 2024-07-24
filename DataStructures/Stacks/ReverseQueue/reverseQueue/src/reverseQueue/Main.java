package reverseQueue;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		int size = random.nextInt(11);
		
		Queue queue = new Queue(size);
		Stack stack = new Stack(size);
		System.out.print("[ ");
		for (int i = 0; i < size; i++) {
			int item = random.nextInt(1000);
			System.out.print(item + ", ");
			queue.enqueue(item);
		}
		System.out.print("]");
		System.out.println();
		for (int i = 0; i < size; i++) {
			int item = queue.dequeue();
			stack.push(item);
		}
		System.out.print("[ ");
		for (int i = 0; i < size; i++) {
			int item = stack.pop();
			System.out.print(item + ", ");
			queue.enqueue(item);
		}
		System.out.print("]");
	}

}
