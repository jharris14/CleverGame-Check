//Jaz Harris
//ChessWorld
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Color;
import info.gridworld.world.World;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.WhitePiece;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;


public class TestWorld extends ActorWorld
{
  private boolean alreadyClicked = false;//making a boolean to determine if the first click was made
  private Location loc;//creating a new location
  private boolean turn = true;//making a boolean to keep track of who's turn it is
  private boolean pieceIsKing = false;//keeps track if the piece is a king or not
  
  public TestWorld()
  {
    super(new BoundedGrid(8, 8));
  }
  
  /* gets the location of the click (input from user) 
   * and offers a choice between left and right to move
   * 
  private boolean locationClicked(Location loc)
  {
    
    if(!turn)//AI's turn
    {
      setMessage("Computer's turn");
      return true;
    }
    
    if(turn && !(loc.getActor() instanceof WhitePiece))//players can only move white pieces, prevents altering everything else
    {
      setMessage("Invalid click");
      return true;
    }
    
    if(turn && (loc.getActor() instanceof WhitePiece))//when it's the players turn and they click on a white piece
    {
      alreadyClicked = true;
      setMessage("Where would you like to move this piece?");
      return true;
    }
    
    if(turn && (loc.getActor() instanceof WhiteKing))//when it's the players turn and they click on a white king
    {
      alreadyClicked = true;
      pieceIsKing = true;
      setMessage("Where would you like to move this piece?");
      return true;
    }
    
    if(alreadyClicked)//if the player has selected a valid piece
    {
      if(!pieceIsKing)//not a king
      {
        int moveDirection = JOptionPane.showConfirmDialog(null, "left", "right", JOptionPane.YES_NO_OPTION);//gives the option to move either left or right
        if(moveDirection == JOptionPane.YES_OPTION)//moving left
        {
          boolean movable = validStep(1, loc);//call on private method validStep
          if(movable)//if can move left, move left
          {
            loc.getActor().move();//calls on move to move piece
          }
          else if(!movable)//if can't move left
          {
            setMessage("You wasted a turn... sorry 'bout that");
          }
        }
        else if(moveDirection == JOptionPane.NO_OPTION)//moving right
        {
          boolean movable = validStep(2, loc);//call on private method validStep
          if(movable)//if can move right, move right
          {
            loc.getActor().move();//calls on move to move piece
          }
          else if(!movable)//if can't move right
          {
            setMessage("You wasted a turn... sorry 'bout that");
          }
        }
      }
      if(pieceIsKing)
      {
        int moveLeftRight = JOptionPane.showConfirmDialog(null, "left", "right", JOptionPane.YES_NO_OPTION);//gives the option to move either left or right
        if(moveLeftRight == JOptionPane.YES_OPTION)
        {
          int moveUpDown = JOptionPane.showConfirmDialog(null, "up", "down", JOptionPane.YES_NO_OPTION);//gives the option to move either up or down
          if(moveUpDown == JOptionPane.YES_OPTION)//moving left and up
          {
            boolean movable = validStep(1, loc);//call on private method validStep
            if(movable)//if can move left and up, move left and up
            {
              loc.getActor().move();//calls on move to move piece
            }
            else if(!movable)//if can't move left and up
            {
              setMessage("You wasted a turn... sorry 'bout that");
            }
          }
          if(moveUpDown == JOptionPane.NO_OPTION)//moving left and down
          {
            boolean movable = validStep(3, loc);//call on private method validStep
            if(movable)//if can move left and down, move left and down
            {
              loc.getActor().move();//calls on move to move piece
            }
            else if(!movable)//if can't move left
            {
              setMessage("You wasted a turn... sorry 'bout that");
            }
          }
        }
        else if(moveLeftRight == JOptionPane.NO_OPTION)
        {
          int moveUpDown = JOptionPane.showConfirmDialog(null, "up", "down", JOptionPane.YES_NO_OPTION);//gives the option to move either up or down
          if(moveUpDown == JOptionPane.YES_OPTION)//moving right and up
          {
            boolean movable = validStep(2, loc);//call on private method validStep
            if(movable)//if can move right and up, move right and up
            {
              loc.getActor().move();//calls on move to move piece
            }
            else if(!movable)//if can't move right and up
            {
              setMessage("You wasted a turn... sorry 'bout that");
            }
          }
          if(moveUpDown == JOptionPane.NO_OPTION)//moving right and down
          {
            boolean movable = validStep(4, loc);//call on private method validStep
            if(movable)//if can move right and down, move right and down
            {
              loc.getActor().move();//calls on move to move piece
            }
            else if(!movable)//if can't move right and down
            {
              setMessage("You wasted a turn... sorry 'bout that");
            }
          }
        }
      }
      turn = false;//making it not the player's turn
    }
  }*/
}