//Вводится строка слов, разделенных пробелами.
//Hайти самое длинное слово и вывести его на экран.
//Случай, когда самых длинных слов может быть несколько, не обрабатывать.

package by.module3.string.t08;

import java.util.Scanner;

public class T08_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		String q = s.nextLine();
		
		String [] stings = q.split("\\s+");
		
		int maximal = stings[0].length();
		int index = 0;
		
		for(int i = 0; i<stings.length;i++) {
			if(maximal < stings[i].length()) {
				maximal = stings[i].length();
				index = i;
			}
		}
		
		System.out.println(stings[index]);
	}

}
