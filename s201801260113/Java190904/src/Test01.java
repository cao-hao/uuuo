import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 1;
		int b = ++a;
		
		System.out.println(a);
		System.out.println(b);
		
		scanner.close();
	}
}
