package Java_Essential4;
import java.util.*;
class essential4_2 {
	private String name, tel;
	public essential4_2(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getNmae() {
		return name;
		}
	public String getTel() {
		return tel;
		}
public class PhoneManager{
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 >> ");
		int Persons = sc.nextInt();
		
		essential4_2 [] Array = new essential4_2[Persons];
		
		for(int i = 0; i < Persons; i++) {
				System.out.print("이름과 전화번호(번호는 연속적으로 입력) >>");
				Array[i] = new essential4_2(sc.next(), sc.next());
			}
		
		System.out.print("저장되었습니다.");
		
		label : while(true) {
				System.out.print("검색할 이름>>");
				String serchName = sc.next();
				
				for(int i = 0; i < Persons; i++) {
					if(serchName.equals("exit")) {
						break label;
					}
					else if(serchName.equals(Array[i].getNmae())) {
							System.out.println(Array[i].getNmae() + "의 번호는 " + Array[i].getTel() + "입니다.");
					}
					else if(!serchName.equals(Array[i].getNmae()) && i == (Persons - 1)) {
						System.out.println(serchName + "이(가)없습니다.");
					}
				}
			}
		}
	
}
