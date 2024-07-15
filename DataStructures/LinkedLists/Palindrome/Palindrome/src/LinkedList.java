
public class LinkedList {
	public Node head;
	public LinkedList() {
		this.head = null;
	}
	public void addToHead(char data) {
		Node newHead = new Node(data);
		Node currentHead = this.head;
		this.head = newHead;
		if (currentHead != null) {
			this.head.setNextNode(currentHead);
		}
	}
	public void addToTail(char data) {
		Node tail = this.head;
		if (tail == null) {
			this.head = new Node(data);
		} else {
			while (tail.getNextNode() != null) {
				tail = tail.getNextNode();
			}
			tail.setNextNode(new Node(data));
		}
	}
	public Character removeHead() {
		Node removedHead = this.head;
		if (removedHead == null) {
			return null;
		}
		this.head = removedHead.getNextNode();
		return removedHead.data;
	}
	public String printList() {
		String output = "";
		Node currentNode = this.head;
		while (currentNode != null) {

			output += currentNode.data;

			
			currentNode = currentNode.getNextNode();
		}
		
		System.out.println(output);
		return output;
	}
}
