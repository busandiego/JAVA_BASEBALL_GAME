package baseball;

import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
  1. 기능을 가지고 있는 클래스를 인스턴스화(=객체)한다.
  2. 필요한 기능을 각 인스턴스가 수행하게 한다. (의인화)
  3. 각 결과를 합친다.
*/
public class Application {

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> numbers = numberGenerator.createRandomNumbers();
        System.out.println(numbers);

        Judgement judgement = new Judgement();
        int count = judgement.correctCount(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 1));
        System.out.println(count); // 1


    }
}
