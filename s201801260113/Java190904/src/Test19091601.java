import java.util.Scanner;

/**
 * ��ȡ�û�ͨ�����������һ��������
 * ���������A��B��C��D�ȼ���
 *A: >=90
 *B: <90 >=80
 *C: <80 >=70
 *D: <70
 *������������С��0�����100������ʾ�û��������
 *���ϲ������ظ�ִ�У�ֱ���û�������Quit��
 */
public class Test19091601 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		while(!"Quit".equals(str)) {
		int score = Integer.parseInt(str);
		
		if (score > 100 || score < 0) {
			System.out.println("�������");}
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
		
		
		


