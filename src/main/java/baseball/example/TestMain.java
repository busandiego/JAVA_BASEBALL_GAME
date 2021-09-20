package baseball.example;

import java.util.ArrayList;
import java.util.Scanner;

import static baseball.example.TestCalcul.checkNumber;

public class TestMain {

    ArrayList<Integer> inputNumbers = new ArrayList<>();


    public static void main(String[] args) {


        int tryNum = 1;

        ArrayList<Integer> comNumbers;


        TestMain testMain = new TestMain();

        TestCom testCom = new TestCom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("게임을 하시겠습니까? y or yes");
        while (scanner.hasNext()) {
            if(scanner.next().equals("y") || scanner.next().equals("yes")){
                System.out.println("============= 게임 시작 ==========");
                comNumbers = testCom.getComNumbers();
            } else {
                System.out.println("======게임 완전 종료=====");
                scanner.close();
                return;
            }
            while (true) {
                System.out.println("comNumbers: " + comNumbers);

                for (int i = 0; i < 3; i++) {
                    // TODO 잘 안먹힘
                    System.out.println(i +1 + "번째 숫자를 입력하세요.");
                    int inputNumber = scanner.nextInt();
                    testMain.inputNumbers.add(inputNumber);
                }
                System.out.println("comNumbers: " + comNumbers);
                System.out.println("testMain.inputNumbers: " + testMain.inputNumbers);

                TestResult testResult = checkNumber(testMain.inputNumbers, comNumbers);

                System.out.println("시도: " + tryNum +
                        "\n스트라이크: " + testResult.getStrikeCount() +
                        "\n볼: " + testResult.getBallCount() +
                        "\n낫싱: " + testResult.getNothing()
                );

                if (testResult.getStrikeCount() == 3) {
                    System.out.println("========== 승리하셨습니다. ===========");
                    System.out.println("컴퓨터의 숫자: " + comNumbers);
                    System.out.println("============ 게임 종료 ============");
                    break;
                } else {
                    System.out.println("다시 시도하시겠습니까? 아무키나 눌러주세요, 종료는 q or quit");
                    // TODO 여기서 진행이 잘안됨
                }


                if (scanner.next().equals("q") || scanner.next().equals("quit")) {
                    System.out.println("============ 게임 종료 ============");
                    break;
                }

            }
        }
    }

}
