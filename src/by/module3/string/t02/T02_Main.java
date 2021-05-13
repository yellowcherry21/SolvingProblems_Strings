//В строке после каждого символа a вставить символ b

package by.module3.string.t02;

public class T02_Main {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();

		sb.append("afkjgnfgnfkjgnafjga");
		
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == 'a') {
				i++;
				sb.insert(i, "b");
			}
		}
		
		System.out.println(sb.toString());
	}

}
