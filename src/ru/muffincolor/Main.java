package ru.muffincolor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(replaceElements(array)));
        System.out.println(Arrays.toString(generateArray()));
        array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(doubleSpecifyNumbers(array)));
        int[][] bigArray = new int[5][5];
        System.out.println(" ");
        System.out.println(Arrays.deepToString(setNumberOne(bigArray)));
        array = new int[]{1, 4, 5, 6, 23, 2, 5, 25, 21};
        getMaximumFromArray(array);
        array = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Is balanced? " + findBalance(array));
    }

    public static int[] replaceElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        return array;
    }

    public static int[] generateArray() {
        int[] array = new int[8];
        int step = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = step;
            step += 3;
        }
        return array;
    }

    public static int[] doubleSpecifyNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    public static int[][] setNumberOne(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array[i].length - 1 - i] = 1;
        }
        return array;
    }

    public static void getMaximumFromArray(int[] array) {
        int maximum = array[0];
        int minimum = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > maximum) {
                maximum = array[i];
            } else if(array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println("Maximum is " + maximum);
        System.out.println("Minimum is " + minimum);
    }

    public static boolean findBalance(int[] array) {
        int leftHandSum = 0;
        for(int i = 0; i < array.length; i++) {
            leftHandSum += array[i];
            int rightHandSum = 0;
            for (int j = 0; j < array.length; j++) {
                rightHandSum += array[j];
            }
            if(leftHandSum == rightHandSum) {
                return true;
            }
        }
        return false;
    }
}
