package baseball.domain;

import java.util.List;

public class Referee {

    public String compare(List<Integer> computer, List<Integer> player) {
        // TODO ball하고 strike의 개념은 같은 숫자를 찾는다에 있어서 겹치는 개념이고,
        // TODO 위치에 따라 달라지는 것이 차이점이다.
        // TODO ex) [2, 3, 4] [2, 8, 9] [8, 2, 9] -> 각각 1스라이크, 1볼
        // 몇개의 숫자가 같은지 알아 낸 뒤
        // 스트라이크의 개수를 구해 뺀다.
        // 남은 수는 볼의 개수이다.
        
        // Judgement와 협력한다.
        Judgement judgement = new Judgement();
        int correctCount = judgement.correctCount(computer, player);

        int strike = 0;
        for (int placeIndex = 0; placeIndex < player.size(); placeIndex++) {
                if(judgement.hasPlace(computer, placeIndex, player.get(placeIndex))){
                    strike++;
            }
        }
        int ball = correctCount - strike;
        if(correctCount == 0){
            return "아웃";
        }
        return ball + " 볼 " + strike + " 스트라이크 ";
    }
}
