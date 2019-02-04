/**
*Title: Pong Game
*@author Aika Washington
*@since 15 November 2017
*@version 1.0
*Description: This program, when run from the command window, will execute a two player game called Pong.
*The players use the A,Z,K,M, and B keys to play the game. The player must keep the ball from hitting 
*the wall behind them, which gives points to the other player. If one player scores too much, their
*paddle size will be halved until the other player catches up.
*Honor Code: On my honor, I have neither given nor received any unauthorized aid on this assignment. Aika Washington  
*/


/**
 * This class desribes objects that are used to track
 * the player's scores in a game of Pong.  Each PongScore
 * object will keep the score for a single player.
 */
public class PongScore {
    
   private int score;

    /**
     * Construct a new PongScore object with an initial 
     * score of zero points.
     */
   public PongScore() {
      
      
   }

    /**
     * Return the current score of this PongScore object.
     *
     * @return the score.
     */
   public int getScore() {
      return score;
   }

    /**
     * Increase the current score of this PongScore object
     * by points.
     *
     * @param points the number of points to add to the score
     */
   public void scorePoints(int points) {
    
      score = score + points;
   
   }
 
    /**
     * Provides a formatted dump of the instance (field) variables.
     *
     * @return a String reflecting the current state of the object.
     */
   public String toString(){
    
      return "The score is " +score+ ".";
   
   }
}


