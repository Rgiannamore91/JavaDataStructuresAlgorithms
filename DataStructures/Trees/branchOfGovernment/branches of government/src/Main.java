import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		String[] branches = {
				"Judicial",
				"Legislative",
				"Executive",
		};
		String[] judicialBranch = {
				"Amy Conney Barret",
				"Brett Kavanaugh",
				"Clarence Thomas",
				"Elana Kagan",
				"John Roberts",
				"Kentaji Brown-Jackson",
				"Neil Gorsuch",
				"Samuel Alito",
				"Sonia Sotomayor",
		};
		String[] legislativeBranch = {
				"Chuck Schumer",
				"Hakeem Jeffries",
				"Mike Johnson",
				"Mitch McConnel",
		};
		String[] executiveBranch = {
				"Joe Biden",
				"Kamala Harris",
		};
		Tree government = buildTree(branches, judicialBranch, legislativeBranch, executiveBranch);
		government.print();
		government.depthFirstTraversal(government.root);
		
	}
	public static Tree buildTree(
			String[] branches, 
			String[] judicial, 
			String[] legislative, 
			String[] executive) {
		TreeNode govt = new TreeNode("Government");
		TreeNode j = new TreeNode(branches[0]);
		TreeNode l = new TreeNode(branches[1]);
		TreeNode e = new TreeNode(branches[2]);
		
		govt.addChild(j);
		govt.addChild(l);
		govt.addChild(e);
		for (String i : judicial) {
			j.addChild(i);
		}
		for (String i : legislative) {
			l.addChild(i);
		}
		for (String i : executive) {
			e.addChild(i);
		}
		Tree government = new Tree(govt);

		return government;
	}

}
