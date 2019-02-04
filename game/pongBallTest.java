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
 * that are tester objects for the PongBall.java class.
 * It runs with hard coded values and prints the actual
 * and expected values after calling a method.
 */


public class pongBallTest
{
   public static void main(String []args)
   {
   /**
     * Constructing a new PongBall with hard coded initial parameters for 
     * initial x position, initial y position, initial x velocity, and
     * initial y velocity.   
     * This also prints the initial values using the 
     * getX() and getY() methods   
     * 
     */
   
      System.out.println("Object ball01");
      PongBall ball01 = new PongBall(11,10,2,2);
      System.out.println("x should be 11, x is: " + ball01.getX());
      System.out.println("y should be 10, y is: " + ball01.getY());
     /**
     * Calling the the move() method
     * and printing actual and expected values
     * with getX() and getY()
     */    
      ball01.move();
      System.out.println("x should be 13, x is: " + ball01.getX());
      System.out.println("y should be 12, y is: " + ball01.getY());
            
      ball01.move();
      System.out.println("x should be 15, x is: " + ball01.getX());
      System.out.println("y should be 14, y is: " + ball01.getY());
            
      /**
      *Calling the bounceX() and bounceY() methods
      *and printing actual and expected values using
      *getSpeed()
      */                  
      ball01.bounceX();
      ball01.bounceY();
      System.out.print("The speed should be 2.83 , speed is: ");
      System.out.printf("%.2f", ball01.getSpeed());
            
      System.out.println("\n");
   
       /*
       *Printing the ball01 object which invokes toString
       *from the PongBall class
       */            
      System.out.println(ball01);
         
    /**
     * Constructing a new PongBall with hard coded initial parameters for 
     * initial x position, initial y position, initial x velocity, and
     * initial y velocity.       
     * 
     */
     
      System.out.println("\nObject ball02");         
      PongBall ball02 = new PongBall(3,4,3,4);
      System.out.println("x should be 3, x is: " + ball02.getX());
      System.out.println("y should be 4, y is: " + ball02.getY());
         
         /**
         * Calling the the move(), getX(), and getY() methods
         * and printing actual and expected values
          */ 
      System.out.println("\nmove()");
      ball02.move();
      System.out.println("x should be 6, x is: " + ball02.getX());
      System.out.println("y should be 8, y is: " + ball02.getY());
          
      System.out.println("\nmove()");
   
      ball02.move();
      System.out.println("x should be 9, x is: " + ball02.getX());
      System.out.println("y should be 12, y is: " + ball02.getY());
         
         
         /**
         *Calling the bounceX() and bounceY() methods
         *and printing actual and expected values
         * using getSpeed
         */ 
      System.out.println("\nball01.bounceX()");
      System.out.println("ball01.bounceY()");                     
      ball01.bounceX();
      ball01.bounceY();
      System.out.print("The speed should be 5 , speed is: ");
      System.out.printf("%.2f", ball02.getSpeed());
                    
      System.out.println("\n");
       
       
         /*
         *Printing the ball02 object which invokes toString
         *from the PongBall class
          */ 
      System.out.println(ball02);
         
   
   
   
   }
   
   
}