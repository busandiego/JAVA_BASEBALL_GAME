package baseball.domain;

public class Calculator {

    public static int shareResult = 0; // 클래스 변수
    public int result = 0; // 인스턴스 변수
    
     public static final int SHARE_BIRTHDAY = 1004; // 상수 (클래스변수이면서 변하지 않는 값)

    public Calculator() {
    }

    public int add(int number1, int number2) { // 메서드 (인스턴스 메서드)

        result = number1 + number2;
        shareResult = result;
        return  result;
    }
}
