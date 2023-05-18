package com.berkOs.Hafta05.Gun3.interfaceOrnekSiniflaBeraber;

public class YukGemisi extends Gemi implements IYuk{

	@Override
	public void yukAl() {
		System.out.println("Gemi yuk aldi");
		
	}

	@Override
	public void yukBosalt() {
		System.out.println("Gemi yuk bosaltti");		
	}

}
