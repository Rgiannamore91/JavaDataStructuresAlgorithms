
public class Node <T1, T2>{
	public T1 data;
	public T1 key;
	public T2 value;
	private Node<T1, T2> next;
	public boolean hasTwoTypes;
	
	public Node (T1 data) {
		this.data = data;
		this.next = null;
		this.hasTwoTypes = false;
	}
	public Node(T1 key, T2 value) {
		this.key = key;
		this.value = value;
		this.next = null;
		this.hasTwoTypes = true;
	}
	
	public void setNextNode(Node<T1, T2> node) {
		this.next = node;
	}
	public Node<T1, T2> getNextNode() {
		return this.next;
	}
	public void setKeyValue(T1 key, T2 value) {
		this.key = key;
		this.value = value;
	}
}
