
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList presidents = new LinkedList();
		
		presidents.addToHead("George H.W. Bush");
		presidents.addToTail("Bill Clinton");
		presidents.addToTail("George W. Bush");
		presidents.addToTail("Barack Obama");
		presidents.addToTail("Donald Trump");
		presidents.addToTail("Joe Biden");
		
		presidents.printList();
	}

}
