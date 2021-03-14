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
        if (player.getScore() == 30) {
            player.setScore(40);
        } else {
            player.setScore(player.getScore() + 15);
        }

    }

    public String getScore() {
        if (playerOne.getScore() == 0 && playerTwo.getScore() == 0)
            return "love";

        if (playerOne.getScore() == 15 || playerTwo.getScore() == 15)
            return "love, fifteen";

        return "love, thirty";
    }
}
