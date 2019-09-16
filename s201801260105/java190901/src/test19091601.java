import java.util.Scanner;

public class test19091601 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
 		int a= scanner.nextInt();
 		
 		if(a>=0 && a<=100) {
 			if(a>=90) {
 				System.out.println("A");
 			}else if(a>=80) {
 				System.out.println("B");
 			}else if(a>=70) {
 				System.out.println("C");
 			}else{
 				System.out.println("D");
 			}
 		}else {
 			System.out.println("");
 		}
 		scanner.close();
	}
	

}
