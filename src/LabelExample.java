/*
 * Label
 */
public class LabelExample {

    public static void main(String[] args) {
        // 레이블 선언, 레이블명은 모두 대문자로 사용.
        OUT:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i + "," + j + "\t");
                if (j == 5) {
                    break OUT;
                }
            }
        }
    }

}
