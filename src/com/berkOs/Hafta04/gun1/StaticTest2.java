package com.berkOs.Hafta04.gun1;

public class StaticTest2 {

	public static void main(String[] args) {
		StaticOrnek so=new StaticOrnek();
		so.numaraVer();
		so.number1=5;
		so.numaraVer();	// number1=6, nuber2=22
		so= new StaticOrnek();//number2 static oldugu icin newden etkilenmez../number 1 static olmadigi icin her new dedigimizde default degere donyor
		StaticOrnek myOrnek=new StaticOrnek();
		
		so.numaraVer();// number1=1, number2=23
		
		so.numaraVer(); // number1=2, number2=24
		so.numaraVer(); //number1=3, number2=25
		myOrnek.numaraVer();// number1=1 e geri doner ama number2 26 olarak devam eder static oldugu icin. myornek nesnesini yeni olusturduk o yuzden so ile alakasi yok. ayni sinifi referans alan nesneler.
		
	}
}
