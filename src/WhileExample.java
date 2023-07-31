/*
 * 반복문 While문
 */
public class WhileExample {

	public static void main(String[] args) {
		int index = 0;
		while (index < 100) {
			System.out.println("BTS 손흥민 봉준호 LET'S  Go");
			index++;
		}
		
		int result = 0;
		index = 1;
		while (index <= 100) {
//			result = result + index;
			result += index;
			index++;
			
		}
		System.out.println("누적합 =" + result);
	
//짝수 합, 홀수 합
		int result1 = 0, oddSum = 0, evenSum = 0; 
		index = 1;
		while (index <= 100) {
			result1 += index;
			if(index %2 ==0) {
				evenSum += index;
				
			}else {
				oddSum += index;
				
			}
			index++;
			
		}
		System.out.println("누적합 =" + result1);
		System.out.println("홀수합 =" + oddSum);
		System.out.println("짝수합 =" + evenSum);
	
		
		index = 0;
		do {
			System.out.println("풀스택 웹 개발자과정 화이팅!!!");
			index++;
		} while (index < 100);
		
	
	
		
	}

	
}
