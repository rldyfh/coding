package greedy;

import java.util.*;


public class gas {
	public static void main(String[] args) {
		int N = 0;
		int[] cost;
		int[] distance;
		int total = 0;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		distance = new int[N-1];
		cost = new int[N];
		
		for(int i = 0 ; i < N-1 ; i++) {
			distance[i] = sc.nextInt();
		}
		for(int i = 0 ; i < N ; i++) {
			cost[i] = sc.nextInt();
		}

		
		min = cost[0];
		for(int i = 0 ; i < N -1 ; i++) {
			if(min > cost[i]) min = cost[i];
			
			total = total + min*distance[i];
		}
		
		System.out.println(total);
	}

}
