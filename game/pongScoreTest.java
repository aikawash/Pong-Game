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
 * This class describes several objects
 * that are tester objects for the PongScore.java class.
 * It runs with hard coded values and prints the actual
 * and expected values after calling a method.
 */


public class pongScoreTest
{
   public static void main(String []args)
   {
      System.out.println("Object score01");
   
      /*
      *Constructing a new PongScore object with default constructor
      * and using the getScore() method to print the initial score
      */
   
      PongScore score01 = new PongScore();
      System.out.println("score should be 0, score is: " + score01.getScore());
         
      System.out.println("\nscorePoints(300)");
         
         /*
         *Calling the scorePoints() method
         * and printing actual and expected values
         * with getScore()
         */
         
      score01.scorePoints(300);
      System.out.println("score should be 300, score is: " + score01.getScore());
         
        /*
         * Printing the score01 object which invokes
         * the toString method in the PongScore class
         */
      System.out.println(score01);
         
                  
      System.out.println("\nObject score02");
     /*
      *Constructing a new PongScore object with default constructor
      * and using the getScore() method to print the initial score
      */
   
      PongScore score02 = new PongScore();
      System.out.println("score should be 0, score is: " + score02.getScore());
         
         
      System.out.println("\nscorePoints(11224)");
         
        /*
         *Calling the scorePoints() method 
         *and printing actual and expected values
         *with getScore()
         */
   
      score02.scorePoints(11224);
      System.out.println("score should be 11224, score is: " + score02.getScore());
   
        /*
         * Printing the score02 object which invokes
         * the toString method in the PongScore class
         */
   
      System.out.println(score02);
   
   
   
   
   }
   
   
}