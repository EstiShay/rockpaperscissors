import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class TheGameTest {

    @Test
    public void gameOutcome_returnInvalidForOneInput_error() throws Exception {
        TheGame testGame = new TheGame();
        String expected = "error - game needs two players";
        assertEquals(expected, testGame.gameOutcome("rock", ""));

    }
}