package lab10;

import java.util.Comparator;

public class Bonus {

	public static void main(String[] args) {
		Comparator<String> strComp = (i, j) -> j.length() - i.length();
        BinarySearchTree<String> tree3 = new BinarySearchTree<>(strComp);
        tree3.insert("Mildred");
        tree3.insert("Bob");
        tree3.insert("Karen");
        tree3.insert("Sophia");
        tree3.insert("Johnathan");
        tree3.insert("Bo");
        tree3.prettyPrint();
        System.out.println();
        System.out.println(tree3.find("Bo"));
        System.out.println(tree3.find("Bill"));
        System.out.println(tree3.getElements());

	}

}
