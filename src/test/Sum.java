package test;

import java.util.Arrays;
import java.util.HashMap;

public class Sum {

	//Find two numbers in an array which sums the target number in array
	public static int[] TargetSum(int num[],int target) {
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<num.length;i++) {
			int extra= target- num[i];
			
			if(map.containsKey(extra)) {
				return new int[] { map.get(extra),i};
			}
			
			map.put(num[i], i);
			
		}
		
		return null;
		
		
		
	}

	public static void main(String[] args) {
       int arr[]= {2,4,5,6,7};
       int target=9;
       int result[]=TargetSum(arr,target);
       System.out.println(Arrays.toString(result));

	}

}
