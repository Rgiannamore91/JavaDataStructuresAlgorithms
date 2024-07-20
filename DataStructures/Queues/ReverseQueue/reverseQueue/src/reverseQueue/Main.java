package reverseQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue tasks = new Queue();
		tasks.enqueue(5);
		tasks.enqueue(4);
		tasks.enqueue(3);
		tasks.enqueue(2);
		tasks.enqueue(1);
		System.out.println(tasks.peek());
		
		tasks = reverse(tasks);
		System.out.println(tasks.peek());
	}
	public static Queue reverse(Queue q) {
		LinkedList temp = new LinkedList();
		Queue newQueue = new Queue(q.size);
		while (!q.isEmpty()) {
			int dat = q.dequeue();
			temp.addToHead(dat);
		}
		while (temp.head != null) {
			
			int dat = temp.removeHead();
			if (newQueue.hasSpace()) {
				newQueue.enqueue(dat);
			}
			
		}
		return newQueue;
	}

}
