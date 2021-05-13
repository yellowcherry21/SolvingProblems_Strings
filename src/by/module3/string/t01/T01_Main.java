//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

package by.module3.string.t01;

import java.util.Scanner;

public class T01_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		String b = scn.nextLine();
		
		int amount = 0;
		int maxamo = 0;
		
		for (int i = 0; i < b.length(); i++) {
			if (Character.isWhitespace(b.charAt(i))) {
				amount++;
			}
			
			if (!Character.isWhitespace(b.charAt(i)) && amount > maxamo) {
				maxamo =amount;
				amount = 0;
			}
			
		}
		
		System.out.println(maxamo);
	}

}
