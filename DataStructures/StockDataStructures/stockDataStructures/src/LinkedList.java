
public class LinkedList <T1, T2>{
	public Node<T1, T2> head;
	public LinkedList() {
		this.head = null;
	}
	public void addToHead(T1 data) {
		Node<T1, T2> newHead = new Node<T1, T2> (data);
		Node<T1, T2> currentHead = this.head;
		this.head = newHead;
		if (currentHead != null) {
			this.head.setNextNode(currentHead);
		}
	}
	public void addToHead(T1 key, T2 value) {
		Node<T1, T2> newHead = new Node<T1, T2>(key, value);
		Node<T1, T2> currentHead = this.head;
		this.head = newHead;
		if (currentHead != null) {
			this.head.setNextNode(currentHead);
		}		
	}
	public void addToTail(T1 data) {
		Node<T1, T2> tail = this.head;
		if (tail == null) {
			this.head = new Node<T1, T2>(data);
		} else {
			while (tail.getNextNode() != null) {
				tail = tail.getNextNode();
			}
			tail.setNextNode(new Node<T1, T2>(data));
			
		}
	}
	public void addToTail(T1 key, T2 value) {
		Node<T1, T2> tail = this.head;
		if (tail == null) {
			this.head = new Node<T1, T2>(key, value);
		} else {
			while (tail.getNextNode() != null) {
				tail = tail.getNextNode();
			}
			tail.setNextNode(new Node<T1, T2>(key, value));
			
		}		
	}
 
	public T1 removeHead() {
		Node<T1, T2> removedHead = this.head;
		if (removedHead == null) {
			return null;
		}
		this.head = removedHead.getNextNode();
		return removedHead.data;
	}
	public void removeHeadKV() {
		
		Node<T1, T2> removedHead = this.head;
		if (removedHead == null) {
			return;
		}
		this.head = removedHead.getNextNode();
		
	}
}
