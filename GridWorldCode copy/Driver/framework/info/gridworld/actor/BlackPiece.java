//Jaz Harris
//BlackPiece class

package info.gridworld.actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
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
  
  public void act()
  {
  }
  
  public void move()//move method from bug modified so nothing can be done (where is your god now?)
    {
    }
}