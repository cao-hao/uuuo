import java.util.Scanner;

public class Teat19091601 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		while (!"Quit".equalsIgnoreCase(str)) {
		int score = Integer.parseInt(str);
		
		if (score > 100 || score < 0) {
			System.out.println("ÊäÈë´íÎó");
		} else {
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			}else if (score >= 70) {
				System.out.println("C");
			} else {
				System.out.println("D");
			}
		}
		
		str = scanner.nextLine();
	}

}
