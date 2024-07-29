package factorial;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int size = random.nextInt(2, 11);
		Queue<Integer> queue = new Queue<Integer>(size);
		Queue<Integer> factorialQueue = queueUp(queue, size);
		String display = factorialQueue.peek() + "! = ";
		int fac = 1;
		System.out.println(factorial(factorialQueue, fac, display));
	}
	public static Queue<Integer> queueUp(Queue<Integer> queue, int n) {
		if (n > 0) {
			queue.enqueue(n);
			return queueUp(queue, n-1);
		}
		
		return queue;
	}
	public static String factorial(Queue<Integer> queue, int fac, String display) {
		
		
		if (!queue.isEmpty()) {
			int num = queue.dequeue();
			fac *= num;
			if (num > 1) {
				display += num + " X ";
			}else {
				display += num;
			}
			
			return factorial(queue, fac, display);
		}
		System.out.print(display);
		return " = " + fac;
	}
}
