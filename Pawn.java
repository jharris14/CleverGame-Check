//Jaz Harris
//Pawn Class

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/*Pawn can only move forward, unless it can take a piece, then it can move to the two forward diagonals and forward
 * if it hasn't moved yet, then it moves forward twice 
 */
public class Pawn extends Critter
{
  
  boolean canTakePiece = false;//making a boolean to determine if a piece can be taken by the pawn
  
  /*To determine whether or not there's a piece that can be eaten by the pawn
   * */
  public processActors(ArrayList<Actor> actors)
  {
    
  /*overriding the super get selectMoveLocations() to see available moves for this piece
   * for pawn, depends on result of processActors(ArrayList<Actor> actors)
   * */
  public arrayList<Location> getMoveLocations()
  {