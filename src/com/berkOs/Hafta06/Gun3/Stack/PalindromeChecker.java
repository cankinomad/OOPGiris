package com.berkOs.Hafta06.Gun3.Stack;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Bir kelime girin: ");
	        String kelime = scanner.nextLine();
	        scanner.close();

	        // Kelimeyi stack'e ekleyin
	        Stack<Character> stack = new Stack<>();
	        for (int i = 0; i < kelime.length(); i++) {
	            stack.push(kelime.charAt(i));
	        }

	        // Stack'i kullanarak palindrom olup olmadığını kontrol edin
	        String tersKelime = "";
	        while (!stack.isEmpty()) {
	            tersKelime += stack.pop();
	        }

	        if (kelime.equalsIgnoreCase(tersKelime)) {
	            System.out.println(kelime + " bir palindrom kelime.");
	        } else {
	            System.out.println(kelime + " bir palindrom kelime değil.");
	        }
	    }
}
