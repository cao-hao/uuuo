import java.util.Scanner;

/**
 * 获取用户通过键盘输入的一个整数。
 * 输出其代表的A、B、C、D等级。
 *A: >=90
 *B: <90 >=80
 *C: <80 >=70
 *D: <70
 *如果输入的数字小于0或大于100，则提示用户输入错误。
 *以上操作，重复执行，直到用户输入了Quit。
 */
public class Test19091601 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		while(!"Quit".equals(str)) {
		int score = Integer.parseInt(str);
		
		if (score > 100 || score < 0) {
			System.out.println("输入错误");}
		else {
			if (score >= 90) {
				System.out.println("A");}
			else  if (score >= 80) {
				System.out.println("B");}
			else  if (score >= 70) {
				System.out.println("C");}
			else {
				System.out.println("D");}
		
		}

		str = scanner.nextLine();
	scanner.close();
		}
	}
}
		
		
		


