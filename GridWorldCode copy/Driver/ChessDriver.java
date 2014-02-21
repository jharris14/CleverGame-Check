//Jaz Harris
//Chess Driver

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Scanner;

public static class ChessDriver
{
  ChessWorld gettingBoard = new ChessWorld(new BoundedGrid(8,8));//making the chess board
  for(int i = 0; i < getGrid().getNumCols(); i++)//loop to add pawns
  {
  gettingBoard.add(new Location(6, i), new Pawn(Color.WHITE));//making a pawn piece setting it at the right location & color
  gettingBoard.add(new Location(1, i), new Pawn(Color.BLACK));//same, but for a black pawn
  }
  gettingBoard.add(new Location(7, 0), new Rook(Color.WHITE));//making a rook piece
  gettingBoard.add(new Location(7, 7), new Rook(Color.WHITE));
  gettingBoard.add(new Location(7, 1), new Knight(Color.WHITE));//making a knight piece
  gettingBoard.add(new Location(7, 6), new Knight(Color.WHITE));
  gettingBoard.add(new Location(7, 2), new Bishop(Color.WHITE));//making a bishop piece
  gettingBoard.add(new Location(7, 5), new Bishop(Color.WHITE));
  gettingBoard.add(new Location(7, 4), new King(Color.WHITE));//making a king piece
  gettingBoard.add(new Location(7, 3), new Queen(Color.WHITE));//making a queen piece

  gettingBoard.add(new Location(0, 0), new Rook(Color.BLACK));//making a rook piece 
  gettingBoard.add(new Location(0, 7), new Rook(Color.BLACK));
  gettingBoard.add(new Location(0, 1), new Knight(Color.BLACK));//making a knight piece
  gettingBoard.add(new Location(0, 6), new Knight(Color.BLACK));
  gettingBoard.add(new Location(0, 2), new Bishop(Color.BLACK));//making a bishop piece
  gettingBoard.add(new Location(0, 5), new Bishop(Color.BLACK));
  gettingBoard.add(new Location(0, 4), new King(Color.BLACK));//making a king piece
  gettingBoard.add(new Location(0, 3), new Queen(Color.BLACK));//making a queen piece
  gettingBoard.show();//display gettingBoard world with all the pieces set with the correct color and location 
}