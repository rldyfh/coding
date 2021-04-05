package level_01;


import java.util.*;

class ptv {
    public int[] solution(int[] numbers) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length-1 ; i++){
            for(int j=i+1; j< numbers.length ; j++){
                sum = numbers[i] + numbers[j];
                if(list.indexOf(sum) < 0){
                    list.add(sum);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i =0 ; i< list.size() ; i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}


public class pick_two_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
