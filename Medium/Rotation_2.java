import java.util.*;
/*
Given an array, rotate the array to the right by k steps, where k is non-negative.
*/

class Rotation_2 {
    static void rotate(int[] nums, int k) {
        k = k%nums.length;   
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        
    }
    static void reverse(int[] ar, int l, int r) {
        while(l < r) {
            ar[l] = ar[l]^ar[r]^(ar[r]=ar[l]);
            l += 1;
            r -= 1;
        }
    }
    public static void main(String[] args) {

        int n = 8;
	int[] ar = {1, 2, 3, 4, 5, 6, 7, 8};
	int r = 3;
	rotate(ar, r); // if rotate towards left ==> rotate(ar, n-(r%n));
	System.out.println(Arrays.toString(ar));
    }
}