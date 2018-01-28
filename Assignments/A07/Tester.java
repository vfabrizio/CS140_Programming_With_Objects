package assignment07;

public class Tester {

	public static void main(String[] args) {
		PancakeMenu pancakeMenu = new PancakeMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Server server = new Server(pancakeMenu, dinerMenu);
		server.printMenu();
		server.printVegetarianMenu();

		System.out.println("\nCustomer asks, is the Deluxe Burger vegetarian?"); 
		System.out.print("Server says: ");
		System.out.println(server.isEntryVegetarian("Deluxe Burger")?"Yes":"No");
		System.out.println("\nCustomer asks, are the Berry Waffles vegetarian?");
		System.out.print("Server says: ");
		System.out.println(server.isEntryVegetarian("Berry Waffles")?"Yes":"No");
		System.out.println("\nCustomer asks, is the Veggie Omlette vegetarian?");
		System.out.print("Server says: ");
		System.out.println(server.isEntryVegetarian("Veggie Omlette")?"Yes":"No");
		
		System.out.println();
		changePrices(pancakeMenu);
		changePrices(dinerMenu);
		server.printMenu();
		server.printVegetarianMenu();

	}
	
	public static void changePrices(Menu menu) {
		for (MenuEntry menuEntry : menu.createIterator().toIterable()) {
			if (menuEntry.getVegetarian()) {
				menuEntry.changeDown(5);
			}else {
				menuEntry.changeUp(5);
			}
		}
	}

}
