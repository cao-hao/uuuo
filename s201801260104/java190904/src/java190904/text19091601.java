package java190904;

import java.util.Scanner;

public class text19091601 {

	public static void mian(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		while (!"Quit".equalsIgnoreCase(str)) {
		int score = scanner.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("ÊäÈë´íÎó");
			}else {
				if (score >= 90) {
					System.out .println("A");
				} else if (score >= 80) {
					System.out.println("B");
				} else if (score >= 70) {
					System.out.println("C");
				} else if (score >= 60) {
					System.out.println("D");
				}
				
			}
		
		scanner.close();
	}
	
}
