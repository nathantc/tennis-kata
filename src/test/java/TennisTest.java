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

    @Test
    public void playerTwoWinsSet() {
        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);
        assertEquals("Player Two set point", tennisGame.getScore());
    }

    @Test
    public void playersTiedAtDeuce() {
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);

        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);

        assertEquals("deuce", tennisGame.getScore());
    }

    @Test
    public void playerOneHasAdvantage() {
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);

        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);

        assertEquals("Player One advantage", tennisGame.getScore());
    }

    @Test
    public void playerOneWinsSetByTwo() {
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);

        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);

        assertEquals("Player One set point", tennisGame.getScore());
    }

    @Test
    public void playersTiedAtFifteenAll() {
        tennisGame.scorePoint(playerOne);

        tennisGame.scorePoint(playerTwo);

        assertEquals("fifteen all", tennisGame.getScore());
    }

    @Test
    public void playersTiedAtThirtyAll() {
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);

        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);

        assertEquals("thirty all", tennisGame.getScore());
    }
    @Test
    public void playerOneWinsSet() {
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        assertEquals("Player One set point", tennisGame.getScore());
    }
}
