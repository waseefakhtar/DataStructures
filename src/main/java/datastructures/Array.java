package datastructures;

import java.util.Arrays;

public class Array {

    private int[] intArray;

    public Array(int length) {
        intArray = new int[length];
    }

    public void insert(int item) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) {
                intArray[i] = item;
                return;
            }
        }

        int[] tempArray = intArray;
        intArray = new int[intArray.length + 1];
        for (int i = 0; i < tempArray.length; i++) {
            intArray[i] = tempArray[i];
        }
        intArray[intArray.length - 1] = item;
    }

    public void print() {
        System.out.println(Arrays.toString(intArray));
    }

    public int indexOf(int item) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void removeAt(int index) {
        if (index == intArray.length - 1) {
            int[] tempArray = intArray;
            intArray = new int[intArray.length - 1];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = tempArray[i];
            }
            return;
        }

        for (int i = 0; i < intArray.length; i++) {
            if (i == index) {
                //int[] tempArray = intArray;
                //intArray = new int[intArray.length - 1];
                for (int j = index; j < intArray.length; j++) {
                    intArray[j] = intArray[j + 1 % (intArray.length - 2)];
                }
            }
        }
    }
}
