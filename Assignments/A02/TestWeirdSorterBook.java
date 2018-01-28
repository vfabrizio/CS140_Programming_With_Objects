package assignment02;

import java.util.Arrays;

public class TestWeirdSorterBook {
    public static void main(String[] args) {
        Book[] test1 = {new Book("Book A", 3),
                        new Book("Book B", 7),
                        new Book("Book C", 9),
                        new Book("Book D", 10),
                        new Book("Book E", 2),
                        new Book("Book F", 6),
                        new Book("Book G", 3),
                        new Book("Book H", 1),
                        new Book("Book I", 2)};

        WeirdSorterBook wsb = new WeirdSorterBook(test1);

        System.out.println(Arrays.toString(wsb.sorted()));

        System.out.println("Average Number of Pages: "
                           + avgPagesInLibrary(test1));
    }

    public static double avgPagesInLibrary(Book[] books) {
        double average = 0.0;
        double total = 0.0;
        if (books != null && books.length > 0) {
            for (int i = 0; i < books.length; i++) {
                total += books[i].getNumPages();
            }
        }
        average = total / books.length;
        return average;
    }
}