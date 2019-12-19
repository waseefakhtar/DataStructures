package datastructures;

import java.util.Arrays;

public class Array {

    private int[] intArray;
    int count;

    public Array(int length) {
        intArray = new int[length];
    }

    public void insert(int item) {
        // If the array is full, resize it.
        if (intArray.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = intArray[i];
            }

            intArray = newItems;
        }

        // Add the new item at the end.
        intArray[count++] = item;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(intArray[i]);
        }
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
