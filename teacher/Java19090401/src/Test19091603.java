
public class Test19091603 {

	public static void main(String[] args) {
		System.out.println(fact(5));
	}

	/**
	 * ����n�Ľ׳ˣ��ݹ�
	 * 
	 * @param n
	 * @return
	 */
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}

		return n * fact(n - 1);
	}

}
