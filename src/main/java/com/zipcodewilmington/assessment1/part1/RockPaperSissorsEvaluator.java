package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if (handSign.equalsIgnoreCase("rock")){
            return "paper";
        } else if (handSign.equalsIgnoreCase("scissor")){
            return"rock";
        } else if(handSign.equalsIgnoreCase("paper")){
            return "scissor";
        }
        return null;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if (handSign.equalsIgnoreCase("rock")){
            return "scissors";
        } else if (handSign.equalsIgnoreCase("scissor")){
            return"paper";
        } else if(handSign.equalsIgnoreCase("paper")){
            return "rock";
        }
        return null;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        if (handSignOfPlayer1.equalsIgnoreCase(handSignOfPlayer2)){
            return "Tie!";
        } else if (handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("paper") || handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("rock")){
            return"paper";
        } else if(handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("scissors") || handSignOfPlayer1.equals("scissors") && handSignOfPlayer2.equals("rock")){
            return "rock";
        }else if(handSignOfPlayer1.equals("scissors") && handSignOfPlayer2.equals("paper") || handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("scissors")){
            return "scissors";
        }

        return null;
    }
}
