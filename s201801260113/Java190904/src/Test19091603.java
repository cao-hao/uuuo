
public class Test19091603 {
	public static void main(String[] args) {
		System.out.println(fact(5));
		
	}
	/**
	 * ¼ÆËãnµÄ½×³Ë£¬µÝ¹é
	 */
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		return n * fact(n - 1);
	}
}
