package level_02;

import java.util.*;

class largestNumber {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];        
        
        for(int i = 0 ; i < numbers.length ; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String str1, String str2){
                if(Integer.parseInt(str1+str2) > Integer.parseInt(str2+str1)) return -1;
                else if(Integer.parseInt(str1 + str2) == Integer.parseInt(str2+str1)) return 0;
                else return 1;
            }
        });
        
        if(arr[0].equals("0")){
            return "0";
        }
        
        for(String str : arr){
            answer += str;
        }

        return answer;
    }
}