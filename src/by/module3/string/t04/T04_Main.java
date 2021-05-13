//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”. (?)	

package by.module3.string.t04;

public class T04_Main {

	public static void main(String[] args) {
		String base = "Информатика";
		
		String q = "";
		
		q += base.charAt(7);
		q += base.charAt(3);
		q += base.charAt(4);
		q += base.charAt(7);
		
		System.out.println(q);
	}

}
