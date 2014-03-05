//Jaz Harris
//WhitePiece class

package info.gridworld.actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.actor.Bug;

/* making a class for each white checker piece
 * it'll know its color
 * */

public class WhitePiece extends Bug
{
  private static final Color DEFAULT_COLOR = Color.WHITE;//defaut color = white
  
  public WhitePiece()//sets color to default color, which is white
  {
    setColor(DEFAULT_COLOR);
  }
  
  public void moveLeft()//move method from bug modified to only move left
  {
    setDirection(315);//turning to Northeast
    Grid<Actor> gr = getGrid();
    if (gr == null)
      return;
    Location loc = getLocation();
    Location next = loc.getAdjacentLocation(getDirection());
    if (gr.isValid(next))
      moveTo(next);
    else//if the next location isn't in the grid then reset the direction and return null
    {
      setDirection(0);
      return;
    }
    BlackSquare blank = new BlackSquare();//the modification, leaves behind a black square instead of a flower
    blank.putSelfInGrid(gr, loc);
    setDirection(0);//resetting the direction to 0 so the image is right
  }
  public void moveRight()//move method from bug modified to only move right
  {
    setDirection(45);//turning to Northwest
    Grid<Actor> gr = getGrid();
    if (gr == null)
      return;
    Location loc = getLocation();
    Location next = loc.getAdjacentLocation(getDirection());
    if (gr.isValid(next))
      moveTo(next);
    else//if the next location isn't in the grid then reset the direction and return null
    {
      setDirection(0);
      return;
    }
    BlackSquare blank = new BlackSquare();//the modification, leaves behind a black square instead of a flower
    blank.putSelfInGrid(gr, loc);
    setDirection(0);//resetting the direction to 0 so the image is right
  }
  
  public void act()
  {
  }
  
  public void turn()
  {
  }
}
