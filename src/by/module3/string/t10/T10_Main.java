//Строка X состоит из нескольких предложений, каждое из которых кончается точкой, 
//восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.

package by.module3.string.t10;

import java.util.Scanner;

public class T10_Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		int num = 0;
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i)=='.' || str.charAt(i)=='!' ||str.charAt(i)=='?')num++;
		}
		
		System.out.println(num);
	}

}
