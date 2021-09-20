package baseball.example;

import java.util.ArrayList;

public class TestCalcul {

   /* private int strikeCount;
    private int ballCount;*/

    public static TestResult checkNumber(ArrayList<Integer> inputNumbers, ArrayList<Integer> comNumbers) {

        int strikeCount = 0;
        int ballCount = 0;
        boolean nothing = false;
        for (int i = 0; i < inputNumbers.size(); i++) {

            if (inputNumbers.get(i).intValue() == comNumbers.get(i).intValue()) {
                strikeCount++;
            } else {
                for (int j = 0; j < comNumbers.size(); j++) {
                    if (inputNumbers.get(i).intValue() == comNumbers.get(j).intValue()) {
                        ballCount++;
                    }
                }
            }
        }

        if (strikeCount == 0 && ballCount == 0) {
            nothing = true;
        }

        TestResult testResult = new TestResult();
        testResult.setStrikeCount(strikeCount);
        testResult.setBallCount(ballCount);
        if(nothing){
            testResult.setNothing("아웃");
        } else {
            testResult.setNothing(" ");
        }


        return testResult;
    }
}