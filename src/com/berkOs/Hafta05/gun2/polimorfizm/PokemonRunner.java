package com.berkOs.Hafta05.gun2.polimorfizm;

import java.util.ArrayList;
import java.util.Random;

/*
 * bir metot yaratalim bu metot 0 ile 2 arasinda bir sayi uretsin bu gelen sayiya gore 
 * uygulamadaki pokemonlardan birini kullanicinin pokemonu yapsin;
 * 
 * her pokemonun yakalanmaya direnci olsa
 * elektrik pokemonunu 3 atesin 4, suyun 2 olsa;
 * 
 * pokemon yakala metodunda birde bize pokemon yakalama puani uretilsin. 1-8 arasi bir puan
 * 
 *  bu puan direnc katsayisindan buyukse pokemon yakalnmistir buna gore bize pokemonun yakalanip yakalanmadigini donsun.
 */

public class PokemonRunner {
	public static void pokemonYakala(ArrayList<Pokemon> pokemonListesi,Kullanici kullanici) {
		if(kullanici.getPokemonYakalamapuani()==1) {
			kullanici.setPokemonYakalamapuani(kullanici.getPokemonYakalamapuani()*3);
		}
		
		Random random=new Random();
		int index=random.nextInt(pokemonListesi.size()); //arraylistin boyutu disinda bir sayi uretmez!!!
		
		Pokemon pokemon=pokemonListesi.get(index);
		if(kullanici.getPokemonYakalamapuani()>=pokemon.getDirencKatsayisi()) {
		kullanici.getPokemonlar().add(pokemon); //arraylist oldugundan direk getpokemonlar diyip add ile baglayabilirsin o sonuna ekleyecek
		pokemon.setSahibiVarMi(true);
	
		System.out.println("Tebrikler"+ pokemon.getAd()+" adli pokemonu yakaladiniz");
		System.out.println("Eski puaniniz"+ kullanici.getPokemonYakalamapuani());
		
		kullanici.setPokemonYakalamapuani(kullanici.getPokemonYakalamapuani()+1);
		
		System.out.println("Yeni puaniniz"+ kullanici.getPokemonYakalamapuani());
		}else {
			System.out.println("Eski puaniniz"+ kullanici.getPokemonYakalamapuani());
			
			kullanici.setPokemonYakalamapuani(kullanici.getPokemonYakalamapuani()-1);
			System.out.println("Uzgunum yakalama denemesi basariz oldu");
			System.out.println("Yeni puaniniz"+ kullanici.getPokemonYakalamapuani());
		}
	
		
	}
	
//	public static void pokemonEkle(Kullanici kullanici) {
//		
//		Pokemon pokemon1=new ElektrikPokemonu(4, "Raichu", 2, 1000, 350, 500);
//		Pokemon pokemon2=new AtesPokemonu(2, "charizard", 3, 5000, 350, 500);
//		Pokemon pokemon3=new SuPokemonu(3, "Staryu", 1, 500, 150, 200, 3);
//		ArrayList<Pokemon> pokemon=new ArrayList<>();
//		pokemon.add(pokemon1);
//		ArrayList<Pokemon> pokemon4=new ArrayList<>();
//		pokemon4.add(pokemon2);
//		ArrayList<Pokemon> pokemon5=new ArrayList<>();
//		pokemon5.add(pokemon3);
//		
//		Random random=new Random();
//		int sayi=random.nextInt(0,3);
//		if (sayi==0) {
//			kullanici.setPokemonlar(pokemon);
//		}else if(sayi==1) {
//			kullanici.setPokemonlar(pokemon4);
//		}else if(sayi==2) {
//			kullanici.setPokemonlar(pokemon5);
//		}
//	}
	
	public static void main(String[] args) {
		//2, "charizard", "Ates", 3, 500, 350
		Pokemon pokemon1=new ElektrikPokemonu(4, "Raichu", 2, 1000, 350, 500);
		Pokemon pokemon2=new AtesPokemonu(2, "charizard", 3, 5000, 350, 500);
		Pokemon pokemon3=new SuPokemonu(3, "Staryu", 1, 500, 150, 200, 3);
		Kullanici kullanici=new Kullanici("Mustafa");
		
		
		ArrayList<Pokemon> bosPokemons=new ArrayList<>();
		bosPokemons.add(pokemon3);
		bosPokemons.add(pokemon2);
		bosPokemons.add(pokemon1);
		
		
		pokemonYakala(bosPokemons, kullanici);
		
		
		
		
		for (int i = 0; i < bosPokemons.size(); i++) {
			System.out.println(bosPokemons.get(i));//[i] yerine artik get(i) kullaniyoruz.
		}
		
//		
//		Pokemon secilmisPokemon= pokemonYakala(bosPokemons,kullanici);
//		System.out.println(secilmisPokemon);
//		saldir(secilmisPokemon);//surekli degisiyor.
		
		
		ElektrikPokemonu elek1=new ElektrikPokemonu(3, "abc", 2, 1000, 350, 500);
		
		saldir(pokemon1);
		saldir(pokemon2);
		saldir2(pokemon1);
		
		
		saldir(elek1); // illa Pokemon sinifindan cagirmana gerek yok direk elektrikden uretip de pokemn sinifi gibi cagirabilirsin.
	
		
		
	}
	
	public static void saldir(Pokemon pokemon) { //tek tek hepsini yazacagina icine pokemon alan metod yazarsin ve hepsini kapsar
		pokemon.saldir();
	}
	public static void saldir2(Pokemon pokemon) {// eger polimorfizm diye bir sey olmasaydi bunlari tek tek yapmak zorunda kalacaktin.
		
		if(pokemon instanceof ElektrikPokemonu) {
			System.out.println(pokemon.getAd()+" adli pokemo elektrik saldirisi yapiyor");
		}else if(pokemon instanceof SuPokemonu) {
			System.out.println(pokemon.getAd()+" adli pokemon Su saldirisi yapiyor");
		}else {
			System.out.println(pokemon.getAd()+" adli pokemon su saldirisi yapiyor");
		}
	}
}
