import tennis.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tennis.TennisGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {

    private TennisGame tennisGame;
    private Player playerOne;
    private Player playerTwo;

    @BeforeEach
    public void beforeEach() {
        tennisGame = new TennisGame();
        playerOne = tennisGame.getPlayerOne();
        playerTwo = tennisGame.getPlayerTwo();

    }

    @Test
    public void playerScoresStartAtZero() {
        assertEquals(0, playerOne.getScore());
        assertEquals(0, playerTwo.getScore());
    }

    @Test
    public void playerOneScoresFirstPoint() {
        tennisGame.scorePoint(playerOne);
        assertEquals(15, playerOne.getScore());
    }

    @Test
    public void playerOneScoresFirstTwoPoints() {
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        assertEquals(30, playerOne.getScore());
    }

    @Test
    public void playerOneScoresFirstThreePoints() {
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        assertEquals(40, playerOne.getScore());
    }

    @Test
    public void gameStartsAtLove() {
        assertEquals("love", tennisGame.getScore());
    }

    @Test
    public void scoreIsZeroToFifteen() {
        tennisGame.scorePoint(playerTwo);
        assertEquals("love, fifteen", tennisGame.getScore());
    }

    @Test
    public void scoreIsZeroToThirty() {
        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);
        assertEquals("love, thirty", tennisGame.getScore());
    }

    @Test
    public void scoreIsZeroToForty() {
        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);
        assertEquals("love, forty", tennisGame.getScore());
    }
}
