package com.yash.collectionProgram.CollectionTask8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductionMain {
	public static void main(String[] args) {
		List<ProductionFacility> pfList=new ArrayList<>();
		String itemName1[]= {"Car","Bike"};
		ProductionFacility pf1_1=new ProductionFacility(101, "Tata", "Indore",200, itemName1,LocalDate.of(2020,10,11));
		ProductionFacility pf1_2=new ProductionFacility(101, "Tata", "Indore",400, itemName1,LocalDate.of(2020,10,12));
		ProductionFacility pf1_3=new ProductionFacility(101, "Tata", "Indore",500, itemName1,LocalDate.of(2020,10,13));
		ProductionFacility pf2_1=new ProductionFacility(102, "Infosys", "Indore",100, itemName1,LocalDate.of(2020,10,21));
		ProductionFacility pf2_2=new ProductionFacility(102, "Infosys", "Indore",300, itemName1,LocalDate.of(2020,10,22));
		ProductionFacility pf2_3=new ProductionFacility(102, "Infosys", "Indore",500, itemName1,LocalDate.of(2020,10,23));
		pfList.add(pf1_1);
		pfList.add(pf1_2);
		pfList.add(pf1_3);
		pfList.add(pf2_1);
		pfList.add(pf2_2);
		pfList.add(pf2_3);
		System.out.println(pfList);
		
		List<ProductionFacility> sortByDate=pfList.stream().sorted(Comparator.comparing(ProductionFacility::getProd_date)).collect(Collectors.toList());
		System.out.println("production detail of each facility on the basis of production date.");
		
		for(ProductionFacility p : sortByDate) {
			//System.out.println(p);
		}
		
		System.out.println("facility producing highest item. ");
	ProductionFacility maxItemProd=	pfList.stream().max(Comparator.comparing(ProductionFacility::getTotalproduction_perday)).get();
		System.out.println(maxItemProd);
	}
}
