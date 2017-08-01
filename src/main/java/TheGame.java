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
        } else if (play2.equals(play1)) {
            result = "It's a tie!";
        } else if ((play1.equals("rock") && play2.equals("paper")) || (play1.equals("paper") && play2.equals("rock")) ){
            result = "Paper wins!";
        } else if ((play1.equals("rock") && play2.equals("scissors")) || (play1.equals("scissors") && play2.equals("rock")) ){
            result = "Rock wins!";
        }
        return result;
    }
}
