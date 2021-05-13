//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

package by.module3.chars.t01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class T01_Main {

	public static void main(String[] args) {
		
		char []upper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
				'А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ь','Ы','Ъ','Э','Ю','Я'};
		
		char []lower = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
				'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ь','ы','ъ','э','ю','я'};
		
		String str = "";
		Character [] arr;
		int k = 0;
		
		try(BufferedReader r = new BufferedReader(new FileReader("src/by/module3/chars/text.txt"))) {
			
		  str = r.readLine();	  
		  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		arr = new Character[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			System.out.print(arr[i]);
		}
		
		System.out.println("\n________________________________________\n");
		
		
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < upper.length; j ++) {
				if(arr[i]==upper[j]) {
					k++;  //Количество заглавных букв, перед каждой ставим '_' и делаем букву строчной			
				}
			}
		}
		
		char []res = new char[arr.length + k];
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < upper.length; j ++) {
				
				if(arr[i] == upper[j]) {
					
					res[i+temp] = '_';
					temp++;
					arr[i] = lower[j];
					
				}
			}
			res[i+temp] = arr[i];
		}
		
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
		
		
	}

}
