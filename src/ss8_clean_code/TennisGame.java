package ss8_clean_code;

public class TennisGame {
    static String score = "";
    static int tempScore = 0;

    public void getScore(String playerName1, String playerName2, int score1, int score2) {
        if (score1 == score2) {
            displayScore(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            compareResult(score1, score2);
        } else {
            tempResult(score1, score2);
        }
    }

    public static void displayScore(int score) {
        String share = "All";
        switch (score) {
            case 0:
                score = Integer.parseInt("Love" + share);
                break;
            case 1:
                score = Integer.parseInt("Fifteen" + share);
                break;
            case 2:
                score = Integer.parseInt("Thirty" + share);
                break;
            case 3:
                score = Integer.parseInt("Forty" + share);
                break;
            default:
                score = Integer.parseInt("Deuce");
                break;
        }
    }
    public void compareResult(int score1, int score2) {
        int minusResult = score1 - score2;
        if (minusResult == 1) {
            score = ("Advantage player1");
        } else if (minusResult == -1) {
            score = ("Advantage player2");
        } else if (minusResult >= 2) {
            score = ("Win for player1");
        } else {
            score = ("Win for player2");
        }
    }
    public void tempResult(int score1, int score2) {
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = score1;
            } else {
                score = "-";
                tempScore = score2;
            }
            switch (tempScore) {
                case 0:
                    score = "Love";
                    break;
                case 1:
                    score = "Fifteen";
                    break;
                case 2:
                    score = "Thirty";
                    break;
                case 3:
                    score = "Forty";
                    break;
            }
        }
    }
}

