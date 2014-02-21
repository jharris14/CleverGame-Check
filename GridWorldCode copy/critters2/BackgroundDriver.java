//Jaz Harris
//BackgroundDriver

public class BackgroundDriver extends DefaultDisplay
{
  public static void main(String[] arg)
  {
  BoundedGrid grid = new BoundedGrid (4, 7);
  for(int i=0; i < grid.getNumRows(); i++)
  {
    for(int j=0; j<grid.getNumCols(); j++)
    {
    grid.put(new Location (i, j), new Background(Color.BLACK));
    }
  }
  ActorWorld test = new ACtorWorld(grid);
  world.show();
  }
}