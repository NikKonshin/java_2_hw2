package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        // Задание 1.

        int[] add = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        arrTask1(add);

        // Задание 2.

        int[] arr = new int[8];
        arrTask2(arr);

        // Задание 3.

        int[] arr1 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrTask3(arr1);

        // Задание 4.
        int[][] arr2 = new int[5][5];
        arrTask4(arr2);

        // Задание 5 **.
        int[] arr3 = new int[]{16, 17, 98, 178, 25, 30};
        arrTask5(arr3);
        System.out.println("Максимальное значение массива: " + arr3[0]);
        System.out.println("Минимальное значение массива: " + arr3[1]);

        // Задание 6 **.
        int[] arr4 = new int[]{1, 1, 1, 1, 1, 5};
        int a = 0, b = 0;
        boolean g = (a / 2) == b;
        arrTask6(arr4, g);
        System.out.println(g);

        // Задание 7 ****. К сожалению, у меня не получилось её решить, очень долго сидел.
        int[] arr5 = new int[]{1, 2, 3, 4, 5};
        int n = 1;
        arrTask7(arr5, n);
    }

    public static void arrTask1(int[] add) {

        for (int i = 0; i < add.length; i++) {
            if (add[i] == 0) {
                add[i] = 1;
            } else {
                add[i] = 0;
            }

        }
        System.out.println(Arrays.toString(add));
    }

    public static void arrTask2(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrTask3(int[] arr1) {

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 6) {
                arr1[i] *= 2;
            }

        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void arrTask4(int[][] arr2) {
        //int[][] arr2 = new int[5][5];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (i == j || i + j == arr2.length - 1) {
                    arr2[i][j] = 1;
                    System.out.printf("%4d", arr2[i][j]);
                } else {
                    arr2[i][j] = 0;
                    System.out.printf("%4d", (arr2[i][j]));
                }
            }
            System.out.println();
        }
    }

    public static void arrTask5(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[0] < arr3[i]) {
                arr3[0] = arr3[i];
            }
            if (arr3[1] > arr3[i]) {
                arr3[1] = arr3[i];
            }
        }
    }

    public static boolean arrTask6(int[] arr4, boolean g) {
        int a = 0, b = 0;

        for (int i = 0; i < arr4.length; i++) {
            a += arr4[i];
        }
        for (int j = 0; j < arr4.length; j++) {
            b += arr4[j];
            if ((a / 2) == b) {
                break;
            } else if ((a / 2) < b) {
                break;
            }


        }
        return g;
    }
//
    public static void arrTask7(int[] arr5, int n) {
        //int[] arr5 = new  int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            if ((i - n) > 0) {
                arr5[i] = arr5[i - n];
            } else if ((i - n) < 0) {
                int c = arr5.length - 1;
                arr5[i] = arr5[c - i];
            }
        }
        System.out.println(Arrays.toString(arr5));
    }

}
