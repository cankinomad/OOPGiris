package com.berkOs.Hafta07.SansliNumaralar;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		SansliNumaralar sansliNumaralar=new SansliNumaralar();
		
		sansliNumaralar.mapOlustur();
		sansliNumaralar.map.entrySet().forEach(System.out::println);
		sansliNumaralar.listeOlustur();
		System.out.println(sansliNumaralar.list.size());
		
		sansliNumaralar.setOlustur();
		System.out.println("Sansli Numaralar");
		//sansliNumaralar.set.forEach(System.out::println);
		
		System.out.println("42DEN BUYUK SAYILAR=================");
		sansliNumaralar.set.stream().filter(p->p>42).forEach(System.out::println);
		
		System.out.println("TOPLAM SAYILAR");
		int toplam=sansliNumaralar.set.stream().reduce(0,(a,b)->a+b);
		System.out.println(toplam);
		Integer sum=sansliNumaralar.set.stream().mapToInt(Integer::intValue).sum();
		System.out.println("toplam "+sum);
		
		int Kirk2ustuToplam=sansliNumaralar.set.stream().filter(x->x>42).reduce(0,(a,b)->a+b);
		
		System.out.println("42 ustu toplam: "+Kirk2ustuToplam);
		
		double ort=sansliNumaralar.set.stream().filter(x->x>42).mapToInt(Integer::intValue).average().getAsDouble();
		
		System.out.println("ort===>"+ort);
		
		Double ort2=sansliNumaralar.set.stream().filter(x->x>42).collect(Collectors.averagingDouble(y->y));// veya averagingDouble(Integer::intValue)
		
		System.out.println("ort2--->"+ort2);
		
		Optional<Integer> max=sansliNumaralar.set.stream().reduce(Integer::max);
		
		Optional<Integer> max2=sansliNumaralar.set.stream().max(Integer::compareTo);
		Optional<Integer> max4=sansliNumaralar.set.stream().max(Comparator.naturalOrder());
		
		Integer max3=sansliNumaralar.set.stream().mapToInt(Integer::intValue).max().getAsInt();
		
		
		System.out.println("max: "+max);
		System.out.println("max2: " +max2);
		System.out.println("max3: "+max3);
		System.out.println("Max4: "+max4);
		
		
		Optional<Integer> min=sansliNumaralar.set.stream().min(Integer::compareTo);
		
		System.out.println("Min: "+min);
		
		long size=sansliNumaralar.set.stream().filter(x->x>50).count();
		
		System.out.println("count--> "+size);
		
		String sayilar=sansliNumaralar.set.toString();
		System.out.println(sayilar);
		
		List<String> numbers=sansliNumaralar.set.stream().map(String::valueOf).collect(Collectors.toList());
		
		String value=numbers.stream().collect(Collectors.joining(","));
		System.out.println(value);
		
		Collections.shuffle(sansliNumaralar.list);
		
		List<Integer> list=sansliNumaralar.list.stream().skip(250).limit(20).collect(Collectors.toList());
		System.out.println(list);
		
		Boolean kontrol=list.stream().anyMatch(x->x==50);
		System.out.println(kontrol);
		Boolean kontrol2=list.stream().allMatch(x->x>10);
		System.out.println(kontrol2);
	}
}
