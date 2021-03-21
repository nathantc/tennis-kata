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
        if (playerOne.getScore() == 0 && playerTwo.getScore() == 0)
            return "love";

        if(playerOne.getScore() == 1 && playerTwo.getScore() == 1)
            return "fifteen all";

        if(playerOne.getScore() == 2 && playerTwo.getScore() == 2)
            return "thirty all";

        if (playerOne.getScore() == 3 && playerTwo.getScore() == 3)
            return "deuce";

        if (playerTwo.getScore() >= 4)
            return "Player Two set point";

        if (playerOne.getScore() >= 4 && playerTwo.getScore() <= 1)
            return "Player One Wins set point";

        return "love, " + formatScore(playerTwo);
    }

    private String formatScore(Player player) {
        switch (player.getScore()) {
            case 0: return "";
            case 1: return "fifteen";
            case 2: return "thirty";
            default:
                return "forty";
        }
    }
}
