import java.util.Scanner;

public class Text19091601 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
	while(!"Quit".equalsIgnoreCase(str)) {
		int a= Integer.parseInt(str);
		if(a>=0 && a<=100) {
			if(a>=90) {
				System.out.println("A��");
			}else if(a>=80) {
				System.out.println("B��");
			}else if(a>=70) {
				System.out.println("C��");
			}else{
				System.out.println("D��");
			}
		}else {
			System.out.println("�������");
		}
		str = scanner.nextLine();
	}
	scanner.close();
}
}
