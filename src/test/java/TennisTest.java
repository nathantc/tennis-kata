import tennis.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tennis.TennisGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {

    private TennisGame tennisGame;

    @BeforeEach
    public void beforeEach() {
        tennisGame = new TennisGame();

    }

    @Test
    public void playerScoresStartAtZero() {
        Player player1 = tennisGame.getPlayerOne();
        assertEquals(0, player1.getScore());

        Player player2 = tennisGame.getPlayerTwo();
        assertEquals(0, player2.getScore());
    }

    @Test
    public void playerOneScoresFirstPoint() {
        Player player1 = tennisGame.getPlayerOne();
        tennisGame.scorePoint(player1);
        assertEquals(15, player1.getScore());
    }
}
