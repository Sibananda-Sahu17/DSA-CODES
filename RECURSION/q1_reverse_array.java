// package 4;


// USING TWO VARIABLES

import java.util.*;
public class q1_reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        reverse(0, n-1, arr);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int l, int r, int[] arr) {
        if(l>=r) return;

        // swap(arr[l], arr[r]);

        // ------OR-----------

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverse(l+1, r-1, arr);
    }
}



// ------OR---------

// ---USING SINGLE VARIABLE----

// public static void reverse(int i, int[] arr) {            /* i = 0 here */
//     int n = arr.length;
//     if(i>=n/2) return true;

//     // swap(arr[l], arr[r]);

//     // ------OR-----------

//     int temp = arr[i];
//     arr[i] = arr[n-i-1];
//     arr[i] = temp;

//     reverse(i+1, arr);
// }