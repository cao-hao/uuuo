import java.util.Scanner;

/**
 * ����û�ͨ�����������һ��������
 * ���������A,B,C,D�ȼ���
 * A: >=90
 * B: <90 >=80
 * C: <80 >=70
 * D: <70
 * ������������С��0�����100������ʾ�û��������
 * @author ʩ��
 *
 */
public class Test19091601 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int score =scanner.nextInt();
		
		if(score>100 || score <0) {
			System.out.println("�������A");
			
		}else if(score>=90  ) {
			System.out.println("A");
			
		}else if(score>=80  ) {
			System.out.println("B");
			
		}else if(score>=70  ) {
			System.out.println("C");
			
		}else {
			System.out.println("D");
			
		}
		scanner.close();
		}
}


		
	


