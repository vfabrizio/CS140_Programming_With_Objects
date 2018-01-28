package assignment02;

public class WeirdSorter1 {
    private int[] array;

    public WeirdSorter1(int[] array) {
        this.array = array;
    }

    public int[] sorted() {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                OneChange1 one = new OneChange1(array);
                array = one.modify(i);
            }
        }
        return array;
    }
}