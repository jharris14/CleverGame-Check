//Jaz Harris
//CheckersRunner

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.BlackSquare;
import info.gridworld.actor.WhitePiece;
import info.gridworld.actor.BlackPiece;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;


public class CheckerRunner
{
  public static void main(String[] args)
    {
    TestWorld gettingBoard = new TestWorld(new BoundedGrid(8,8));//making a new TestWorld
    for(int i=0; i <= 2; i = i +2)//for loop to add two rows of black pieces
    {
      for(int j=0; j <= 6; j = j +2)
      {
        gettingBoard.add(new Location(i, j), new BlackPiece());
      }
    }
    for(int i=1; i <= 2; i = i +2)//for loop to add a row of black pieces
    {
      for(int j=1; j <= 7; j = j +2)
      {
        gettingBoard.add(new Location(i, j), new BlackPiece());
      }
    }
    for(int i=4; i <= 7; i = i +2)//for loop to add two rows of white pieces
    {
      for(int j=0; j <= 7; j = j +2)
      {
        gettingBoard.add(new Location(i, j), new WhitePiece());
      }
    }
    for(int i=5; i <= 7; i = i +2)//for loop to add a row of white pieces
    {
      for(int j=1; j <= 7; j = j +2)
      {
        gettingBoard.add(new Location(i, j), new WhitePiece());
      }
    }
    for(int i=3; i <= 4; i = i +2)//for loop to add blank black squares to the grid as well 
    {
      for(int j=1; j <= 7; j = j +2)
      {
        gettingBoard.add(new Location(i, j), new BlackSquare());
      }
    }
    for(int i=4; i <= 5; i = i +2)//another loop adding black squares 
    {
      for(int j=0; j <= 7; j = j +2)
      {
        gettingBoard.add(new Location(i, j), new BlackSquare());
      }
    }
    gettingBoard.show();//display the world
  }
}