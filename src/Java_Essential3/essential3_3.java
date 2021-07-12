package Java_Essential3;
import java.util.Scanner;

public class essential3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] a = new int [10];
		int temp = 0;
		
		System.out.print("정수 10개를 입력하세요>>");
		
		for(int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length-i-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
	}


}
