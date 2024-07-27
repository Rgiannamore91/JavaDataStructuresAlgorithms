
public class HashMap <T>{
	public LinkedList<String, T>[] hashmap;
	@SuppressWarnings("unchecked")
	public HashMap(int size) {
		this.hashmap = new LinkedList[size];
		for (int i = 0; i < size; i++) {
			this.hashmap[i] = new LinkedList<>();
		}
	}
	public int hash(String key) {
		int hashCode = 0;
		for (int i = 0; i < key.length(); i++) {
			hashCode += Character.codePointAt(key, i);
		}
		hashCode = hashCode % this.hashmap.length;
		return hashCode;
	}
	public void assign(String key, T value) {
		int arrayIndex = this.hash(key);
		LinkedList<String, T> list = this.hashmap[arrayIndex];
		if (list.head == null) {
			list.addToHead(key, value);
			return;
		}
		Node<String, T> current = list.head;
		while (current != null) {
			if (current.key == key) {
				current.setKeyValue(key, value);
			}
			if (current.getNextNode() == null) {
				current.setNextNode(new Node<String, T>(key, value));
				break;
			}
			current = current.getNextNode();
		}
	}
	public T retrieve(String key) {
		int arrayIndex = this.hash(key);
		Node<String, T> current = this.hashmap[arrayIndex].head;
		while (current != null) {
			if (current.key == key) {
				return current.value;
			}
			current = current.getNextNode();
		}
		return null;
	}
}
