//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
//Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".

package by.module3.string.t07;

import java.util.Scanner;

public class T07_Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		String s = scn.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		s = s.replaceAll("\\s+", "");
		
		System.out.println(s+"\n");
		
		sb.append(s.charAt(0));
		
		boolean flag = true;
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < sb.length(); j++) {
				if(s.charAt(i) == sb.charAt(j)) {
					flag = false;
					break;
				}
				flag = true;
			}
			
			if(flag)sb.append(s.charAt(i));
			
		}
		
		System.out.println(sb.toString());
		
	}

}
