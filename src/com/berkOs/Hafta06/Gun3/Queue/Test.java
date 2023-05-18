package com.berkOs.Hafta06.Gun3.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
		Queue<Integer> kuyruk=new LinkedList<>();
		kuyruk.offer(3);
		kuyruk.add(4);
		kuyruk.add(4);
		kuyruk.add(3);
		
		System.out.println(kuyruk.peek());
//		while (!kuyruk.isEmpty()) {
//			System.out.println(kuyruk.poll());
//		}
	}
}
