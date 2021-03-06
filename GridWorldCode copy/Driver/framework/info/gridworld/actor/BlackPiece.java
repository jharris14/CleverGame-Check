//Jaz Harris
//BlackPiece class

package info.gridworld.actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.actor.Bug;
import java.util.ArrayList;
import info.gridworld.actor.Actor;

/* making a class for each black checker piece
 * it'll know its color
 * */

public class BlackPiece extends Bug
{
  private static final Color DEFAULT_COLOR = Color.WHITE;
  
  public BlackPiece()
  {
    setColor(DEFAULT_COLOR);
  }
  
  /////////////////////////////////////////////////////Moving Left////////////////////////////////////////////////////////////////////
  
  public void moveLeft()//move method from bug modified to only move left
  {
    setDirection(225);//turning to Northeast
    Grid<Actor> gr = getGrid();
    if (gr == null)
      return;
    Location loc = getLocation();
    Location next = loc.getAdjacentLocation(getDirection());
    Location beyondNext = next.getAdjacentLocation(getDirection());//getting the location beyond the next one
    boolean canJump = defyingGravity(225, next, gr);//calling on the private method defyingGravity to see if the piece can jump
    boolean nextSpaceClear = lookingForward(next);//calling on the private method to check if there's an empty space
    if(canJump)
    {
      moveTo(next);
      BlackSquare blank = new BlackSquare();//the modification, leaves behind a black square where the piece used to be
      blank.putSelfInGrid(gr, loc);
      moveTo(beyondNext);//moving the piece to the location beyond next
      BlackSquare blank2 = new BlackSquare();//another black square
      blank2.putSelfInGrid(gr, next);//put the black square where the "eaten" piece used to be
      if(next.getRow() == 7)//if the piece is at the end, make it a king
      {
        removeSelfFromGrid();
        WhiteKing newKing = new WhiteKing();
        newKing.putSelfInGrid(gr,next);
      }
    
      if(canJump)//for double jumps
      {
        Location beyondTheBeyond = beyondNext.getAdjacentLocation(getDirection());
        Location theEnd = beyondTheBeyond.getAdjacentLocation(getDirection());
        moveTo(beyondTheBeyond);
        BlackSquare blank3 = new BlackSquare();//the modification, leaves behind a black square where the piece used to be
        blank3.putSelfInGrid(gr, beyondNext);
        moveTo(theEnd);//moving the piece to the location theEnd
        BlackSquare blank4 = new BlackSquare();//another black square
        blank4.putSelfInGrid(gr, beyondTheBeyond);//put the black square where the "eaten" piece used to be
        if(theEnd.getRow() == 7)//if the piece is at the end, make it a king
        {
          removeSelfFromGrid();
          BlackKing newKing = new BlackKing();
          newKing.putSelfInGrid(gr,theEnd);
        }
      }
    }
    
    else if (gr.isValid(next) && nextSpaceClear)//if the next move is valid and there isn't already a piece there
    {
      moveTo(next);
      if(next.getRow() == 7)//if the piece is at the end, make it a king
      {
        removeSelfFromGrid();
        BlackKing newKing = new BlackKing();
        newKing.putSelfInGrid(gr,next);
      }
      BlackSquare blank = new BlackSquare();//the modification, leaves behind a black square instead of a flower
      blank.putSelfInGrid(gr, loc);
    }
    else if(!nextSpaceClear)//if the next space isn't clear (has another piece there)
    {
      setDirection(0);
      return;
    }
    
    else//if the next location isn't in the grid then reset the direction and return null
    {
      setDirection(0);
      return;
    }
    setDirection(0);//resetting the direction to 0 so the image is right
  }
  
  ////////////////////////////////////////////////////////Moving Right///////////////////////////////////////////////////////////////////
  
  public void moveRight()//move method from bug modified to only move right
  {
    setDirection(135);//turning to Northwest
    Grid<Actor> gr = getGrid();
    if (gr == null)
      return;
    Location loc = getLocation();
    Location next = loc.getAdjacentLocation(getDirection());
    Location beyondNext = next.getAdjacentLocation(getDirection());//getting the location beyond the next one
    boolean canJump = defyingGravity(135, next, gr);//calling on the private method defyingGravity to see if the piece can jump
    boolean nextSpaceClear = lookingForward(next);//calling on the private method to check if there's an empty space
    if(canJump)
    {
      moveTo(next);
      BlackSquare blank = new BlackSquare();//the modification, leaves behind a black square where the piece used to be
      blank.putSelfInGrid(gr, loc);
      moveTo(beyondNext);//moving the piece to the location beyond next
      BlackSquare blank2 = new BlackSquare();//another black square
      blank2.putSelfInGrid(gr, next);//put the black square where the "eaten" piece used to be
      if(beyondNext.getRow() == 7)
      {
        removeSelfFromGrid();
        BlackKing newKing = new BlackKing();
        newKing.putSelfInGrid(gr,beyondNext);
      }
      
      if(canJump)//for double jumps
      {
        Location beyondTheBeyond = beyondNext.getAdjacentLocation(getDirection());
        Location theEnd = beyondTheBeyond.getAdjacentLocation(getDirection());
        moveTo(beyondTheBeyond);
        BlackSquare blank3 = new BlackSquare();//the modification, leaves behind a black square where the piece used to be
        blank3.putSelfInGrid(gr, beyondNext);
        moveTo(theEnd);//moving the piece to the location beyond BeyondNext
        BlackSquare blank4 = new BlackSquare();//another black square
        blank4.putSelfInGrid(gr, beyondTheBeyond);//put the black square where the "eaten" piece used to be
        if(theEnd.getRow() == 0)//if the piece is at the end, make it a king
        {
          removeSelfFromGrid();
          BlackKing newKing = new BlackKing();
          newKing.putSelfInGrid(gr,theEnd);
        }
      }
    }
    
    else if (gr.isValid(next) && nextSpaceClear)//if the next move is valid and there isn't already a piece there
    {
      moveTo(next);
      if(next.getRow() == 7)//if the piece is at the end, make it a king
      {
        removeSelfFromGrid();
        BlackKing newKing = new BlackKing();
        newKing.putSelfInGrid(gr,next);
      }
      BlackSquare blank = new BlackSquare();//the modification, leaves behind a black square instead of a flower
      blank.putSelfInGrid(gr, loc);
    }
    else if(!nextSpaceClear)//if the next space isn't clear (has another piece there)
    {
      setDirection(0);
      return;
    }
    else//if the next location isn't in the grid then reset the direction and return null
    {
      setDirection(0);
      return;
    }
    setDirection(0);//resetting the direction to 0 so the image is right
  }
  
  ///////////////////////////////////////////////////Boolean to Jump/////////////////////////////////////////////////////////////////////
  
  /* method to determine if the piece can jump 
   * takes parameter direction and next location
   */
  public boolean defyingGravity(int direction, Location next, Grid<Actor> board)
  { 
    Location beyondNext = next.getAdjacentLocation(direction);
    if(getGrid().get(next) instanceof WhitePiece && getGrid().isValid(beyondNext) && lookingForward(beyondNext))
      return true; 
    else if(getGrid().get(next) instanceof WhiteKing && getGrid().isValid(beyondNext) && lookingForward(beyondNext))
      return true;
    else
      return false;
  }
  
  
  //////////////////////////////////////////////////Boolean for checking a space//////////////////////////////////////////////////////////
  
  /*method to tell whether or not the next square is an open space
   * takes a parameter of a location which is the next space
   * */
  public boolean lookingForward(Location loc)
  {
    if(getGrid().get(loc) instanceof BlackSquare)
      return true;
    else
      return false;
  }
  
  public void act()
  {
    System.out.println("Nolan did stuff!");
  }
  
  public void move()//move method from bug modified so nothing can be done (where is your god now?)
    {
    }
}