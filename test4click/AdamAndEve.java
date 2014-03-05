//Jaz Harris
//Adam and Eve

package test4click;

import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class AdamAndEve extends Script
{
  private boolean color;
  
  public AdamAndEve(boolean color)
  {
    this.color = color;
  }
  
  public AdamAndEve(Color color)
  {
    if(Color.BLUE.equals(color))
    {
      this.color = true;
    }
    else if(Color.RED.equals(color))
    {
      this.color = false;
    }
    else
    {
      throw new IllegalArgumentException("color must be BLUE or RED");
    }
  }
  
  public boolean color()
  {
    return color;
  }
  
  public Color getColor()
  {
    if(color)
    {
      return Color.BLUE;
    }
    else
    {
      return Color.RED;
    }
  }
  
 public String getImageSuffix()
 {
  return color ? "_blue" : "_red";
 }
 
 public void move()
 {
   Grid<Script> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
 }
 
 public void add(Location loc, AdamAndEve occupant)
  {
    occupant.putSelfInGrid(getGrid(), loc);
  }
}