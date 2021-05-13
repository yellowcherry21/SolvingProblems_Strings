//Проверить, является ли заданное слово палиндромом.

package by.module3.string.t03;

import java.util.Scanner;

public class T03_Main {

	public static void main(String[] args) {
		boolean q = true;
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				q = false;
				break;
			}
		}
		
		System.out.println(q);

	}

}
