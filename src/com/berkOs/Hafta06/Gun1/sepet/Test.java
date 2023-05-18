package com.berkOs.Hafta06.Gun1.sepet;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String[]array= {"Java","React"};
		
		ArrayList<String> list=new ArrayList<>(Arrays.asList(array)); 
		
		for (String string : list) {
			System.out.println(string);
		}
		
		
	}
}
