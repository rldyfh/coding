package level_02;

import java.util.*;

public class lifeBoat {

	public int solution(int[] people, int limit) {
        int answer = 0;
        int i =0;
        
        Arrays.sort(people);
        
        for(int j = people.length -1 ; i <= j ; j--){
            if(people[j] + people[i] > limit) answer++;
            else{
                answer++;
                i++;
            }
        }

        return answer;
    }
}
