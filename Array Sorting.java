package com.company;

import java.util.Scanner;

public class Array Sorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array:");
        int a = sc.nextInt();
        System.out.println("Enter the Arrays to be stored in the given Size:");
        int [] b = new int[a];
        for (int i = 0; i<a; i++) {
            b[i] = sc.nextInt();
        }
        boolean ans = is_Sorted(b,a);
        if (ans==true) {
            System.out.print("The Given Array is Sorted");
        }
        else {
            System.out.println("The Given Array is not Sorted");
        }
    }
    public static boolean is_Sorted(int[]a, int b){
        for (int i = 1; i <b ; i++) {
            if (a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }
}

