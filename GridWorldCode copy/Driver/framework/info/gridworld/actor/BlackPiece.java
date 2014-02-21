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
  
  public BlackPiece(Color color)
  {
    setColor(color);
  }
  
  public void act()
  {
  }
  
  public void move()//move method from bug modified so the piece leaves behind a black square
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        BlackSquare blank = new BlackSquare();//the modification, leaves behind a black square instead of a flower
        blank.putSelfInGrid(gr, loc);
    }
}