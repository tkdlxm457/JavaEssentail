package SortEx;

import java.util.Arrays;

public class sortinsertion {

	public static void main(String[] args) {
		 int a[] = {9,8,6,2,5};
	        for(int i = 1 ; i < a.length ; i++) {
	            for(int j = i-1 ; j >= 0 ; j--) {
	                if(a[j] <= a[j+1]) break;
	                int temp = a[j];
	                a[j] = a[j+1];
	                a[j+1] = temp;
	            }
	        }
	        System.out.println(Arrays.toString(a));

	}

}
