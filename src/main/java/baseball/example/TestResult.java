package baseball.example;

public class TestResult {

    private int strikeCount = 0;
    private int ballCount = 0;
    private boolean nothing = false;

    public int getStrikeCount() {
        return strikeCount;
    }

    public void setStrikeCount(int strikeCount) {
        this.strikeCount = strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void setBallCount(int ballCount) {
        this.ballCount = ballCount;
    }

    public boolean isNothing() {
        return nothing;
    }

    public void setNothing(boolean nothing) {
        this.nothing = nothing;
    }
}
