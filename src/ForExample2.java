/*
 * 반복문 For
 */
public class ForExample2 {

	public static void main(String[] args) {
		int result = 0;
		for (int  index = 1; index <= 100; index++) {
			result += index;
		}
		System.out.println("result =" + result);
		
		int result1 = 0;
		for (int  index = 1; index <= 100; index++) {
			result1 += index;
		}
		System.out.print(result1);
		
		for (int i = 1; i<=10 ; i++) {
			for (int j = 1; j <= 10; j++) {
					System.out.print('♥');
			}
			System.out.println();
			
		}
	}
}
