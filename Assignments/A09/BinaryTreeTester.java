package assignment09;

public class BinaryTreeTester {

	public static void main(String[] args) {
		/* This is the Binary Tree I set up to test my methods on
		 * 						Rhoda
		 * 			Karen				David
		 * 		Steph	Jess		Justin	null
		 * Lynn    null         Sophia   null
		 * 					null     Jack
		 */
		BinaryTree tree = new BinaryTree("Rhoda",
								new BinaryTree("Karen",
									new BinaryTree("Steph",
										new BinaryTree("Lynn"),
										new BinaryTree()),
									new BinaryTree("Jess")),
								new BinaryTree("David",
									new BinaryTree("Justin",
										new BinaryTree("Sophia",
											new BinaryTree(),
											new BinaryTree("Jack")),
										new BinaryTree()),
									new BinaryTree()));
		
		System.out.println(tree.numLeaves());
		System.out.println(tree.numNodesWithOneChild());
		tree.printInOrder();
		tree.swapChildren();
		tree.printInOrder();
	}

}
