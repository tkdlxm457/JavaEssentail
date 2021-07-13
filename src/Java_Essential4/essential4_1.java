package Java_Essential4;
import java.util.*;
class essential4_1 {
	private String name, tel;
	public essential4_1(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getNmae() {
		return name;
		}
	public String getTel() {
		return tel;
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름과 번호 입력>>");
		essential4_1 first = new essential4_1(scanner.next(), scanner.next());
		System.out.print("이름과 번호 입력>>");
		essential4_1 second = new essential4_1(scanner.next(), scanner.next());
		
		System.out.println(first.getNmae() + "의 번호" + first.getTel());
		System.out.println(second.getNmae() + "의 번호" + second.getTel());
	}

}
