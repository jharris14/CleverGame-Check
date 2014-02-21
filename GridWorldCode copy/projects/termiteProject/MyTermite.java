//Jaz Harris
//MyTermite Class


public class MyTermite extends Termite
{
  public void act()
  {
    if(getGrid() == null)
      return;
    if(seeFlower() && !hasFlower())
    {
      pickUpFlower();
    }
    if(seeFlower() && hasFlower())
    {
      dropFlower();
    }
    if(canMove())
    {
      move();
    }
    randomTurn();
  }
}