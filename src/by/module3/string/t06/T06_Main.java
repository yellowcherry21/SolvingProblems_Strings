//Из заданной строки получить новую, повторив каждый символ дважды.

package by.module3.string.t06;

import java.util.Scanner;

public class T06_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		String q =s.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		q = q.replaceAll("\\s+", " ");
		
		for(int i = 0; i < q.length();i++) {
			if(!Character.isWhitespace(q.charAt(i))){
				sb.append(q.charAt(i));
				sb.append(q.charAt(i));
			}else {
				sb.append(" ");
			}
		}
		
		System.out.print(sb.toString());
		
	}

}
