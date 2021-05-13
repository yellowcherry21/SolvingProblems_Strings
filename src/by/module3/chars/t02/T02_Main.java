//Замените в строке все вхождения 'word' на 'letter'.

package by.module3.chars.t02;

import java.util.Scanner;

public class T02_Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		
		char []array = new char[str.length()];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i);
			System.out.print(array[i]+", ");
		}
		
		System.out.println("\nLength is: "+array.length);
		
		int k = 0;
		
		for(int i = 0; i < array.length-3; i++ ) {
			if(array[i] == 'w' && array[i+1] == 'o' && array[i+2] == 'r' &&array[i+3] == 'd') {
				k++; // кол-во word в строке
				
			}
			
		}
		
		System.out.println("\n_____________________________________________________________");
		
		char [] res = new char[array.length+2*k];
		int temp = 0;
		
		for(int i = 0; i < array.length; i++) {
			
						
			if(i < array.length-4) {
				if(array[i] == 'w' && array[i+1] == 'o' && array[i+2] == 'r' && array[i+3] == 'd') {
					
					res[i+temp] = 'l';
					res[i+1+temp] = 'e';
					res[i+2+temp] = 't';
					res[i+3+temp] = 't';
					res[i+4+temp] = 'e';
					res[i+5+temp] = 'r';
					
					temp += 2;
					i += 4;
				}

			}
			res[i+temp] = array[i];
		}
		
		if(array[array.length-4] == 'w'&& array[array.length-3] == 'o' && array[array.length-2] == 'r' && array[array.length-1] == 'd') {
			res[res.length-6] = 'l';
			res[res.length-5] = 'e';
			res[res.length-4] = 't';
			res[res.length-3] = 't';
			res[res.length-2] = 'e';
			res[res.length-1] = 'r';
		}
		
				
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
	}

}
