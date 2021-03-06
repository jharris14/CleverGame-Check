//Jaz Harris
//Getting the click-thing to work (hopefully)

package test4click;

import java.util.ArrayList;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;



public class ClickerWorld extends World<AdamAndEve>
{
  private boolean turn;
  private BoundedGrid<AdamAndEve> betterWork;
  private AdamAndEve spinda;
  
  public ClickerWorld()
  {
    super(new BoundedGrid<AdamAndEve>(8, 8));
    start();

  }
  
  public void start()
  {
    setMessage("");
    turn = true;
  }
  
  public boolean locationClicked(Location loc)
  {
    setMessage("");
    
    if(turn)
    {
      moveIt(loc);
    }
    return true;
  }
  
  public void moveIt(Location loc)
  {
    AdamAndEve piece = betterWork.get(loc);
    piece.move();
  }
}