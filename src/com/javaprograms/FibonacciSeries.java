package com.javaprograms;

public class FibonacciSeries {
	public static int first = 0;
	public static int sec = 1;
	public static int next;
	
	public static void main(String[] args) {
	for(int i =0; i<10; i++){
		if(i<=1){
			next = i;
		}else{
		next = first+sec;
		first=sec;
		sec=next;
		}
		System.out.println(next);
			
		}	
	}
}
