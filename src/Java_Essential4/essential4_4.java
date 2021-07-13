package Java_Essential4;
import java.util.*;
class essential4_4 {
		private String name;
		public essential4_4(String name) {
				this.name = name;
		}
		public String getName() {
			return name;
	}
public class WordGameApp{
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임에 참가하는 인원은 몇명입니까?>>");
		int pNum = sc.nextInt();
		essential4_4 p[] = new essential4_4[pNum];
		
		for(int i = 0; i <pNum; i++) {
			System.out.print("참가자의 이름을 입력하세요 >> ");
			p[i] = new essential4_4(sc.next());
		}
		
		System.out.print("시작하는 단어는 '아버지' 입니다.");
		int i = 0;
		String word = "아버지";
		int lastIndex = word.length() - 1;
		char lastChar = word.charAt(lastIndex);
		char firstChar = word.charAt(0);
		while(true) {
				System.out.print(p[i].getName() + ">>");
				String nextword = sc.next();
				firstChar = nextword.charAt(0);
				if(lastChar != firstChar) {
					System.out.println(p[i].getName() + "이(가) 졌습니다.");
					return;
				}
				lastIndex = nextword.length() - 1;
				lastChar = nextword.charAt(lastIndex);
				i++;
				if(i > 2) {
						i = 0;
				}
		}

	}

	}

