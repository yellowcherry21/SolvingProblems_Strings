//В строке найти количество чисел

package by.module3.chars.t04;

import java.util.Scanner;

public class T04_Main {

	public static void main(String[] args) {
		while(true) {
			@SuppressWarnings("resource")
			Scanner scn = new Scanner(System.in);
			String str = scn.nextLine();

			char []digits = {'0','1','2','3','4','5','6','7','8','9'};
			char []arr = new char[str.length()];
			int k = 0;
			boolean []q = new boolean[str.length()];

			for(int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i);
			}

			for(int i = 0; i < str.length(); i++) {
				for(int j = 0; j < digits.length; j++) {
					if(arr[i] == digits[j]) {
						q[i] = true;
						break;
					}else {
						q[i] = false;
					}
				}			
			}


			for(int i = 0; i < q.length; i++) {
				if(q[i]) {
					while(i < q.length && q[i] == true ) {
						i += 1;
					}
					k += 1;
				}
			}
			System.out.println(k);

		}

	}
}
