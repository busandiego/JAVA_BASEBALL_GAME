package baseball.example;

import java.util.ArrayList;
import java.util.Scanner;

import static baseball.example.TestCalcul.checkNumber;

public class TestMain {

    ArrayList<Integer> inputNumbers = new ArrayList<>();


    public static void main(String[] args) {
        ArrayList<Integer> comNumbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        TestMain testMain = new TestMain();

        TestCom testCom = new TestCom();
        comNumbers = testCom.getComNumbers();



        System.out.println("============= 게임 시작 ==========");

        System.out.println("testMain.inputNumbers: " + testMain.inputNumbers);
        for (int i = 0; i < 3; i++) {
            int inputNumber = scanner.nextInt();
            testMain.inputNumbers.add(inputNumber);
        }



        System.out.println("testMain.inputNumbers: " + testMain.inputNumbers);
        checkNumber(testMain.inputNumbers, comNumbers);





        System.out.println("============ 게임 종료 ============");
        scanner.close();



    }
}
