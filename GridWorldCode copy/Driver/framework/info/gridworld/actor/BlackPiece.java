//Jaz Harris
//Pieces class

package info.gridworld.actor;
import java.awt.Color;
import info.gridworld.actor.Bug;

/* making a class for each black checker piece
 * it'll know its color
 * */

public class BlackPiece extends Bug
{
  private static final Color DEFAULT_COLOR = Color.WHITE;
  
  public BlackPiece()
  {
    setColor(DEFAULT_COLOR);
  }
  
  public BlackPiece(Color color)
  {
    setColor(color);
  }
  
  public void act()
  {
  }
}