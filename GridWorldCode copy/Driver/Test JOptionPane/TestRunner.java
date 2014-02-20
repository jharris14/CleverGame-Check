//Jaz Harris
//Test with JOptionPane

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class TestRunner
{
  public static void main(String[] args)
    {
        TestWorld world = new TestWorld();
        BoxBug alice = new BoxBug(6);
        BoxBug bob = new BoxBug(3);
        world.add(new Location(0, 6), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}