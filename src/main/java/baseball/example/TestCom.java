package baseball.example;

import java.util.ArrayList;

public class TestCom {

    public ArrayList<Integer> getComNumbers() {


        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(
                (int)
                        ((Math.random() * 100) % 9)
                        + 1

        );

        lists.add(
                (int)
                        ((Math.random() * 100) % 9)
                        + 1

        );

        lists.add(
                (int)
                        ((Math.random() * 100) % 9)
                        + 1
        );


        return lists;
    }

    public static void main(String[] args) {
        TestCom testCom = new TestCom();
        System.out.println(testCom.getComNumbers());
    }

}
