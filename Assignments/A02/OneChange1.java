package assignment02;

public class OneChange1 {
    private int[] array;

    public OneChange1(int[] array) {
        this.array = array;
    }

    public int greatestAfter(int start) {
        int value = 0;
        if (array != null && array.length > 0) {
            for (int i = start; i < array.length; i++) { 
                if (array[i] > array[start]) {
                    start = i;
                    value = i;
                }
            }
        }
        return value;
    }

    public int[] modify(int start) {
        int[] temp = new int[array.length];
        int k = greatestAfter(start);
        for (int j = 0; j < start; j++) {
            temp[j] = array[j];
        }
        temp[start] = array[k];
        for (int j = start; j < k; j++) {
            temp[j+1] = array[j];
        }
        for (int j = k + 1; j < array.length; j++) {
            temp[j] = array[j];
        }
        return temp;
    }
}