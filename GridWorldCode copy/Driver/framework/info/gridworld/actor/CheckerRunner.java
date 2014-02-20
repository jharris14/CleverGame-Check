//Jaz Harris
//CheckersRunner

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.BlackSquare;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;


public class CheckerRunner
{
  public static void main(String[] args)
    {
    TestWorld gettingBoard = new TestWorld();
    for(int i=0; i <= 6; i = i +2)
    {
      for(int j=0; j <= 6; j = j +2)
      {
        gettingBoard.add(new Location(i, j), new BlackSquare());
      }
    }
    for(int i=1; i <= 7; i = i +2)
    {
      for(int j=1; j <= 7; j = j +2)
      {
        gettingBoard.add(new Location(i, j), new BlackSquare());
      }
    }
    gettingBoard.show();
  }
}