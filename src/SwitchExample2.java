/*
 *  Switch 조건문
 */
public class SwitchExample2 {

	public static void main(String[] args) {
		int result = 100;
		switch (result/10) {
		case 10: 
		case 9: System.out.println("수");break;
		case 8: System.out.println("우");break;
		case 7: System.out.println("미");break;
		case 6: System.out.println("양");break;
		default:System.out.println("가");
			
		}
	}

}
