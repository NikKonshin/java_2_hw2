package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

            int[] add = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

            for (int i = 0; i < add.length; i++) {
                if (add[i] == 0) {
                    add[i] = 1;
                } else {
                    add[i] = 0;
                }

            }
            System.out.println(Arrays.toString(add));
        }
}


