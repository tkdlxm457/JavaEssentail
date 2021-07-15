package SortEx;
import java.util.*;
class sortselection {

	public static void main(String[] args) {
		int mini = 0;
		int index = 0;
		int tmp = 0;
		int [] a = {9, 8, 5, 2, 6};
		for(int i = 0; i < 4; i++) {
			mini = a[i];

			for(int j = 1; j < 5; j++) {
				if(a[j] < mini) {
					mini = a[j];
					index = j;
				}
			}
			 tmp = a[i];
	         a[i] = mini;
	         a[index] = tmp;

		}
		System.out.println(Arrays.toString(a));
	}

}
