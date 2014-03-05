//Jaz Harris
//WhitePiece class

package test4click;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

/* making a class for each white checker piece
 * it'll know its color
 * */

public class WhitePiece
{
  private static final Color DEFAULT_COLOR = Color.WHITE;//defaut color = white
  
  public WhitePiece()//sets color to default color, which is white
  {
    setColor(DEFAULT_COLOR);
  }
  
  public WhitePiece(Color color)//allows for a change in color
  {
    setColor(color);
  }
  
  public void act(int direction)
  {
    if(direction == 1)
    {
      setDirection(Location.NORTHWEST);
      move();
    }
    else if(direction == 2)
    {
      setDirection(Location.NORTHEAST);
      move();
    }
  }
  
  public void move()//move method from bug modified so the piece leaves behind a black square
    {
        Grid<AdamAndEve> gr = getGrid();
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