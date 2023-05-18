package com.berk.hafta04.gun1;

public class MotorOzellikleri {
	public int motorHacmi;
	private String sasiNo;//sasi no 8 karakterden olusur
	public int tork;
	public int beygir;
	
	public String getSasiNo() {//ana mantik degeri gizle set ile deger al ve get ile ver
		return this.sasiNo;
	}
	public void setSasiNo(String sasiNo) {
		if(sasiNo.length()==8) {
		this.sasiNo = sasiNo;
		System.out.println("Kayit basarili");
		}else {
			System.err.println("Sasi no 8 haneli olmalidir");
		}
	}
	public void getInfo() {
		System.out.println("Motor Hacmi: "+motorHacmi+" Sasi No: "+ sasiNo+" Tork: "+tork+" Beygir: "+ beygir);	
		
	}
	@Override
	public String toString() {
		return "MotorOzellikleri [motorHacmi=" + motorHacmi + ", sasiNo=" + sasiNo + ", tork=" + tork + ", beygir="
				+ beygir + "]";
	}
	
	
	
}
