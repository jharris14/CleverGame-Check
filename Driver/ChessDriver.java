//Nolan Chung && Jaz Harris
//Chess Driver


import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Scanner;

public static class ChessDriver
{
  ActorWorld gettingBoard = new ActorWorld(new BoundedGrid(8,8));//making the chess board
  gettingBoard.add(new Location(6, 0), new Pawn(white));//making a pawn piece setting it at the right location & color
  gettingBoard.add(new Location(6, 1), new Pawn(white));
  gettingBoard.add(new Location(6, 2), new Pawn(white));
  gettingBoard.add(new Location(6, 3), new Pawn(white));
  gettingBoard.add(new Location(6, 4), new Pawn(white));
  gettingBoard.add(new Location(6, 5), new Pawn(white));
  gettingBoard.add(new Location(6, 6), new Pawn(white));
  gettingBoard.add(new Location(6, 7), new Pawn(white));
  gettingBoard.add(new Location(7, 0), new Rook(white));//making a rook piece
  gettingBoard.add(new Location(7, 7), new Rook(white));
  gettingBoard.add(new Location(7, 1), new Knight(white));//making a knight piece
  gettingBoard.add(new Location(7, 6), new Knight(white));
  gettingBoard.add(new Location(7, 2), new Bishop(white));//making a bishop piece
  gettingBoard.add(new Location(7, 5), new Bishop(white));
  gettingBoard.add(new Location(7, 4), new King(white));//making a king piece
  gettingBoard.add(new Location(7, 3), new Queen(white));//making a queen piece
  gettingBoard.add(new Location(1, 0), new Pawn(black));//making the black pieces
  gettingBoard.add(new Location(1, 1), new Pawn(black));
  gettingBoard.add(new Location(1, 2), new Pawn(black));
  gettingBoard.add(new Location(1, 3), new Pawn(black));
  gettingBoard.add(new Location(1, 4), new Pawn(black));
  gettingBoard.add(new Location(1, 5), new Pawn(black));
  gettingBoard.add(new Location(1, 6), new Pawn(black));
  gettingBoard.add(new Location(1, 7), new Pawn(black));
  gettingBoard.add(new Location(0, 0), new Rook(black));//making a rook piece 
  gettingBoard.add(new Location(0, 7), new Rook(black));
  gettingBoard.add(new Location(0, 1), new Knight(black));//making a knight piece
  gettingBoard.add(new Location(0, 6), new Knight(black));
  gettingBoard.add(new Location(0, 2), new Bishop(black));//making a bishop piece
  gettingBoard.add(new Location(0, 5), new Bishop(black));
  gettingBoard.add(new Location(0, 4), new King(black));//making a king piece
  gettingBoard.add(new Location(0, 3), new Queen(black));//making a queen piece
  gettingBoard.show();
}