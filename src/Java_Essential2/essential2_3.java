package Java_Essential2;
import java.util.Scanner;
public class essential2_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		
		int num = scanner.nextInt();
		int first = num / 10;
		int  second = num % 10;
		switch(first) {
		case 3: case 6: case 9:
			if(second == 3 || second == 6 || second == 9)
			System.out.println("박수 짝짝");
			else System.out.println("박수 짝");
			break;
		default:
			if(second == 3 || second == 6 || second == 9)
			System.out.println("박수 짝");
			else System.out.println("박수 없음");
			break;
		}
		scanner.close();
	}

}
