package datastructures;

import java.util.Arrays;

public class Array {

    private int[] intArray;
    int count;

    public Array(int length) {
        intArray = new int[length];
    }

    public void insert(int item) {
        if (intArray.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = intArray[i];
            }

            intArray = newItems;
        }

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
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            intArray[i] = intArray[i + 1];
        }

        count--;
    }
}
