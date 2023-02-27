package ss8_clean_code;

public class TennisGame {
    private int score1;
    private int score2;
    private String score;

    public static String getScore(String playerName1, String playerName2, int score1, int score2) {
        String score = "";
        if (score1 == score2) {
            switch (score1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }
        return score;
    }

    public String minusResult(int score1, int score2) {
        String score = "";
        if (score1 >= 4 || score2 >= 4) {
            int result = score1 - score2;
            if (result == 1) {
                score = "Advantage player1";
            } else if (result == -1) {
                score = "Advantage player2";
            } else if (result >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        }
        return score;
    }
}
