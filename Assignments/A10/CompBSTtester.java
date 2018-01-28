package assignment10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompBSTtester {

	public static void main(String[] args) {
		String[] javaKeyWords = {
				"assert", "boolean", "break", "byte", "case", "catch", "class",
				"const", // not allowed to be used!
				"continue", "default", "do", "double", "else", "enum", "extends",
				"false", "final", "finally", "float", "for", 
				"goto", // not allowed to be used!
				"if", "implements", "import", "instanceof", "int", "interface",
				"long", "native", "new", "null", "package", "private",
				"protected", "public", "return", "short", "static", "strictfp",
				"super", "switch", "synchronized", "this", "throw", "throws",
				"transient", "true", "try", "void", "volatile", "while"};
		
		ComparableBST<String> tree1 = new ComparableBST<>("assert");
		for (int i = 1; i < javaKeyWords.length; i++) {
			tree1.insert(javaKeyWords[i]);
		}
		
		//tree1.prettyPrint();
		System.out.println(tree1.height());
		System.out.println("Tree 1 is height balanced: "
				+ tree1.heightBalanced());
		
		Set<String> set1 = new TreeSet<>();
		Set<String> set2 = new HashSet<>();
		for (int i = 0; i < javaKeyWords.length; i++) {
			set1.add(javaKeyWords[i]);
			set2.add(javaKeyWords[i]);
		}
		
		long time1 = 0;
		long time2 = 0;
		time1 = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			for(String s : javaKeyWords) {
				tree1.find(s);
			}
		}
		time2 = System.currentTimeMillis();
		System.out.println("Time taken for tree1 "
				+ (time2 - time1)/1000.0 + " seconds");
		
		long time3 = 0;
		long time4 = 0;
		time3 = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			for(String s : javaKeyWords) {
				set1.contains(s);
			}
		}
		time4 = System.currentTimeMillis();
		System.out.println("Time taken for set1 "
				+ (time4 - time3)/1000.0 + " seconds");
		
		long time5 = 0;
		long time6 = 0;
		time5 = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			for(String s : javaKeyWords) {
				set2.contains(s);
			}
		}
		time6 = System.currentTimeMillis();
		System.out.println("Time taken for set2 "
				+ (time6 - time5)/1000.0 + " seconds");
		
		ComparableBST<String> tree2 = new ComparableBST<>("interface");
		tree2.insert("double");
		tree2.insert("strictfp");
		tree2.insert("catch");
		tree2.insert("finally");
		tree2.insert("private");
		tree2.insert("throws");
		tree2.insert("break");
		tree2.insert("continue");
		tree2.insert("extends");
		tree2.insert("goto");
		tree2.insert("new");
		tree2.insert("return");
		tree2.insert("synchronized");
		tree2.insert("try");
		tree2.insert("boolean");
		tree2.insert("case");
		tree2.insert("const");
		tree2.insert("do");
		tree2.insert("enum");
		tree2.insert("final");
		tree2.insert("for");
		tree2.insert("implements");
		tree2.insert("native");
		tree2.insert("package");
		tree2.insert("public");
		tree2.insert("static");
		tree2.insert("switch");
		tree2.insert("throw");
		tree2.insert("true");
		tree2.insert("volatile");
		tree2.insert("assert");
		tree2.insert("byte");
		tree2.insert("class");
		tree2.insert("default");
		tree2.insert("else");		
		tree2.insert("false");		
		tree2.insert("float");		
		tree2.insert("if");
		tree2.insert("import");
		tree2.insert("long");
		tree2.insert("null");
		tree2.insert("protected");
		tree2.insert("short");
		tree2.insert("super");
		tree2.insert("this");
		tree2.insert("transient");
		tree2.insert("void");
		tree2.insert("while");
		
		tree2.prettyPrint();
		System.out.println(tree2.height());
		System.out.println("Tree 2 is height balanced: "
				+ tree2.heightBalanced());
		
		long time7 = 0;
		long time8 = 0;
		time7 = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			for(String s : javaKeyWords) {
				tree2.find(s);
			}
		}
		time8 = System.currentTimeMillis();
		System.out.println("Time taken for tree2 "
				+ (time8 - time7)/1000.0 + " seconds");
		
		
		/*
		 * Time taken for tree1 10.994 seconds
		 * Time taken for set1 1.36 seconds
		 * Time taken for set2 0.292 seconds
		 * Time taken for tree2 2.114 seconds
		 */
	}

}
