package com.javaprograms;

public class findDuplicate {
	 
	public static void main(String[] args) {
		int arr[] = {2,4,3,2,5};
		//boolean duplicate = false;
		//System.out.println("first array value is "+arr[0]);
		for(int i =0; i<arr.length;i++){
		//	System.out.println("array is " +arr[i]);
			for(int j=0;j<arr.length;j++){
				if(arr[i] == arr[j]){
					System.out.println("duplicate value is : "+arr[i]);
					}
			}
		}
	}	
}
