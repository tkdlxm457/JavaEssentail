package Java_Essential2;
import java.util.Scanner;
public class essential2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학점은 입력하세요>>");
		String grade = scanner.next();
		
		switch(grade){
			case "A":case"B":
				System.out.println("Excellent");
				break;
			case "C":case"D":
				System.out.println("Good");
				break;
			case "F":
				System.out.println("Bye");
				break;
		}
		scanner.close();

	}

}
