import Player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {

    @Test
    public void test() {
        Player player = new Player();
        assertEquals(0, player.getScore());
    }
}
