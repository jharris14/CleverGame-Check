//Jaz Harris
//Random Piece

package test4click;
import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Script
{
  private Grid<Script> grid;
  private Location location;
  private int direction;
  private Color color;
  
  public Script()
  {
    color = Color.BLUE;
    direction = Location.NORTH;
    grid = null;
    location = null;
  }
  
  public Grid<Script> getGrid()
  {
    return grid;
  }
  
  
  public void removeSelfFromGrid()
  {
    if (grid == null)
      throw new IllegalStateException(
                                      "This actor is not contained in a grid.");
    if (grid.get(location) != this)
      throw new IllegalStateException(
                                      "The grid contains a different actor at location "
                                        + location + ".");
    
    grid.remove(location);
    grid = null;
    location = null;
  }
  public Location getLocation()
  {
    return location;
  }
  
  public int getDirection()
  {
    return direction;
  }
  
  public void moveTo(Location newLocation)
  {
    if (grid == null)
      throw new IllegalStateException("This Script is not in a grid.");
    if (grid.get(location) != this)
      throw new IllegalStateException(
                                      "The grid contains a different script at location "
                                        + location + ".");
    if (!grid.isValid(newLocation))
      throw new IllegalArgumentException("Location " + newLocation
                                           + " is not valid.");
    
    if (newLocation.equals(location))
      return;
    grid.remove(location);
    Script other = grid.get(newLocation);
    if (other != null)
      other.removeSelfFromGrid();
    location = newLocation;
    grid.put(location, this);
  }
  
  public void putSelfInGrid(Grid<AdamAndEve> gr, Location loc)
    {
        if (grid != null)
            throw new IllegalStateException(
                    "This script is already contained in a grid.");

        Script piece = gr.get(loc);
        if (piece != null)
            piece.removeSelfFromGrid();
        gr.put(loc, this);
        grid = gr;
        location = loc;
    }
}
