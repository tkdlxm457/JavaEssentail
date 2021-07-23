package Java_Essential5;
import java.util.*;

abstract class Calculator{
	protected int a, b;
	abstract protected int calc();
	protected void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>>");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("���� ����" + res);
	}
}

class Adder extends Calculator{
		public int calc() {
				return a + b;
		}
}

class Subtracter extends Calculator{
	public int calc() {
			return a - b;
	}
}

public class App {

	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();

	}

}
