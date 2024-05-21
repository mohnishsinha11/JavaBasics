package org.example.collections.sort;

import java.util.Arrays;
import java.util.Comparator;

public class IntArrayExample {
    public static void main(String[] args) {
        int[] arr = {10,4,5,2,1,11,21,12};
        int[] arr2 = arr;
        System.out.print("Array before sorting : ");
        for(int num:arr){
            System.out.print(num + " ");
        }

        System.out.println();
        Arrays.sort(arr);
        System.out.print("Array after sorting : ");
        for(int num:arr){
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.print("Duplicate array before sorting : ");
        for(int num:arr2){
            System.out.print(num + " ");
        }

        int n = arr2.length;
        Integer[] arr3 = new Integer[n];
        for(int i=0;i<n;i++){
            arr3[i] = arr2[i];
        }
        System.out.println();
        Arrays.sort(arr3, Comparator.reverseOrder());
        System.out.print("Array after sorting duplicate in descending order : ");
        for(int num:arr3){
            System.out.print(num + " ");
        }
    }
}
