package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-->=0) {
            int n =sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n ; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println(arraylength(array));
        }

        }
    public static int arraylength(int[] array){ //New Function is created to calculate the length of the array
        int ans = 0;
        ans=array.length; //.length is used to Calculate the length of the array
        return ans;
    }
}

