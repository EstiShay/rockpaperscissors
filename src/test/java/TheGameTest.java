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

    @Test
    public void gameOutcome_returnTieForMatchingScissors_Tie() throws Exception {
        TheGame testGame = new TheGame();
        String expected = "It's a tie!";
        assertEquals(expected, testGame.gameOutcome("scissors", "scissors"));

    }

    @Test
    public void gameOutcome_returnTieForMatchingPaper_Tie() throws Exception {
        TheGame testGame = new TheGame();
        String expected = "It's a tie!";
        assertEquals(expected, testGame.gameOutcome("paper", "paper"));

    }

    @Test
    public void gameOutcome_returnTieForMatchingRock_Tie() throws Exception {
        TheGame testGame = new TheGame();
        String expected = "It's a tie!";
        assertEquals(expected, testGame.gameOutcome("rock", "rock"));

    }

    @Test
    public void gameOutcome_returnWinForRockvPaper_PaperWin() throws Exception {
        TheGame testGame = new TheGame();
        String expected = "Paper wins!";
        assertEquals(expected, testGame.gameOutcome("rock", "paper"));

    }
}