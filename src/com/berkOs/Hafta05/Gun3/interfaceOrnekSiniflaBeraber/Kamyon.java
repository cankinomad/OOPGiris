package com.berkOs.Hafta05.Gun3.interfaceOrnekSiniflaBeraber;

public class Kamyon extends Arac implements IKaraTasiti,IYuk{

		private String dorseTipi;
		private int kasaUzunlugu;
		
		@Override
		public void sur() {
			System.out.println("Harakete gecildi");
			
		}

		@Override
		public void yukAl() {
			System.out.println(getClass().getSimpleName()+"Yuk aliniyor");
			
		}

		@Override
		public void yukBosalt() {
		System.out.println(getClass().getSimpleName()+"Yuk bosaltiliyor");			
		}
		
		@Override
		public void hizlan() {
			System.out.println(this.getClass().getSimpleName()+"Hizlaniyor");//icinde bulundugun classin basitce ismini yazdirir.
			hiz+=5;
			hizGoster();
			
		}

		@Override
		public void yavasla() {
			System.out.println(this.getClass().getSimpleName()+"Yavasliyor");//icinde bulundugun classin basitce ismini yazdirir.
			if (hiz>0) {
			hiz-=5;
			hizGoster();
			
			}
			
		}
		
}
