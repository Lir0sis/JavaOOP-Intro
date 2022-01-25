package it92.shenfeld.Lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Lab4 {
	public static void main(String[] args) {
		//c11 = 7 - sport
		
		SportItem[] itemsArray = new SportItem[3];
		itemsArray[0] = new SportItem("SportBag", "cotton", "Ukraine", "utility", 13.99f);
		itemsArray[1] = new SportItem("Jumping-rope", "nylon", "Germany", "fitness", 4.99f);
        itemsArray[2] = new SportItem("dumbbells", "crude iron", "Germany", "lifting", 22.99f);
        
        Arrays.sort(itemsArray, Comparator.comparing(SportItem::getPrice));
        System.out.println("Sorted : " + Arrays.toString(itemsArray));
        
        Arrays.sort(itemsArray, Comparator.comparing(SportItem::getCategory).reversed());
        System.out.println("Reverse sorted :" + Arrays.toString(itemsArray));
		
	}
}
