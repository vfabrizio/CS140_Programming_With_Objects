package assignment02;

public class OneChange {
    private int[] array;

    public OneChange(int[] array) {
        this.array = array;
    }

    public int smallestAfter(int start) {
        int value = 0;
        if (array != null && array.length > 0) {
        	for (int i = start; i < array.length; i++) { 
            	if (array[i] < array[start]) {
                	start = i;
                	value = i;
            	}
        	}
        }
        return value;
    }

    public int[] modify(int start) {
        int[] temp = new int[array.length];
        int k = smallestAfter(start);
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