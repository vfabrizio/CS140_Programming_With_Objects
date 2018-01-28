package assignment07;

import java.util.Iterator;

public interface MenuEntryIterator extends Iterator<MenuEntry> {
	default Iterable<MenuEntry> toIterable() {
        return () -> this;
    }
	
	public static MenuEntryIterator adapt(Iterator<MenuEntry> iter) {
		return new MenuEntryIterator() {

			@Override
			public boolean hasNext() {
				return iter.hasNext();
			}

			@Override
			public MenuEntry next() {
				return (MenuEntry) iter.next();
			}
			
		};
	}
}
