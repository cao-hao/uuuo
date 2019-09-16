package java1909;

import java.util.Scanner;

public class Text19091601 {
	public static void main(String[] args) {
		System.out.println("请输入一个整数");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("输入错误");
		}else {
			if(score > 90) {
			System.out.println("A");
		}else if(score > 80) {
			System.out.println("B");
		}else if(score > 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		}
	scanner.close();
}
}
