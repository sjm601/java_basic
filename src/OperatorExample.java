/*
 *  자바에서 지원하는 연산자들
 */
public class OperatorExample {

	public static void main(String[] args) {
		int x = 30, y = 5;
		
//		산술연산자
		System.out.println("합 =" + (x+y));
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y); //나머지 연산자..

//		+ 연산자 오버로딩 (중복정의)
		System.out.println(10 + 50);
		
		System.out.println("박상훈"+"신");
		System.out.println( 10 + 30 +"신");
		System.out.println("신" + (10 + 30)); // 소괄호 들어가면 우선 연산
//		숫자 + 문자는 숫자가 형 변환 후 결합
//		좌측부터 우선 연산
		
//		복합대입연산자(+=, -=, *=, /=, %=)
//		x = x+5;
		x += 5;
		x -= 5;
		x *= 5;

		System.out.println(x);
		
		x = 1000;
		y = 4;
//		비교연산자(==, !=, >, >=,....)
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x >= y);
		
//		증감연산자 (++, --);
//		x = x +1;
//		x+= 1;
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		++x;
		System.out.println(x);
		
		x = 10;
//		System.out.println(x++);
		System.out.println(++x);
		
//		논리연산자 (&&(and), ||, !)
		
		x = 30;
		y = 50;
		
		System.out.println(x >= 30 && y <=50);
		System.out.println(x < 30 && y <=50);
		System.out.println(x < 30 || y <=50);
		System.out.println(!true);

//		조건삼항연산자
		int score =55;
		String result = score >= 60 ? "통과" : "실패" ;
		System.out.println(result);
		
		
//		기본데이터타입 형변화
//		자동형변환(Promotion - Up Casting
		double some= 50;
		
//		강제형변환(Demotion - Down casting)
		double avg = 85.34567;
		System.out.println(avg);
		System.out.println((int)avg);
		
		int avg2 = (int)avg;
		System.out.println(avg2);
		
	}

}
