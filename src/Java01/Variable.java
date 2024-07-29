package Java01;

public class Variable {

	static final int BOX2 = 1; // 상수 선언

    public static void main(String[] args) {
        int box = 5; // 지역 변수 선언 및 초기화

        {
            int box3 = 7; // 블록 내에서만 유효한 지역 변수
            System.out.println("Inside block:");
            System.out.println("box: " + box);
            // BOX2 += 1; // 상수값은 변경 안됨
            System.out.println("BOX2: " + BOX2); // static 변수 접근
            System.out.println("box3: " + box3);
        }

        System.out.println("Outside block:");
        System.out.println("box: " + box);
        System.out.println("BOX2: " + BOX2); // static 변수 접근
        // System.out.println(box3); // box3는 블록 외부에서 접근 불가
    }
}