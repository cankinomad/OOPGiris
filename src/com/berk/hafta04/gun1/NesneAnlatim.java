package com.berk.hafta04.gun1;

public class NesneAnlatim {

	public static void main(String[] args) {
		// Car araba1;// referans. Car turunde bir veri tutabilir
		// new Car();// sinif adiyla ayni isimde aciyoruz. Car constructor
		/*
		 * new Car nesnesi olusturdugunda Ram iceerisinde Heap'de bir nesne
		 * olusturuluyor turu Car, ve degiskenleri Car'in altinda tutuluyor
		 * marka,model,yil... ne tanimlanmissa car sinifi icinde Ram icerisinde Stack ve
		 * Heap yeri var veri tutan. Stack hizli calisir yeri azidr Hesap yavas yeri
		 * daha fazla
		 * 
		 */
		Car araba1 = new Car(); // new car dedigin an nesne olustu araba1 referans olarak car sinfini icine aldi
		Car araba2 = new Car();// yeni bir nesne araba2 heapte o sinifi tutuyor, new dedigin an stack kisminda
								// yeni nesneyle cari refere ediyor

		System.out.println(araba1.getInfo());
		System.out.println(araba2.getInfo());

		System.out.println("=======================================Hiz Goster");
		System.out.println(araba1.getHiz());

		araba1.marka = "Mercedes";
		araba1.model = "S450";
		araba1.yil = "2020"; // biglilerini boyle giriyorsun
		araba1.setHiz(160);
		araba1.km = 10000;

		System.out.println("=======================================Hiz Goster");
		System.out.println(araba1.getHiz());

		// Car.MAX_HIZ=150;//boyle tanimamalisin static sinifa bagli oldugundan. Gidip
		// kendi sinifinda atabilirsin

		System.out.println("============================================");
//		araba1.motorHacmi=1300;
//		araba1.sasiNo="AE12 3451";
//		araba1.beygir=90;
//		araba1.tork=200;
		MotorOzellikleri motor1 = new MotorOzellikleri(); // motorOZellikleri classinda motor1 nesnesi olusturduk
		motor1.setSasiNo("54545");//
		motor1.motorHacmi = 1500;//
		motor1.beygir = 90;// bu ozelliklerin hepsi motor1 e atildi ve motor1 i gidip araba1 e referans
							// gosterdik
		motor1.tork = 200;//
		System.out.println("========================================= Sasi No");
		
		araba1.motor = motor1; // motor1 nesnesinin adresini artik motor da gosteriyor
		
		System.out.println(araba1.motor.getSasiNo());
		araba1.motor.beygir = 90; // boyle tek tek de atayabilirsin ama motor1 uzerinden butun ozelliklerini verip
									// onu direk araba1 e atayabilirsin
		araba1.motor.motorHacmi = 1500;
		araba1.motor.setSasiNo("54545455");
		araba1.motor.tork = 200;
		// araba1.MAX_HIZ=150; final ile sinirlayinca artik deger atamaya izin yok
		System.out.println(araba1.motor.getSasiNo());
		System.out.println("========================================= Sasi No");

		System.out.println("=========================================");
		System.out.println("Motor harcmi: " + araba1.motor.motorHacmi);
		araba1.motor.getInfo(); // void dondugun icin sout yapmana gerke yok metodu cagirarak yazdirabilirsin
		
		System.out.println("============================================");

		System.out.println(araba1.getInfo());
		araba1.hizlanma(20);
		araba1.hizlanma(20);
		araba1.hizlanma(40);
		araba1.hizlanma(40);
		araba1.hizlanma(40);

		System.out.println(araba1.getInfo());
		double zaman = araba1.go(100);
		System.out.println("Gecen sure: " + zaman + " saat");
		System.out.println(Car.MAX_HIZ);
		Car.sinifBilgisi(" Cok Hizli gitme");

		System.out.println("=====================================MAX HIZ");
		System.out.println("============================================");
		Car car3 = new Car("Audi", "A7");
		System.out.println(Car.URETILEN_ARAC_SAYISI);

		
		System.out.println(araba1.toString());
//		araba2.marka="Toyota";
//		araba2.model="Corolla";
//		araba2.yil="2022";						//biglilerini boyle giriyorsun
//		araba2.hiz=0;
//		araba2.km=5000;
//		//araba2.MAX_HIZ=200;
//		//araba2.motor=araba1.motor; //eger motor ozellikleri ayniysa boyle bir esitleme yapabilrsin
//		araba2.motor=motor1; // yaparak da 
//		System.out.println(araba2.MAX_HIZ);
//		
//		System.out.println("============================================");
//		
//		
//		araba1=araba2;		//araba 2 referansi artik araba1 e atandi ve ikisi de heap'de aynisini gosteriyor
//		System.out.println(araba1.marka);//Toyota	
//		System.out.println(araba2.marka);//Toyota
//		araba2.marka="Volkswagen";
//		System.out.println(araba1.marka);//volkswagen
//		System.out.println(araba2.marka);//Volkswagen
//		araba1.marka="toyota";
//		System.out.println(araba1.marka);//Toyota
//		System.out.println(araba2.marka);//Volkswagen
//		//Stack mantigi: last in first out.
//		System.out.println("============================================");
//	//	Car araba3=new Car();
//		//System.out.println(araba3.getInfo());
//		System.out.println("============================");
//		//new Car();
//		
//		//Car araba4=new Car("Mazda", "G3");
//		//System.out.println(araba4.getInfo());
//		System.out.println("============================================");
//		Car araba5=new Car("Volkswagen", "Golf", "2022", 10000, 20);
//		System.out.println(araba5.getInfo());
//		//araba5.motor.getInfo();
//		System.out.println("============================================");
//		//Car araba6=new Car("Peugeout","3008");
	}

}
