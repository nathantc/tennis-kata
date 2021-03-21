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

    private void scorePoints(int num, Player player) {
        for(int i = 0; i < num; i++){
            tennisGame.scorePoint(player);
        }
    }

    @Test
    public void gameStartsAtLove() {
        assertEquals("love", tennisGame.getScore());
    }

    @Test
    public void scoreIsZeroToFifteen() {
        scorePoints(1, playerTwo);

        assertEquals("love, fifteen", tennisGame.getScore());
    }

    @Test
    public void scoreIsZeroToThirty() {
        scorePoints(2, playerTwo);

        assertEquals("love, thirty", tennisGame.getScore());
    }

    @Test
    public void scoreIsZeroToForty() {
        scorePoints(3, playerTwo);

        assertEquals("love, forty", tennisGame.getScore());
    }

    @Test
    public void playerTwoWinsSet() {
        scorePoints(4, playerTwo);

        assertEquals("Player Two set point", tennisGame.getScore());
    }

    @Test
    public void playerTwoWinsSetByTwo() {
        scorePoints(5, playerTwo);
        scorePoints(3, playerOne);

        assertEquals("Player Two set point", tennisGame.getScore());
    }

    @Test
    public void playersTiedAtDeuce() {
        scorePoints(3, playerOne);
        scorePoints(3, playerTwo);

        assertEquals("deuce", tennisGame.getScore());
    }

    @Test
    public void playerOneHasAdvantage() {
        scorePoints(4, playerOne);
        scorePoints(3, playerTwo);

        assertEquals("Player One advantage", tennisGame.getScore());
    }

    @Test
    public void playerTwoHasAdvantage() {
        scorePoints(4, playerTwo);
        scorePoints(3, playerOne);

        assertEquals("Player Two advantage", tennisGame.getScore());
    }

    @Test
    public void playerOneWinsSetByTwo() {
        scorePoints(5, playerOne);
        scorePoints(3, playerTwo);

        assertEquals("Player One set point", tennisGame.getScore());
    }

    @Test
    public void playersTiedAtFifteenAll() {
        scorePoints(1, playerOne);
        scorePoints(1, playerTwo);

        assertEquals("fifteen all", tennisGame.getScore());
    }

    @Test
    public void playersTiedAtThirtyAll() {
        scorePoints(2, playerOne);
        scorePoints(2, playerTwo);

        assertEquals("thirty all", tennisGame.getScore());
    }
    @Test
    public void playerOneWinsSet() {
        scorePoints(4, playerOne);

        assertEquals("Player One set point", tennisGame.getScore());
    }

    @Test
    public void test() {
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerOne);

        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);
        tennisGame.scorePoint(playerTwo);

        tennisGame.scorePoint(playerOne);
        tennisGame.scorePoint(playerTwo);


        assertEquals("deuce", tennisGame.getScore());
    }

    @Test
    public void scoreIsZeroToFifteenForPlayerOne() {
        scorePoints(1, playerOne);

        assertEquals("fifteen, love", tennisGame.getScore());
    }

}
