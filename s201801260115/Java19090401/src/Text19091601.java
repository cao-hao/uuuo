import java.util.Scanner;

public class Text19091601 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a= scanner.nextInt();
	
	if(a>=0 && a<=100) {
		if(a>=90) {
			System.out.println("A级");
		}else if(a>=80) {
			System.out.println("B级");
		}else if(a>=70) {
			System.out.println("C级");
		}else{
			System.out.println("D级");
		}
	}else {
		System.out.println("输入错误");
	}
	scanner.close();
}
}
