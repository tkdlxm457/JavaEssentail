package Java_Essential3;

import java.util.*;

class essential3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            int k = r.nextInt(100);
            int min = 0, max = 99;
            System.out.println("수를 결정하였습니다. 맞추어 보세요");

            for (int i = 0;; i++) {
                System.out.printf("%d - %d\n", min, max);
                System.out.print(i + 1 + ">>");
                int num = scanner.nextInt();
                if (num > k) {
                    System.out.println("더 낮게");
                    max = num;
                } else if (num < k) {
                    System.out.println("더 높게");
                    min = num;
                } else if (num == k) {
                    System.out.println("맞았습니다.");
                    System.out.print("다시하시겠습니까(y/n)>>");
                    char select = scanner.next().charAt(0);
                    if (select == 'y')
                        break;
                    else if (select == 'n')
                        return;
                    else
                        System.out.println("잘못입력하셨습니다.");
                }
            }
        }
	}
}
