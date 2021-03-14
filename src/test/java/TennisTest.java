import Player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {

    @Test
    public void playerScoresStartAtZero() {
        TennisGame game = new TennisGame();
        Player player1 = game.getPlayerOne();
        assertEquals(0, player1.getScore());

        Player player2 = game.getPlayerTwo();
        assertEquals(0, player2.getScore());
    }
}
