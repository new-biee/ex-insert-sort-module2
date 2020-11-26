package com.main;

public class InsertionSort {

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 33, 22, 5, 7};
        InsertionSort.sort(arr);
        for (int a : arr) {
            System.out.println(a + " ");
        }
    }
}
