package com.codegnan.arrays;

public class Sum12 {
	public static int sum12(int[] arr) {
		if(arr == null || arr.length ==0) {
			return 0;
		} else {
			if(arr.length ==1) {
				return arr[0];
			} else {
				return arr[0]+arr[1];
			}
		}
	}
	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		System.out.println("Sum : "+ sum12(arr1));
		int[] arr2= {4,5,3};
		System.out.println("Sum : "+ sum12(arr2));
		int[] arr3= {7,1,3};
		System.out.println("Sum : "+ sum12(arr3));
		int[] arr4= {};
		System.out.println("Sum : "+ sum12(arr4));
	}

}
