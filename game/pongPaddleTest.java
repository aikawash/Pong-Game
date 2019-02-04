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
 * that are tester objects for the PongPaddle.java class.
 * It runs with hard coded values and prints the actual
 * and expected values after calling a method.
 */


public class pongPaddleTest
{
   public static void main(String []args)
   {
   
     /*
      *Constructing a new PongPaddle object with default constructor
      * and printing initial values with methods getLeftX(),
      * getTopY(), getRightX(), and getBottomY()
      */
   
      System.out.println("paddle01");   
      PongPaddle paddle01 = new PongPaddle(11,16,3,3);
      System.out.println("The top y should be 16, top y  is: "+paddle01.getLeftX());
      System.out.println("The left x should be 11, left x is: "+paddle01.getTopY());
      System.out.println("The right x should be 18, right x is: "+paddle01.getRightX());
      System.out.println("The bottom y should be 13, bottom y is: "+paddle01.getBottomY());
      
      System.out.println("\n");
      
      System.out.println("moveUp(2)");
      /*
      *Calling method moveUp()
      *and printing actual and expected values with getTopY()
      *and getBottomY()
      */
      
   
      paddle01.moveUp(2);
      System.out.println("The top y should be 9, left x is: "+paddle01.getTopY());
      System.out.println("The bottom y should be 11, bottom y is: "+paddle01.getBottomY());
      
      System.out.println("\n"); 
      System.out.println("moveDown(3)");
      
      /*
      *Calling method moveDown()
      *and printing actual and expected values with getTopY()
      *and getBottomY()
      */
   
      paddle01.moveDown(3);
      System.out.println("The top y should be 12, left x is: "+paddle01.getTopY());
      System.out.println("The bottom y should be 14, bottom y is: "+paddle01.getBottomY());
      
      System.out.println("\n");
      /*
      *Printing the paddle01 which
      *invokes the toString method in the
      *PongPaddle class
      */
      System.out.println(paddle01);
      System.out.println("\n");
   
      System.out.println("halfHeight()");
      /*
      *Calling the halfHeight() method
      */
      paddle01.halfHeight();
      /*
      *Printing the paddle01 which
      *invokes the toString method in the
      *PongPaddle class
      */
   
      System.out.println(paddle01);  
      System.out.println("\n");
   
      System.out.println("doubleHeight()");
      /*
      *Calling the doubleHeight() method
      */
   
      paddle01.doubleHeight();
      
      /*
      *Printing the paddle01 which
      *invokes the toString method in the
      *PongPaddle class
      */
   
      System.out.println(paddle01);  
   
   
   
   
      System.out.println("\npaddle02");    
    /*
      *Constructing a new PongPaddle object with default constructor
      * and printing initial values with methods getLeftX(),
      * getTopY(), getRightX(), and getBottomY()
      */
   
      PongPaddle paddle02 = new PongPaddle(10,12,2,2);
      System.out.println("The top y should be 12, top y  is: "+paddle02.getLeftX());
      System.out.println("The left x should be 10, left x is: "+paddle02.getTopY());
      System.out.println("The right x should be 13, right x is: "+paddle02.getRightX());
      System.out.println("The bottom y should be 11, bottom y is: "+paddle02.getBottomY());
      
      System.out.println("\n");
      System.out.println("moveUp(2)");
         /*
         *Calling method moveUp()
         *and printing actual and expected values with getTopY()
         *and getBottomY()
         */
   
      paddle02.moveUp(2);
      System.out.println("The top y should be 8, left x is: "+paddle02.getTopY());
      System.out.println("The bottom y should be 9, bottom y is: "+paddle02.getBottomY());
      
      System.out.println("\n"); 
      System.out.println("moveUp(4)");
       /*
        *Calling method moveUp()
        *and printing actual and expected values with getTopY()
        *and getBottomY()
        */
   
      paddle02.moveDown(4);
      System.out.println("The top y should be 12, left x is: "+paddle02.getTopY());
      System.out.println("The bottom y should be 13, bottom y is: "+paddle02.getBottomY());
      
      System.out.println("\n");
      /*
      *Printing the paddle02 which
      *invokes the toString method in the
      *PongPaddle class
      */
   
      System.out.println(paddle02);
      System.out.println("\n");
   
      System.out.println("halfHeight()");   
      /*
      *Calling the halfHeight() method
      */
   
      paddle02.halfHeight();
      
       /*
      *Printing the paddle02 which
      *invokes the toString method in the
      *PongPaddle class
      */
   
      System.out.println(paddle02);   
      System.out.println("\n");
   
      System.out.println("doubleHeight()");
      /*
      *Calling the doubleHeight() method
      */
   
      paddle02.doubleHeight();
      
      /*
      *Printing the paddle02 which
      *invokes the toString method in the
      *PongPaddle class
      */
   
      System.out.println(paddle02); 
   
   
   }
   
   
}