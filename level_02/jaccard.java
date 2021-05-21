package level_02;

import java.util.*;

class jaccard {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        ArrayList<String> str1List = new ArrayList<>();
        ArrayList<String> str2List = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        
        for(int i = 0 ; i < str1.length()-1 ; i++){
            String tmp = str1.substring(i, i+2);
            char ch1 = tmp.charAt(0);
            char ch2 = tmp.charAt(1);
            if(('a'<=ch1 && ch1 <='z'|| 'A'<=ch1 && ch1 <='Z') && ('a'<=ch2 && ch2 <='z'|| 'A'<=ch2 && ch2 <='Z' )){
                tmp = tmp.toUpperCase();
                str1List.add(tmp);
            }
        }
        for(int i = 0 ; i < str2.length()-1 ; i++){
            String tmp = str2.substring(i, i+2);
            char ch1 = tmp.charAt(0);
            char ch2 = tmp.charAt(1);
            if(('a'<=ch1 && ch1 <='z'|| 'A'<=ch1 && ch1 <='Z') && ('a'<=ch2 && ch2 <='z'|| 'A'<=ch2 && ch2 <='Z')){
                tmp = tmp.toUpperCase();
                str2List.add(tmp);
            }
        }
        
        for(String s : str1List){
            if(str2List.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }
        for(String s : str2List){
            union.add(s);
        }
        
        double jaccard = 0.0;
        if(union.size() == 0)  jaccard = 1;
        else {
            jaccard = ((double)intersection.size() / (double)union.size());
        }
   
        return (int)(jaccard * 65536);
    }
}