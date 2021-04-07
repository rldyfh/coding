package level_01;

import java.util.*;

public class descending {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		
		char[] c = new char[str.length()];
		
		for(int i =0 ; i < str.length() ; i ++) {
			c[i] = str.charAt(i);
		}
		String s ="";
		Arrays.sort(c);
		for(int i = c.length-1 ; i >= 0 ; i--) {
			s += c[i];
		}
		System.out.print(s);

	}

}


