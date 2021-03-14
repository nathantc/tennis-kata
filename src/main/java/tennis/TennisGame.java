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

        return "love, %s".formatted(formatScore(playerTwo));
    }

    private String formatScore(Player player) {
        switch (player.getScore()) {
            case 0: return "love";
            case 15: return "fifteen";
            case 30: return "thirty";
            default:
                return "forty";
        }
    }
}
