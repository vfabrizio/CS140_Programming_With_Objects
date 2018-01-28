package lab06;

import java.util.Arrays;
import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
        testInts();
        testPartitioner();
        testZipper();
    }

    public static void testInts() {
        OneInt a = new OneInt(5);
        System.out.println(a);
        OneInt b = new OneInt(3);
        TwoInts c = new TwoInts(29, 5);
        System.out.println(c);
        TwoInts d = new TwoInts(2, 4);
        ArrayList<OneInt> ints = new ArrayList<>();
        ints.add(a);
        ints.add(b);
        ints.add(c);
        ints.add(d);
        ArrayList<OneInt> oi2 = null;
        ArrayList<OneInt> oi3 = new ArrayList<>();
        ArrayList<OneInt> oi4 = new ArrayList<>();
        oi4.add(null);
        oi4.add(null);
        ArrayList<OneInt> oi5 = new ArrayList<>();
        oi5.add(a);
        oi5.add(null);
        oi5.add(c);
        System.out.println("expected 48, got " + OneInt.sumAll(ints));
        System.out.println("expected -1, got " + OneInt.sumAll(oi2));
        System.out.println("expected 0, got " + OneInt.sumAll(oi3));
        System.out.println("expected 0, got " + OneInt.sumAll(oi4));
        System.out.println("expected 39, got " + OneInt.sumAll(oi5));
    }

    public static void testPartitioner() {
        Partitioner p = new Partitioner();
        Parent[] array = new Parent[5];
        array[0] = new Parent();
        System.out.println(array[0]);
        array[1] = new Parent();
        array[2] = new Child();
        System.out.println(array[2]);
        array[3] = new Parent();
        array[4] = new Child();
        p.partition(array);
        Parent[] pa = p.getParents();
        Child[] ca = p.getChildren();
        System.out.println("Parents: " + Arrays.toString(pa));
        System.out.println("Children: " + Arrays.toString(ca));

        Partitioner p2 = new Partitioner();
        Parent[] array2 = new Parent[0];
        p2.partition(array2);
        Parent[] pa2 = p2.getParents();
        Child[] ca2 = p2.getChildren();
        System.out.println("Parents: " + Arrays.toString(pa2));
        System.out.println("Children: " + Arrays.toString(ca2));
    }

    public static void testZipper() {
        int ret[] = Zipper.zip(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8});
        System.out.println("Expecting {1, 2, 3, 4, 5, 6, 7, 8}");
        System.out.println("Received " + Arrays.toString(ret));

        int[] arr2 = Zipper.zip(new int[]{7, 7, 7}, new int[]{8, 8, 8});
        System.out.println("Expecting [7, 8, 7, 8, 7, 8]");
        System.out.println("Received " + Arrays.toString(arr2));

        try{
            int[] arr3 = Zipper.zip(null, new int[]{8, 8, 8, 8});
            System.out.println("Expecting bad input");
            System.out.println("Received " + Arrays.toString(arr3));
        }catch(IllegalArgumentException e) {
            System.out.println("Exception = " + e);
        }
        try {
            int[] arr4 = Zipper.zip(new int[]{7, 7, 7}, new int[]{8, 8, 8, 8});
            System.out.println("Expecting bad input");
            System.out.println("Received " + Arrays.toString(arr4));
        }catch(IllegalArgumentException e) {
            System.out.println("Exception = " + e);
        }

        int[] arr5 = Zipper.zip(new int[]{}, new int[]{});
        System.out.println("Expecting []");
        System.out.println("Received " + Arrays.toString(arr5));
    }
}
