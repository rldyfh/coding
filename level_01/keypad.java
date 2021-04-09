package level_01;

import java.awt.Point;
public class keypad {

	public String solution(int[] numbers, String hand) {
        String answer = "";
        Point[] point = new Point[10];
        point[0] = new Point(3,1);
        point[1] = new Point(0,0);
        point[2] = new Point(0,1);
        point[3] = new Point(0,2);
        point[4] = new Point(1,0);
        point[5] = new Point(1,1);
        point[6] = new Point(1,2);
        point[7] = new Point(2,0);
        point[8] = new Point(2,1);
        point[9] = new Point(2,2);
        Point Lp = new Point(3,0);
        Point Rp = new Point(3,2);
        int i = 0;
        
         
        
        for(int number: numbers){
            if(number == 1 || number == 4 || number == 7){
                answer += "L";
                Lp = point[number];
            }
            else if(number == 3 || number == 6 || number == 9){
                answer += "R";
                Rp = point[number];
            }else{             
                double disR = Math.abs(Rp.x - point[number].x) + Math.abs(Rp.y - point[number].y);
                double disL = Math.abs(Lp.x - point[number].x) + Math.abs(Lp.y - point[number].y);
                if(disL > disR){
                    answer += "R";
                    Rp = point[number];
                }
                else if(disL < disR){
                    answer += "L";
                    Lp = point[number];
                }
                else{
                    if(hand.equals("right")){
                        answer += "R";
                        Rp = point[number];
                    }
                    else if(hand.equals("left")){
                        answer += "L";
                        Lp = point[number];
                    }
                }
            }
            
        }
       
        return answer;
    }
}
