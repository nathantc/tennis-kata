package tennis;

import tennis.Player;

public class TennisGame {

    private Player playerOne;

    public TennisGame() {
        playerOne = new Player();
    }

    public Player getPlayerTwo() {
        return new Player();
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void scorePoint(Player player) {

        player.setScore(15);
    }
}
