package assignment07;

public class Server {
	private Menu pancakeMenu;
	private Menu dinerMenu;
	
	public Server(Menu pancakeMenu, Menu dinerMenu) {
		this.pancakeMenu = pancakeMenu;
		this.dinerMenu = dinerMenu;
	}
	
	private void printMenu(MenuEntryIterator iterator) {
		for (MenuEntry menuEntry : iterator.toIterable()) {
			System.out.println(menuEntry);
		}
	}
	
	public void printMenu() {
		System.out.println("MENU\n---\nBREAKFAST");
		MenuEntryIterator pan = pancakeMenu.createIterator();
		printMenu(pan);
		System.out.println("\nLUNCH");
		MenuEntryIterator din = dinerMenu.createIterator();
		printMenu(din);
	}
	
	private boolean isVegetarian(String name, MenuEntryIterator iterator) {
		for (MenuEntry menuEntry : iterator.toIterable()) {
			if (name.equals(menuEntry.getName())) {
				if (menuEntry.getVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}
	
	private void printVegetarianMenu(MenuEntryIterator iterator) {
		for (MenuEntry menuEntry : iterator.toIterable()) {
			if (menuEntry.getVegetarian()) {
				System.out.println(menuEntry);
			}
		}
	}
	
	public void printVegetarianMenu() {
		System.out.println("\nVEGETARIAN MENU\n---\nBREAKFAST");
		MenuEntryIterator pan = pancakeMenu.createIterator();
		printVegetarianMenu(pan);
		System.out.println("\nLUNCH");
		MenuEntryIterator din = dinerMenu.createIterator();
		printVegetarianMenu(din);
	}
	
	public boolean isEntryVegetarian(String name) {
		for (MenuEntry element : pancakeMenu.createIterator().toIterable()) {
			if (name.equals(element.getName())) {
				return isVegetarian(name, pancakeMenu.createIterator());
			}
		}
		return isVegetarian(name, dinerMenu.createIterator());
	}
}
