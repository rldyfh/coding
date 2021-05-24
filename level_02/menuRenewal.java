package level_02;

import java.util.*;


public class menuRenewal {
	
	static ArrayList<HashMap<String, Integer>> FoodList = new ArrayList<>();
	static int[] maxCnt = new int[11];
		
	void comb(char[] arr, int pos, StringBuilder str) {
		if(pos >= arr.length) {
			int len = str.length();
			if(len >= 2) {
				int cnt = FoodList.get(len).getOrDefault(str.toString(), 0) + 1;
				FoodList.get(len).put(str.toString(), cnt);
				maxCnt[len] = Math.max(maxCnt[len], cnt);
			}
			return;
		}
		comb(arr, pos+1, str.append(arr[pos]));
		str.setLength(str.length()-1);
		comb(arr, pos+1, str);
	}
	
	
	public String[] solution(String[] orders, int[] course) {
			
		for(int i = 1 ; i < 11 ; i++) {
			FoodList.add(new HashMap<String, Integer>());
		}
		
		for(String str : orders) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			comb(arr, 0, new StringBuilder());
		}
		
		ArrayList<String> list = new ArrayList<>();
		for(int len : course) {
			for(Map.Entry<String, Integer> entry : FoodList.get(len).entrySet()){
				if(entry.getValue() >= 2 && entry.getValue() == maxCnt[len]) {
					list.add(entry.getKey());
				}
			}
		}
		Collections.sort(list);
		String[] answer = new String[list.size()];
		for(int i = 0 ; i < list.size() ; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}	
	
	public static void main(String[] args) {
		
		

	}

}
