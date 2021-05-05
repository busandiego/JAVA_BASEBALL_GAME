package baseball;

import baseball.domain.Calculator;

public class Application {


    public static void main(String[] args) {

        Calculator teacher = new Calculator();
        System.out.println(teacher.add(1, 3)); //4
        System.out.println(teacher.shareResult); // 4

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2000, 21)); // 2021
        System.out.println(calculator.shareResult); // 2021

        System.out.println(teacher.result); // 4
        System.out.println(teacher.shareResult); // 2021  -> 공유되는 값이다
        System.out.println(Calculator.shareResult); // 2021  -> 공유되는 값이다





    }
}
