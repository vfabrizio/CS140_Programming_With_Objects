package assignment07;

import java.util.ArrayList;

public class DinerMenu implements Menu {
	private ArrayList<MenuEntry> menuEntries = new ArrayList<>();
	
	
	public DinerMenu() {
		addItem("Deluxe Burger", 
				"Cheseburger with lettuce, tomatoes, and onions",
				false, new Price(10,59));
		addItem("Veggie Burger",
				"Veggie burger with lettuce and tomato",
				true, new Price(9,30));
		addItem("Tuna Melt Special",
				"Tuna salad with lettuce, tomato and melted American cheese on toasted white bread",
				false, new Price(5,0));
		addItem("Egg Salad",
				"Egg Salad with lettuce on toasted grain bread",
				true, new Price(4, 60));
		addItem("Western Omlette",
				"4 eggs with diced Ham, green peppers, onions and American Cheese",
				false, new Price(5,50));
		addItem("Veggie Omlette",
				"Egg whites with Spinach, tomato and mushrooms",
				true, new Price(5,90));
	}

	public void addItem(String n, String d, boolean v, Price p) {
		menuEntries.add(new MenuEntry(n, d, v, p));
	}

	@Override
	public MenuEntryIterator createIterator() {
		return new DinerMenuIterator(menuEntries.toArray(new MenuEntry[]{}));
	}

}
