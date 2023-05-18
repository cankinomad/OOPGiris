package com.berkOs.Hafta06.Gun3.Stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * Disaridan bir kelime alip bu kelimeyi once stacke aktaralim
 * daha sonra bu stack uzerinde calisip bu kelimenin palindrom olup olmadigini bulalim
 * 
 * kek,kabak,tat gibi tersten okunusu ve duzden okunusu ayni olan kelimeler palindromdur.
 * 
 */
public class PalindromStack {
	Stack<Character> stack = new Stack<>();
	public static void main(String[] args) {
		
		PalindromStack palindromStack=new PalindromStack();
		Scanner input=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=input.nextLine();
		if(palindromStack.isPalindrom(kelime)) {
			System.out.println(kelime+" Palindromdur");
		}else {
			System.out.println(kelime+" Palindrom degildir");
		}

	}
	
	public void stackOlustur(String kelime) {
		for (int i = 0; i < kelime.length(); i++) {
			stack.push(kelime.charAt(i));
		}
	}
	public boolean isPalindrom(String kelime) {
		stackOlustur(kelime);
		for (int i = 0; i < kelime.length()/2; i++) {
			if(stack.pop()!=kelime.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
