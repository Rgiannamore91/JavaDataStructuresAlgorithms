package palindrome;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {
				"Hannah",
				"John",
				"Ava",
				"Doug",
				"Eve",
				"Richard",
				"Bob",
				"jim",
		};
		Random random = new Random();
		int index = random.nextInt(8);
		String name = names[index];
		String reverseName = reverse(name);
		boolean palindrome = isPalindrome(name, reverseName);
		
		if(palindrome) {
			System.out.println(name + " is a palindrome.");
		}else {
			System.out.println(name + " is not a palindrome.");
		}
	}
	public static String reverse(String name) {
		Stack reverser = new Stack(name.toCharArray().length);
		String reversedName = "";
		for (char i : name.toCharArray()) {
			reverser.push(i);
		}
		for (int i = 0; i < name.length();i++) {
			char ch = reverser.pop();
			reversedName += ch;
		}
		return reversedName;
	}
	public static boolean isPalindrome(String name, String reverseName) {
		return name.toUpperCase().equals(reverseName.toUpperCase());
	}

}
