/**
 * 
 */
package com.ali.algorithm.bubblesort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ali
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		int[] arr= {5,9,3,1,2,8,4,7,6};
		
		
		int n=arr.length;
		System.out.println("size :: "+n);
		int i=0;
		int j = 0;
		
			
			for (i = 0; i < n-1; i++)
	            for (j = 0; j < n-i-1; j++)
	            	System.out.println(i+"=="+j);
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
			
		
			for(int k:arr) {
				System.out.print(k+",");
			}
			
		
		
	}

}
