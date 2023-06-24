package one.org;

import java.util.Arrays;

public class Word_reversal {
	public static void arraysort() {
	int[]	arr= new int[] {1,2,-1,-3,4,-2};
		for(int i=0;i<arr.length;i++)
		{
//			System.out.print(arr[i]+" ");
			
		}
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		arraysort();
	}
}
