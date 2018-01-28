package assignment02;

public class WeirdSorter {
    private int[] array;

    public WeirdSorter(int[] array) {
        this.array = array;
    }

    public int[] sorted() {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                OneChange one = new OneChange(array);
                array = one.modify(i);
            }
        }
        return array;
    }
}