//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.

package by.module3.chars.t05;


import java.util.ArrayList;
import java.util.Scanner;

public class T05_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		String s = scn.nextLine();
		
		ArrayList<Character> q1 = new ArrayList<Character>();
				
		for(int i = 0; i < s.length(); i++) {
			q1.add(s.charAt(i));
		}
				
		while(Character.isWhitespace(q1.get(0))) {
			q1.remove(0);
		}
		
		while(Character.isWhitespace(q1.get(q1.size()-1))) {
			q1.remove(q1.size()-1);
		}
		
		for(int i = 0; i < q1.size()-1; i++) {
			if(Character.isWhitespace(q1.get(i)) && Character.isWhitespace(q1.get(i+1))) {
				q1.remove(i);
				i--;
			}
		}
		
		for(int i = 0; i < q1.size(); i++) {
			System.out.print(q1.get(i));
		}
	}

}
