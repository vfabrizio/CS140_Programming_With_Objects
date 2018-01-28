package assignment03;

import java.util.Arrays;

public class House {
	private Space[] spaces = new Space[3];
	private int nextIndex = 0;

	public String toString() {
		return Arrays.toString(spaces);
	}

	public void add(Space sp) {
		spaces[nextIndex] = sp;
		nextIndex += 1;
		if (nextIndex == spaces.length) {
			spaces = Arrays.copyOf(spaces, spaces.length*2);
		}
	}

	public double totalArea() {
		double total = 0.0;
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] != null) {
				total += spaces[i].getArea();
			}
		}
		return total;
	}
}