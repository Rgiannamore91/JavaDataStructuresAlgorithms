package factorial;
public class Queue <T>{
	public LinkedList <T, ?> queue;
	public int size;
	static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
	public int maxSize;
	
	public Queue() {
		this(DEFAULT_MAX_SIZE);
	}
	
	public Queue(int maxSize) {
		this.queue = new LinkedList<>();
		this.size = 0;
		this.maxSize = maxSize;
	}
	
	public boolean hasSpace() {
		return this.size < this.maxSize;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void enqueue(T data) {
		if (this.hasSpace()) {
			this.queue.addToTail(data);
			this.size++;
		}else {
			throw new Error("Queue is full!");
		}
	}
	public T dequeue() {
		if (!this.isEmpty()) {
			T data = this.queue.removeHead();
			this.size--;
			return data;
		}else {
			throw new Error("Queue is empty!");
		}
	}
	public T peek() {
		if (this.isEmpty()) {
			return null;
		}else {
			return this.queue.head.data;
		}
	}
}
