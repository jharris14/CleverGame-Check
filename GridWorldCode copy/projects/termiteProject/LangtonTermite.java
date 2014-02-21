//Jaz Harris
//Langton's Termite

public class LangtonTermite extends Termite
{
  public void act()
  {
    if(seeFlower())//if the square in front of you has a flower (black)
    {
      if(hasFlower())
      {
        throwFlower();
      }
      pickUpFlower();//pick up the flower infront of you
      move();//move to that space
      turn();
      turn();
      turn();
      turn();
      turn();
      turn();//turn to the left
    }
    if(!seeFlower())//if the square in front of you doesn't have a flower (white)
    {
      move();//move to that space
      turn();
      turn();//turn to the right
      if(!hasFlower())
      {
        createFlower();
      }
      dropFlower();//put a flower on the space you're at
    }
  }
  public void throwFlower()//making throwFlower a get-rid-of-flower method
  {
    flower = null;
  }
}
      