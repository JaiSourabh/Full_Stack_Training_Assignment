package com.yash.StreamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ItemMain {
	public static void main(String[] args) {
		List<Item> list=new ArrayList<>();
		list.add(new Item(101, "Pen", LocalDate.of(2020,10,12),LocalDate.of(2021,9,11), 500));
		list.add(new Item(102, "Watch", LocalDate.of(2020,2,2),LocalDate.of(2021,2,1), 400));
		list.add(new Item(103, "Book", LocalDate.of(2020,5,10),LocalDate.of(2021,9,19), 500));
		list.add(new Item(104, "Water_Bottle", LocalDate.of(2021,5,11),null, 670));
		list.add(new Item(105, "Dress", LocalDate.of(2020,5,10),null, 900));
		
//		double totalPrice=0;
//		
//		for(Item i:list) {
//			totalPrice+=i.getPrice();
//		}
//		
//		double avgPrice=totalPrice/list.size();
//		System.out.println(avgPrice);
		
		DoubleSummaryStatistics averagePrice=list.stream().mapToDouble(a -> a.getPrice()).summaryStatistics();
		System.out.println(averagePrice.getAverage());
		
		Double average = list.stream().mapToDouble(val -> val.getPrice()).average().orElse(0.0);
		System.out.println(average);
		
		Optional<Item> maxPrice=list.stream().sorted(Comparator.comparingDouble(Item::getPrice).reversed()).findFirst();
		System.out.println(maxPrice);
		
		Optional<Item> minPrice=list.stream().sorted(Comparator.comparingDouble(Item::getPrice)).findFirst();
		System.out.println(minPrice);
		
		Optional<Item> maxPriceWithoutExpiry=list.stream().filter(d -> d.getDate_of_expiry()==null).sorted(Comparator.comparingDouble(Item::getPrice).reversed()).findFirst();
		System.out.println(maxPriceWithoutExpiry);

		List<Item> modified = list.stream().collect(Collectors.toCollection(()->new TreeSet<>(Comparator.comparing(Item::getPrice)))).stream().collect(Collectors.toList());
		System.out.println(modified);
		
					}
}
