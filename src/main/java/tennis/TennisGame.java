package tennis;

import tennis.Player;

public class TennisGame {

    private Player playerOne;
    private Player playerTwo;

    public TennisGame() {
        playerOne = new Player();
        playerTwo = new Player();
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void scorePoint(Player player) {
        player.setScore(player.getScore() + 1);
    }

    public String getScore() {

        int playerOneScore= playerOne.getScore();
        int playerTwoScore= playerTwo.getScore();

        if(playerOneScore == playerTwoScore) {
            return getTieGameScore();
        }
        if(playerOneScore >= 4 || playerTwoScore >=4) {
            return getAdvantageScore(playerOneScore, playerTwoScore);
        }
        return formatScore(playerOne) + ", " + formatScore(playerTwo);
    }

    private String getAdvantageScore(int playerOneScore, int playerTwoScore) {
        if (playerTwo.getScore() - playerOne.getScore() >= 2)
            return "Player Two set point";

        if (playerOne.getScore() - playerTwo.getScore() >= 2)
            return "Player One set point";

        if (playerOneScore - playerTwoScore == 1)
            return "Player One advantage";
        return "Player Two advantage";

    }

    private String getTieGameScore() {
        if (playerOne.getScore() == 0 && playerTwo.getScore() == 0)
            return "love";
        if (playerOne.getScore() >= 3 && playerTwo.getScore() >= 3)
            return "deuce";

        if (playerOne.getScore() == playerTwo.getScore())
            return formatScore(playerOne) + " all";
        return null;
    }

    public String isAdvantage(int playerOneScore, int playerTwoScore) {

        return null;
    }

    private String getAdvantageMessage(){
        return "Player One advantage";
    }

    private String formatScore(Player player) {
        switch (player.getScore()) {
            case 0: return "love";
            case 1: return "fifteen";
            case 2: return "thirty";
            default:
                return "forty";
        }
    }
}
