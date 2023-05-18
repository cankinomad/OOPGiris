package com.berkOs.Hafta04.gun2.soyutlama;

public class Test {

	public static void main(String[] args) {
		// sinifimizda herhangi bir constructor yoksa default olarak bos const. gelir
		// fakat herhangi bir constructor tanimi yaparsak default constructor bosa
		// dusecektir ve
		// parametresiz constructorimiz calismayacaktir.

		Post post = new Post(1, "Ilk post");
		System.out.println(post.icerik);

		Post post2 = new Post();

		Post post3 = new Post(2, "ikinci post", 1);
		System.out.println(post3.icerik);
		
		Post post4=new Post(3,"yeni post",2,"resimurl");
		System.out.println(post4.icerik);
	}

}