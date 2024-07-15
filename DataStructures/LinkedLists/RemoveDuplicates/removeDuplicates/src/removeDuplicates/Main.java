package removeDuplicates;

public class Main {

	public static void main(String[] args) {
		LinkedList justices = new LinkedList();
		justices.addToTail("Clarence Thomas");
		justices.addToTail("Neil Gorsuch");
		justices.addToTail("Clarence Thomas");
		justices.addToTail("Samuel Alito");
		justices.addToTail("Sonia Sotomayor");
		justices.addToTail("Kentaji Brown-Jackson");
		justices.addToTail("Samuel Alito");
		justices.addToTail("Elena Kagan");
		justices.addToTail("John Roberts");
		justices.addToTail("Amy Coney Barett");
		justices.addToTail("Brett Kavanaugh");
		justices.addToTail("John Roberts");
		
		justices.printList();
		
		justices = removeDuplicates(justices);
		
		justices.printList();

	}
	public static LinkedList removeDuplicates(LinkedList list) {
		
		LinkedList newList = new LinkedList();
		Node current = list.head;
		while (current != null) {
			if (!(search(current.data, newList))) {
				newList.addToHead(current.data);
			}
			current = current.getNextNode();
		}
		return newList;
	}
	public static boolean search (String target, LinkedList list) {
		Node current = list.head;
		while (current != null) {
			if (current.data.equals(target)) {
				return true;
			}
			current = current.getNextNode();
		}
		return false;
	}
}
