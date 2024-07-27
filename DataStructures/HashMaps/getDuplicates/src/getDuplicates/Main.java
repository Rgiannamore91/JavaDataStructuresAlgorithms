package getDuplicates;
import java.util.ArrayList;

import java.util.Random;
public class Main {

	public static void main(String[] args) {
		String[] presidents = {"George Washington", "John Adams", "Thomas Jefferson", 
				"James Madison", "James Monroe", "John Quincy Adams", "Andrew Jackson",
				"Martin Van Buren", "William Henry Harrison", "John Tyler", 
				"James K. Polk,", "Zachary Taylor", "Millard Fillmore", "Franklin Pierce",
				"James Buchanan", "Abraham Lincoln", "Andrew Johnson", "Ulysses S. Grant",
				"Rutherford B. Hayes", "James A. Garfield", "Chester A. Arthur", 
				"Grover Cleveland", "Benjamin Harrison", "William McKinley", "Theodore Roosevelt",
				"William Howard Taft", "Woodrow Wilson", "Warren G. Harding", "Calvin Cooliage", 
				"Herbert Hoover", "Franklin D. Roosevelt", "Harry S. Truman", "Dwight D. Eisenhower",
				"John F. Kennedy", "Lyndon B. Johnson", "Richard Nixon", "Gerald Ford", "Jimmy Carter",
				"Ronald Reagan", "George H.W. Bush", "Bill Clinton", "George W. Bush", "Barack Obama",
				"Donald Trump", "Joe Biden",			
		};
		
		ArrayList<String> nwList = newList(presidents);
		
		ArrayList<String> duplicates = getDuplicates(presidents, nwList, presidents.length);
		for (String i : duplicates) {
			System.out.println(i);
		}

	}
	public static ArrayList<String> newList(String[] list) {
		Random random = new Random();
		ArrayList<String> secondList = new ArrayList<>();
		boolean done = false;
		while (!done) {
			secondList.add(list[random.nextInt(list.length)]);
			done = allPresent(list, secondList);
		}
		
		return secondList;
	}
	public static boolean allPresent(String[] list1, ArrayList<String> list2) {
		for (int i = 0; i < list1.length; i++) {
			if (!list2.contains(list1[i])) {
				return false;
			}
		}
		return true;
	}
	public static ArrayList<String> getDuplicates(String[] list1, ArrayList<String> list2, int len) {
		HashMap<Integer> counts = new HashMap<>(len);
		for (String i : list2) {
			Integer count = counts.retrieve(i);
			if (count == null) {
				counts.assign(i, 1);	
			}else {
				counts.assign(i, count + 1);
			}
		}
		ArrayList<String> duplicates = new ArrayList<>();
		for (String i : list1) {
			if (counts.retrieve(i) > 1 ) {
				duplicates.add(i);
			}
		}
		return duplicates;
	}
}
