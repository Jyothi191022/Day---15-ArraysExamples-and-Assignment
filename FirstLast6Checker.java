package com.codegnan.arrays;

public class FirstLast6Checker {
	public static boolean firstLast6(int[] arr) {
		if(arr == null || arr.length == 0) {
			return false;
		} else {
			if(arr[0] == 6 || arr[arr.length-1] == 6) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1= {6,2,6};
		System.out.println(firstLast6(arr1));
		int[] arr2= {4,5,3};
		System.out.println(firstLast6(arr2));
		int[] arr3= {6,1,8,6};
		System.out.println(firstLast6(arr3));
		int[] arr4= {};
		System.out.println(firstLast6(arr4));
	}

}
