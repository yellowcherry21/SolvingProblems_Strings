//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

package by.module3.string.t05;

import java.util.Scanner;

public class T05_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String q = scn.nextLine();
		
		int count = 0;
		
		for(int i = 0; i< q.length();i++) {
			if(q.charAt(i) == 'а' || q.charAt(i) =='a') {//русское и английское 'а'
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
