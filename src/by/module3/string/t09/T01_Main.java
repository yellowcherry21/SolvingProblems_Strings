//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

package by.module3.string.t09;

import java.util.Scanner;

public class T01_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		String q = s.nextLine();
		
		
		int lc = 0;
		int uc = 0;
		
		for(int i = 0; i < q.length();i++) {
			if(Character.isLowerCase(q.charAt(i))) lc++;
			if(Character.isUpperCase(q.charAt(i))) uc++;
		}
		
		System.out.println("Lower cases " + lc +"\nUpper cases "+uc );
	}

}
