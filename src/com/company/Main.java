package com.company;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
	// write your code here

        int[] massive = {10, 7, 8, 4, 93, 85, 24, 86, 54, 32, 16, 13, 45, 5, 67};
        System.out.println(Arrays.toString(massive));
        boolean needIteration = true;

        System.out.println("____________");

        while (needIteration) {
            System.out.println(Arrays.toString(massive));

            needIteration = false;

            for (int i = 1; i < massive.length; i++) {
                int min = massive[i];
                int minId = i;
                if (massive[i] < massive[i - 1]) {
                    swap (massive, i, i-1);
                    needIteration = true;
                }

            }
        }
        System.out.println(Arrays.toString(massive));



    }

    private static void swap(int[] massive, int index1, int index2) {
        int tmp = massive[index1];
        massive[index1] = massive[index2];
        massive[index2] = tmp;
    }
}
