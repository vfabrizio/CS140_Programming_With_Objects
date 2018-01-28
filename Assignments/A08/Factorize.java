package assignment08;

import java.util.ArrayList;
import java.util.Arrays;
import java.awt.geom.Point2D;

public class Factorize {
	public static ArrayList<Integer> factors(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Can't have a negative factor");
		}
		ArrayList<Integer> temp = new ArrayList<>();
		if (n == 0 || n == 1) {
			return temp;
		}
		if (n == 2) {
			temp.add(new Integer(2));
			return temp;
		}
		int f = n;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				f = n / i;
			}
		}
		temp.add(new Integer(f));
		int m = n/f;
		temp.addAll(factors(m));
		return temp;
	}
	
	public static String binary(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Can't convert negative integers");
		}
		if (n < 1) {
			return "";
		}
		if (n % 2 == 0) {
			return binary(n/2) + "0";
		}
		return binary(n/2) + "1";
	}
	
	public static String reverse(String text) {
		if (text == null) {
			return "llun";
		}
		if (text.length() == 0) {
			return "";
		}
		String str = text.charAt(0) + "";
		if (text.length() == 1) {
			text = "";
		}else {
			text = text.substring(1);
		}
		
		return reverse(text) + str;
	}
	
	public static int indexOf(int count, String text, String str) {
		if (!text.contains(str)) {
			return -1;
		}
		if (text.startsWith(str)) {
			return count;
		}
		return indexOf(count+1, text.substring(1), str);
	}
	
	public static int indexOf(String text, String str) {
		return indexOf(0, text, str);
	}
	
	public static double area(Point2D.Double[] pts) {
		int len = pts.length;
		double a = pts[0].getX();
		double b = pts[0].getY();
		double c = pts[1].getX();
		double d = pts[1].getY();
		if (len == 3) {
			double e = pts[2].getX();
			double f = pts[2].getY();
			return Math.abs(a*d + c*f + e*b - b*c -d*e - f*a) / 2;
		}
		double e = pts[len-1].getX();
		double f = pts[len-1].getY();
		return Math.abs(a*d + c*f + e*b - b*c -d*e - f*a) / 2 
				+ area(Arrays.copyOfRange(pts, 1, len));
	}
	
	
}
