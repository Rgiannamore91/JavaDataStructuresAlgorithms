
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static LinkedList reverse(LinkedList list) {
		LinkedList reversed = new LinkedList(); 
		while (list.head != null) {
			reversed.addToHead(list.removeHead());
		}
		return reversed;
	}

}
