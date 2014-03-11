// Nolan Chung
// Nolan Chung's AI to play chess on Jaz's CleverName-Check
/* Classes
 * 
 *
 * 
 * Piece(type, value, coordinate, danger, potential moves)
 * 
 *
 * 
 * */
package info.gridworld.actor;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.WhitePiece;
import info.gridworld.actor.BlackPiece;
import info.gridworld.actor.BlackKing;
import info.gridworld.actor.WhiteKing;
import info.gridworld.actor.BlackSquare;
import java.util.ArrayList;
import info.gridworld.grid.Location;

public class CleverNameCheckAI extends Bug
  
{
  Location loc = null; // Location of selected piece to be set later when one piece is selected 
  ArrayList<Actor> neighbors = new ArrayList<Actor>();
  int counter; // Counter in forloop declared outside for access
  Location playerPieceLoc = neighbors.get(counter).getLocation(); // Saves Location of an opponent's piece
  int oppositeDirection = loc.getDirectionToward(playerPieceLoc) + 180; // Saves direction opposite to opponent's piece
  Location oppositeDirectionLocation = loc.getAdjacentLocation(oppositeDirection); // Gets adjacent location opposite to opponent's piece
  ArrayList<Location> blackPiecesLocations = new ArrayList<Location>(); // Gets list of black pieces for random moves
  
  public boolean inDanger(Actor actor) // Method to check if piece is in danger
    
  {
    loc = actor.getLocation(); // Gets location of actor being checked
    neighbors = getGrid().getNeighbors(loc); // Gets all neighbors of this piece
    
    if(oppositeDirection >= 360) // Opposite direction adds 180 degrees to angle so since compass directions do not exceed 359, this gets the equivalent angle if it does 
    {
      oppositeDirection = oppositeDirection - 360; // Subtracts 360 degrees to find the coterminal angle
    }
    
    boolean output = false; // Default output response set to true
    for(counter = 0; counter < neighbors.size() - 1; counter++) // For loop using the external counter
    {
      
      if(neighbors.get(counter) instanceof WhiteKing) // If the neighboring 
      {
        if(getGrid().get(oppositeDirectionLocation) == null) 
        {
          output = true;
          return output; 
        }
      }
      
      if(neighbors.get(counter) instanceof WhitePiece) 
      {
        int pieceDirection = neighbors.get(counter).getDirection();
        if(pieceDirection == 0 || pieceDirection == 45 || pieceDirection == 315) 
        {
          if(getGrid().get(oppositeDirectionLocation) == null) 
          {
            output = true;
            return output; 
          } 
        } 
      } 
    }
    return output;
  }
  
  ArrayList<Location> possibleMoveActors = new ArrayList<Location>();
  
  public Actor choosePiece()
  {
    blackPiecesLocations = getGrid().getOccupiedLocations(); 
    for(int i = 0; i < getGrid().getOccupiedLocations().size() - 1; i++) 
    {
      if(getGrid().get(blackPiecesLocations.get(i)) instanceof WhitePiece || getGrid().get(blackPiecesLocations.get(i)) instanceof WhiteKing || getGrid().get(blackPiecesLocations.get(i)) instanceof BlackSquare) 
      {
        blackPiecesLocations.remove(i);
        i--;   
      }    
    }
    possibleMoveActors = getGrid().getOccupiedLocations();
    for(int i = 0; i < possibleMoveActors.size() - 1; i++) 
    {
      if(getGrid().get(possibleMoveActors.get(i)) instanceof WhiteKing || getGrid().get(possibleMoveActors.get(i)) instanceof WhitePiece || inDanger(getGrid().get(possibleMoveActors.get(i))) == false) 
      {
        possibleMoveActors.remove(i);
        i--;       
      }
      if(possibleMoveActors.size() == 0)
        return null;
      if(possibleMoveActors.size() > 1)
        return getGrid().get(possibleMoveActors.get((int)(Math.random()*possibleMoveActors.size()))); 
    }
    return null;
  }
    
    public void block()
    {
      ArrayList<Actor> blockers = getGrid().getNeighbors(oppositeDirectionLocation);
      for(int i = 0; i < blockers.size() - 1; i++) 
      {
        if(blockers.get(i) instanceof WhitePiece || blockers.get(i).getLocation() == loc) 
        {
          blockers.remove(i);
          i--; 
        } 
      }
      if(blockers.size() == 0) 
      {
        randomMove(); 
      }
      if(blockers.size() == 1) 
      {
        blockers.get(0).moveTo(oppositeDirectionLocation); 
      }
      if(blockers.size() < 1) 
      {
        blockers.get((int)(Math.random()*blockers.size())).moveTo(oppositeDirectionLocation); 
      }
    }
    
    public void randomMove() 
    {
      int randNum = (int)(Math.random()*blackPiecesLocations.size());
      BlackPiece randomBlack = (BlackPiece)getGrid().get(blackPiecesLocations.get(randNum));//selects random black piece from arraylist
      if(getGrid().get(getLocation().getAdjacentLocation(135)) instanceof BlackSquare)//if the random piece can move right, move right 
      {
        randomBlack.moveRight(); 
      }
      else if(getGrid().get(getLocation().getAdjacentLocation(225)) instanceof BlackSquare)//else, if the random piece can move left, move left
      {
        randomBlack.moveLeft(); 
      } 
    }
}