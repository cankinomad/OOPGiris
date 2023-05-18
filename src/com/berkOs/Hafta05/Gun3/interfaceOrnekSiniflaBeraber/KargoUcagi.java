package com.berkOs.Hafta05.Gun3.interfaceOrnekSiniflaBeraber;

public class KargoUcagi extends Ucak implements IYuk{

	@Override
	public void yukAl() {
		System.out.println("Ucak yuk aldi");
		
	}

	@Override
	public void yukBosalt() {
		System.out.println("Ucak yuk bosaltti");		
	}

}