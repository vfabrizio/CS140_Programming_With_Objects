package assignment04;

import java.util.ArrayList;
import java.util.Arrays;
import assignment03.Space;

public class HouseTester {
	public static void main(String[] args) {
		Space sp1 = new Space("Kitchen", 120.5);
		Space sp2 = new Space("Den", 150.0);
		Space sp3 = new Space("Master Bedroom", 100.5);
		Space sp4 = new Space("Guest Bedroom", 75.5);
		Space sp5 = new Space("Bathroom", 50.7);

		House h1 = new House();
		h1.add(sp1);
		h1.add(sp2);
		h1.add(sp3);
		h1.add(sp4);
		h1.add(sp5);

		System.out.println("House 1 = " + h1);
		System.out.println("Total Area in House 1 = " + h1.totalArea());

		House h2 = null;
		House h3 = new House();
		h3.add(sp1);
		h3.add(sp2);
		h3.add(sp3);
		h3.add(sp5);
		House h4 = new House();
		h4.add(sp1);
		h4.add(sp4);

		ArrayList<House> houses1 = null;
		ArrayList<House> houses2 = new ArrayList<>();
		ArrayList<House> houses3 = new ArrayList<>();
		houses3.add(h2);
		houses3.add(h2);
		houses3.add(h2);
		ArrayList<House> houses4 = new ArrayList<>();
		houses4.add(h1);
		houses4.add(h3);
		houses4.add(h4);
		ArrayList<House> houses5 = new ArrayList<>();
		houses5.add(h2);
		houses5.add(h1);
		houses5.add(h3);
		houses5.add(h2);
		houses5.add(h4);

		System.out.println("\nHouse in houses1 with largest area = "
						+ biggestFloorSpace(houses1));
		System.out.println("House in houses2 with largest area = "
						+ biggestFloorSpace(houses2));
		System.out.println("House in houses3 with largest area = "
						+ biggestFloorSpace(houses3));
		System.out.println("House in houses4 with largest area = "
						+ biggestFloorSpace(houses4));
		System.out.println("House in houses5 with largest area = "
						+ biggestFloorSpace(houses5));
	}

	 /**
	 * Finds the house in an ArrayList of houses with the largest total area.
	 * A null or empty ArrayList will return a null house.
	 * @param houses the ArrayList of House objects to inspect
	 * @return house in houses that has the largest total area in the ArrayList.
	 */
	public static House biggestFloorSpace(ArrayList<House> houses) {
		House returnHouse = null;
		if (houses != null && houses.size() > 0) {
			returnHouse = houses.get(0);
			for (int i = 0; i < houses.size(); i++) {
				if (houses.get(i) != null){
					if (returnHouse !=  null) {
						if (houses.get(i).totalArea() > returnHouse.totalArea()) {
							returnHouse = houses.get(i);
						}
					}else {
						returnHouse = houses.get(i);
					}	
				}
			}
		}
		return returnHouse;
	}
}