package Java_Essential3;

import java.util.Scanner;

public class essential3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
		try {
			int a = scanner.nextInt();
			
			if(a%2 == 0) {
				System.out.print("짝수");
			}
			else {
				System.out.print("홀수");
			}
			
		}
		catch(Exception e) {
			System.out.print("정수를 입력하세요");
		}
		
		scanner.close();

	}


}
