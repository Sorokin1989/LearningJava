package ru.sorokin.lessons.LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        fillArr(arr);
        filList(list);

        System.out.println(list);
        System.out.println(Arrays.toString(arr));




        for (int i = 0; i < 10; i++) {
            arr[i] = arr[i] * 2;
            list.set(i, list.get(i) * 2);

        }

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

    }

    private static void filList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);

        }

    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }

    }

}