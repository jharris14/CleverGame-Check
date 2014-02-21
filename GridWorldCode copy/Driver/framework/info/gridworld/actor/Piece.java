//Jaz Harris
//Pieces class

package info.gridworld.actor;
import java.awt.Color;
import info.gridworld.actor.Bug;

/* making a class for each checker piece
 * it'll know its color
 * */

public class WhitePiece extends Bug
{
  public Piece()
  {
  }
  
  public Piece(Color color)
  {
    setColor(color);
  }
  
  public void act()
  {
  }
}