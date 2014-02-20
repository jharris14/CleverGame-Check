package info.gridworld.actor;
import java.awt.Color;
import info.gridworld.actor.Flower;

public class BlackSquare extends Flower
{
  private static final Color DEFAULT_COLOR = Color.BLACK;
  
  public BlackSquare()
  {
    setColor(DEFAULT_COLOR);
  }
  
  public BlackSquare(Color inputColor)
  {
    setColor(inputColor);
  }
  
  public void act()
  {
  }
}