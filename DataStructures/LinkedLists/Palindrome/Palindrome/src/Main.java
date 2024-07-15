
public class Main {

	public static void main(String[] args) {
		String[] names = {
				"ava",
				"elle",
				"steve",
				"hannah",
				"chandler",
				"sam",
				"eve",
				"gaylord",
		};
		for (String i : names) {
			LinkedList nameList = nameToList(i);
			isPalindrome(i, nameList);
		}
	}
	
	public static LinkedList nameToList(String name ){
		LinkedList nameList = new LinkedList();
		for (char i : name.toCharArray()) {
			nameList.addToTail(i);
		}
		return nameList;
	}
	public static LinkedList reverse(LinkedList list) {
		LinkedList reversed = new LinkedList(); 
		while (list.head != null) {
			reversed.addToHead(list.removeHead());
		}
		return reversed;
	}
	public static String listToName(LinkedList list) {
		String name ="";
		while (list.head != null) {
			name += list.removeHead();
		}
		return name;
	}
	public static void isPalindrome(String name, LinkedList nameList) {
		LinkedList reverseNameList = reverse(nameList);
		String reverseName = listToName(reverseNameList);
		if (name.equals(reverseName)) {
			System.out.println(name + " is a palindrome.");
		}else {
			System.out.println(name + " is not a palindrome.");
		}
	}
}

