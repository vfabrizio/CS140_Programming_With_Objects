package assignment02;

public class WeirdSorterBook {
    private Book[] array;

    public WeirdSorterBook(Book[] array) {
        this.array = array;
    }

    public Book[] sorted() {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                OneChangeBook one = new OneChangeBook(array);
                array = one.modify(i);
            }
        }
        return array;
    }
}