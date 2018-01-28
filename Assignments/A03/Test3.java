package assignment03;

public class Test3 {
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

		House[] houses1 = null;
		House[] houses2 = {};
		House[] houses3 = {h2, h2, h2};
		House[] houses4 = {h1, h3, h4};
		House[] houses5 = {h2, h2, h1, h3, h2, h4};

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

	public static House biggestFloorSpace(House[] houses) {
		House returnHouse = null;
		if (houses != null && houses.length > 0) {
			returnHouse = houses[0];
			for (int i = 0; i < houses.length; i++) {
				if (houses[i] != null){
					if (returnHouse !=  null) {
						if (houses[i].totalArea() > returnHouse.totalArea()) {
							returnHouse = houses[i];
						}
					}else {
						returnHouse = houses[i];
					}	
				}
			}
		}
		return returnHouse;
	}
}