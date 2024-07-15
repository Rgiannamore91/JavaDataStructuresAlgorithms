package listDuplicates;

public class Main {

	public static void main(String[] args) {
		LinkedList presidents = new LinkedList();
		presidents.addToTail("Franklin D. Roosevelt");
		presidents.addToTail("Harry Truman");
		presidents.addToTail("Dwight D. Eisenhower");
		presidents.addToTail("John F. Kennedy");
		presidents.addToTail("Franklin D. Roosevelt");
		presidents.addToTail("Lyndon B. Johnson");
		presidents.addToTail("Richard Nixon");
		presidents.addToTail("Gerald Ford");
		presidents.addToTail("Dwight D. Eisenhower");
		presidents.addToTail("Jimmy Carter");
		presidents.addToTail("Ronald Reagan");
		presidents.addToTail("George H.W. Bush");
		presidents.addToTail("Bill Clinton");
		presidents.addToTail("George W. Bush");
		presidents.addToTail("Bill Clinton");
		presidents.addToTail("Barack Obama");
		presidents.addToTail("Donald Trump");
		presidents.addToTail("Joe Biden");
		presidents.addToTail("Barack Obama");
		
		presidents.printList();
		
		LinkedList duplicates = duplicateList(presidents);
		duplicates.printList();
	}
	public static LinkedList duplicateList(LinkedList list) {
		LinkedList duplicates = new LinkedList();
		LinkedList tempList = new LinkedList();
		Node current = list.head;
		while (current != null) {
			if(!(search(current.data, tempList))) {
				tempList.addToTail(current.data);
			}else {
				duplicates.addToTail(current.data);
			}
			current = current.getNextNode();
		}
		return duplicates;
	}
	public static boolean search(String target, LinkedList list) {
		Node current = list.head;
		while (current != null) {
			if(current.data.equals(target)) {
				return true;
			}
			current = current.getNextNode();
		}
		return false;
	}

}
