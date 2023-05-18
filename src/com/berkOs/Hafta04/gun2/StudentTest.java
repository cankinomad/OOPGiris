package com.berkOs.Hafta04.gun2;

public class StudentTest {
	public static void main(String[] args) {

		Student student1 = new Student();
		student1.ad = "Mustafa";
		student1.kayit();

		Student student2 = new Student();
		student2.ad = "Doruk";
		student2.kayit();

		System.out.println(student1.no);

		Student student3 = new Student();
		student3.ad = "Merve";
		student3.kayit();

		System.out.println("Kayitli ogrenci sayisi=>" + Student.index);
	}
}
