//Jaz Harris
//DancingBugRunner

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

public class DancingBugRunner
{
  public static void main(String[] args)
  {
    int[] anArray = new int[5];
    anArray[0] = 3;
    anArray[1] = 4;
    anArray[2] = 2;
    anArray[3] = 5;
    anArray[4] = 2;
    ActorWorld world = new ActorWorld();
    world.add(new DancingBug(anArray));
    world.add(new Rock());
    world.show();
  }
}