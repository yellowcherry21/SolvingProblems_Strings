// В строке найти количество цифр

package by.module3.chars.t03;

import java.util.Scanner;

public class T03_Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		
		char []digits = {'0','1','2','3','4','5','6','7','8','9'};
		char []arr = new char[str.length()];
		int k = 0;
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			for(int j = 0; j < digits.length;j++) {
				if(arr[i] == digits[j]) k++;
			}
		}
		
		
		System.out.println(k);
						
	}

}
