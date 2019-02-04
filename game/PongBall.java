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
 * This class describes an object that is used to
 * represent the ball in a game of pong.  Each 
 * PongBall will have an x and y position.  Each 
 * PongBall will also have a velocity in the x 
 * direction and a velocity in the y direction.
 */
public class PongBall {
   private int x;
   private int y;
   private int xVelocity;
   private int yVelocity;
 
   /**
    * Construct a new PongBall with the specified initial
    * position and velocity.
    * 
    * @param initX the initial X position of the new PongBall.
    * @param initY the initial Y position of the new PongBall.
    * @param initXV the initial velocity of the new PongBall in
    *               the X direction.
    * @param initYV the initial velocity of the new PongBall in
    *               the Y Direction.
    */
   public PongBall(int initX, int initY, int initXV, int initYV) {
    
      x = initX;
      y = initY;
      xVelocity = initXV;
      yVelocity = initYV;
    
   
   }

   /**
    * Move this PongBall according to its current velocity.
    * This method is invoked at a regular rate by the Pong
    * application in order to update the position of the ball. 
    * The x position changes by the xVelocity and the y 
    * position changes by the yVelocity. Uses a simple sum.
    */
   public void move() {
      
      x = x + xVelocity;
      y = y + yVelocity;   
           
   
    
    
   }

   /**
    * Reverse the X direction of this PongBall.  This method
    * is invoked by the Pong application each time this PongBall
    * collides with a vertical obstruction such as a wall or paddle.
    * The X direction can be reversed by changing the sign of the xVelocity.
    */
   public void bounceX() {
        
      xVelocity = (-1)*xVelocity;
      
   }

   /**
    * Reverse the Y direction of this PongBall.  This method is
    * invoked by the Pong application each time this PongBall
    * collides with a horizontal obstruction such as a wall or the
    * top/bottom edge of paddle. The Y direction can be reversed  
    * by changing the sign of the yVelocity.
    */
   public void bounceY() {
    
      yVelocity = (-1)*yVelocity;
   
   }

   /**
    * Return the current X position of this PongBall.
    *
    * @return the X position of this PongBall.
    */
   public int getX() {
      return x;
   }

   /**
    * Return the current y position of this PongBall.
    *
    * @return the Y position of this PongBall.
    */
   public int getY() {
      return y;
   }
 
   /**
    * Returns the current speed of the ball calculated by taking
    * the square root of the sum of the squares of the component
    * velocities.  Do we need the Math. class?  How do we get it?
    *
    * @return the length of the resultant velocity vector.
    */
   public double getSpeed(){
      double result = Math.sqrt( Math.pow(xVelocity, 2) + Math.pow(yVelocity, 2) );
      return result;
   
   
      
   
   }
  
   /**
    * Provides a formatted dump of the instance (field) variables.
    *
    * @return a String reflecting the current state of the object.
    */
   public String toString(){
       
      return "Pong Ball: The x coordinate is "+x+", and the y coordinate is "+y+ " \n The x velocity is "+xVelocity+", and the y velocity is "+yVelocity;
   
   
   }
  
}
