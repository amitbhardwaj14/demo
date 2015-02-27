package com.javaprograms;

public class reverseString {

	public String reverseMyString(String str){
		StringBuffer sbuffer = new StringBuffer(str);
		System.out.println(sbuffer.reverse());
		return sbuffer.toString();
	}
	
	public String reverseMyStringWithoutBuffer(String str){
		int length = str.length();
		String original = str;
		String reverse = "";
		
		for(int i =length-1;i>0;i--){
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
		return reverse;
	}
	
	public static void main(String[] args) {
		reverseString rstring = new reverseString();
		rstring.reverseMyString("hi i am working in gspann");
		rstring.reverseMyStringWithoutBuffer("gspann technologies");		

	}

}
