package assignment03;

public class Test1 {
	public static void main(String[] args) {
		double[] array1 = null;
		double[] array2 = {};
		double[] array3 = {.5, 0.2, 4.0, -2.0, 7.0, -7.0};
		double[] array4 = {4.8, 6.7, 7.5, 9.0};
		Assig3 a1 = new Assig3();
		System.out.println("Array 1 has negative values: " +
							a1.hasNegative(array1));
		System.out.println("Array 2 has negative values: " +
							a1.hasNegative(array2));
		System.out.println("Array 3 has negative values: " +
							a1.hasNegative(array3));
		System.out.println("Array 4 has negative values: " +
							a1.hasNegative(array4));
	}
}