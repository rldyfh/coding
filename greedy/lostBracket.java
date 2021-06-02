package greedy;

import java.util.*;


public class lostBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		String str = sc.nextLine();
		
		String[] splitMiuns = str.split("-");
		
		for(int i= 0 ; i < splitMiuns.length ; i++) {
			String[] tmp = splitMiuns[i].split("\\+");
			for(int j = 0 ; j < tmp.length ; j++) {
				list.add(Integer.parseInt(tmp[j]));
			}
		}
		
		int result = list.get(0);
		for(int i = 1 ; i < list.size(); i++) {
			result -= list.get(i);
		}
		
		System.out.println(result);

	}

}
