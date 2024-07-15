
public class Node {
	public char data;
	private Node next;
	
	public Node(char data) {
		this.data = data;
		this.next = null;
	}
	
	public void setNextNode(Node node) {
		this.next = node;
	}
	public Node getNextNode() {
		return this.next;
	}
}
