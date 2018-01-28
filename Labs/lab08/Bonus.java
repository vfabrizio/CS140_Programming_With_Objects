package lab08;

public class Bonus {
	public static void main(String[] args) {
		printPascalsTriangle(5);
	}
	
	public static void printPascalsTriangle(int limit) {
		int c = 0;
		for (int i = 0; i <= limit; i++) {
			c = 0;
			while (c <= i) {
				System.out.print(Recursion.binomialCoefficient(i, c));
				System.out.print(" ");
				c++;
			}
			System.out.println();
		}
		
	}
}
