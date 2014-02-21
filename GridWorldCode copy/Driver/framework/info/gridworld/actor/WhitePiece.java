//Jaz Harris
//Pieces class

package info.gridworld.actor;
import java.awt.Color;
import info.gridworld.actor.Bug;

/* making a class for each white checker piece
 * it'll know its color
 * */

public class WhitePiece extends Bug
{
  private static final Color DEFAULT_COLOR = Color.WHITE;
  
  public WhitePiece()
  {
    setColor(DEFAULT_COLOR);
  }
  
  public WhitePiece(Color color)
  {
    setColor(color);
  }
  
  public void act()
  {
  }
}