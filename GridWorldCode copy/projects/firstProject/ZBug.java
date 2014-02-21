//Jaz Harris
//ZBug Class

import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
  private int steps;
  private int sideLength;
  
  public ZBug(int length)
  {
    steps = 0;
    sideLength = length;
  }
  public void act()
  {
    int numTurns = 0;//creating an int to track the number of turns
    boolean moveItMoveIt = false;//creating a boolean to check if the bug can move
    if(canMove())//if you can move, run the Z program!
    {
      moveItMoveIt = true;
    }
    else //if you can't move... the boolean is false
    {
      moveItMoveIt = false;
    }
    if(moveItMoveIt)//if the boolean is true, time to move!
    {
      while(getDirection() != 90 && numTurns == 0)//to correct direction 
      {
        turn();
      }
      if(steps < sideLength && canMove())//if steps less than the length, move
      {
        move();
        steps++;
      }
      else//after one side is completed, time to turn!
      {
        numTurns = 1;
      }
      while(getDirection() != 225 && numTurns == 1)//the first turn, this corrects direction
      {
        turn();
      }
      if(steps < 2*sideLength && canMove() && numTurns == 1)//if steps less than twice the length, move
      {
        move();
        steps++;
      }
      else
      {
        numTurns = 2;//after second side completed, time to turn again!
      }
      while(getDirection() != 90 && numTurns == 2)//the second turn, will correct direction
      {
        turn();
      }
      if(steps < 3*sideLength && canMove() && numTurns == 2)//if steps less than trice the length, move
      {
        move();
        steps++;
      }
    }
    else if(!moveItMoveIt)//if the boolean is false, time to turn!
    {
      if(!canMove())//if you can't move, turn
      {
        turn();
      }
      else
      {
        move();
        moveItMoveIt = true;//when you can move, make the boolean true
      }
    }
  }
}