//Jaz Harris
//DancingBug Class

import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
  private int[] tempAry;
  private int x = 0;
  public DancingBug(int[] ary)//the constructor accepts the array
  {
    tempAry = ary;//and turns ary into tempAry
  }
  public void act()
  { 
    for(int i = 0; i < tempAry[x]; i++)//makes a loop to turn the same number of times as the value at the index x
    {
      turn();
    }
    move();//move after the set number of turns
    if(x < tempAry.length-1) x++;//if the int is less than the max, increase the int to the next array index
    else x = 0;//otherwise, reset 
  }
}

