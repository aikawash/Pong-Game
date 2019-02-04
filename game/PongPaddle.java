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
 * This class describes objects that represent the paddles
 * in a Pong game.  Each PongPaddle has an (x,y) position that
 * indicates the position of the top-left corner of the paddle.
 * Each PongPaddle also has a width and a height.
 */
public class PongPaddle {
    
   private int x;
   private int y;
   private int width;
   private int height;

    /** 
     * Construct a new PongPaddle at the specified position with the
     * specified width and height.
     *
     * @param top the Y coordinate of the top left corner of the
     *            new PongPaddle.
     * @param left the X coordinate of the top left corner of the
     *             new PongPaddle.
     * @param w the width of the new PongPaddle, measured in pixels.
     * @param h the height of the new PongPaddle, measured in pixels.
     */
   public PongPaddle(int top, int left, int w, int h) {
      y = top;
      x = left;
      width  = w;
      height = h;
   
   
   
   }

    /**
     * Move the position of this PongPaddle up by the specified
     * number of pixels.
     *
     * @param d a number of pixels.
     */
   public void moveUp(int d) {
      y = y - d;
    
   }

    /**
     * Move the position of this PongPaddle down by the specified
     * number of pixels.
     *
     * @param d a number of pixels.
     */
   public void moveDown(int d) {
      if(y+d <600)
         y = y + d;
      else y=y;
    
   }

    /**
    
     * Return the X coordinate of the left edge of this 
     * PongPaddle.
     *
     * @return the X coordinate of the left edge of this
     *         PongPaddle.
     */
   public int getLeftX() {
      return x;
   }
    
    /**
     * Return the Y coordinate of the top edge of this 
     * PongPaddle.
     *
     * @return the Y coordinate of the top edge of this 
     * PongPaddle.
     */
   public int getTopY() {
      return y;
   }

    /**
     * Return the X coordinate of the right edge of this
     * PongPaddle.
     *
     * @return the X coordinate of the right edge of this
     * PongPaddle.
     */
   public int getRightX() {
      return x + width - 1;
   }

    /**
     * Return the Y coordinate of the bottom edge of this
     * PongPaddle.
     *
     * @return the Y coordinate of the bottom edge of this
     * PongPaddle.
     */
   public int getBottomY() {
      return y + height - 1;
   }
     
    /**
     * Introduces a handicap by halving the height of the player's paddle.
     * If a player's score exceeds his
     * opponent by too many points, the height of the paddle
     * is decreased by half.
     *
     */
   public void halfHeight(){
      height = height/2;
   
   }

    /**
     * Resets a handicap by restoring the full height of the player's paddle.
     * If a player has been handicapped and
     * the opponent can bring his score up to within a few points
     * of the other, then the paddle height will be restored to
     * its original size.
     *
     */
   public void doubleHeight(){
      height = height*2;
   
   }
   
    /**
     * Provides a formatted dump of the instance (field) variables.
     *
     * @return a String reflecting the current state of the object.
     */
   
   public String toString(){
      return "Pong paddle: The x coordinate is " +x+ " and the y coordinate is "+y+". The width is "+width+" and the height is "+height;
   }
  
}

