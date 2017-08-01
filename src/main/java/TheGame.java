import java.util.Arrays;

/**
 * Created by Guest on 8/1/17.
 */
public class TheGame {

    public String gameOutcome(String play1, String play2) {
        String result = new String();
        String[] correctPlays = {"rock", "paper", "scissors"};
        if ((!Arrays.asList(correctPlays).contains(play1)) || (!Arrays.asList(correctPlays).contains(play2))) {
            result = "error - game needs two players";
        }
        return result;
    }
}
