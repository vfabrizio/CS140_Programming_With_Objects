package lab02;

public class Library {
    public static void main(String[] args) {
        Book[] library = { new Book("Home", 233),
                           new Book("End of Days", 417),
                           new Book("Rule of Three", 300) };

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i].getTitle());
        }

        for (Book element : library) {
            System.out.println(element.getNumPages());
        }

        System.out.println("Total pages expected: " + 950);

        int pages = numPagesInLibrary(library);
        System.out.println("Total pages: " + pages);

        System.out.println("Max amount of pages expected: " + 417);

        int maxPages = mostPages(library);
        System.out.println("Max amount of pages: " + maxPages);
    }

    public static int numPagesInLibrary(Book[] books) {
        int totalPages = 0;
        for (Book element : books) {
            totalPages += element.getNumPages();
        }
        return totalPages;
    }

    public static int mostPages(Book[] books) {
        int maxAmtPages = 0;
        for (Book element : books) {
            if (element.getNumPages() > maxAmtPages) {
                maxAmtPages = element.getNumPages();
            }
        }
        return maxAmtPages;
    }
}