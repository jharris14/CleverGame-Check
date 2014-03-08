//Jaz Harris && Nolan Chung && Mr. Kiang
//WhosTurnIsItAnyway

public class WhosTurnIsItAnyway
  
{
  public static boolean turn = true;
  
  public void flipTurn()
  {
    turn = !turn;
  }
  
  public boolean getTurn()
  {
    return turn;
  }
}