package assignment04;

import assignment03.Space;
import java.util.ArrayList;
import java.util.Arrays;

public class House {
	private ArrayList<Space> spaces = new ArrayList<>();

	 /**
	 * Adds a Space object to an ArrayList of Space objects.
	 * A null Space will cause an IllegalArgumentExpection
	 * because Rooms cannot be null.
	 * @param sp the Space object to add
	 */
	public void add(Space sp) {
		if (sp != null) {
			spaces.add(sp);
		}else{
			throw new IllegalArgumentException("Rooms cannot be null");
		}
	}
	 /**
	 * Calculates the total area of a House by looking at the area of each
	 * Space object and summing all of them.
	 * @return total calculated
	 */
	public double totalArea() {
		double total = 0.0;
		for (int i = 0; i < spaces.size(); i++) {
			total += spaces.get(i).getArea();
		}
		return total;
	}
	 /**
	 * Converts a ArrayList to a String
	 * @return converted ArrayList
	 */
	public String toString() {
		return Arrays.toString(spaces.toArray());
	}
}