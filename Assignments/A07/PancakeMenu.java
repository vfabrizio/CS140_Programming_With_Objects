package assignment07;

import java.util.ArrayList;

public class PancakeMenu implements Menu {
	private ArrayList<MenuEntry> menuEntries = new ArrayList<>();
	
	public PancakeMenu() {
		addItem("Blueberry Pancakes",
				"Pancakes with fresh blueberries",
				true, new Price(4,60));
		addItem("Chocolate chip Pancakes",
				"Pancakes with chocolate chips and powdered sugar",
				true, new Price(4,60));
		addItem("Berry Waffles",
				"Waffles with strawberries and blueberries",
				true, new Price(5,60));
		addItem("Waffle Special",
				"Waffles with a side of bacon, hashbrowns and toast",
				false, new Price(6,50));
	}

	public void addItem(String n, String d, boolean v, Price p) {
		menuEntries.add(new MenuEntry(n, d, v, p));
	}

	@Override
	public MenuEntryIterator createIterator() {
		return MenuEntryIterator.adapt(menuEntries.iterator());
	}

}
