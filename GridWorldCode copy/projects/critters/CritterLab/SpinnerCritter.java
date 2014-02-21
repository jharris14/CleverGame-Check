//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaz Harris
//Date - 12/18/13
//Lab  - Spinner Critter

import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class SpinnerCritter extends Critter
{
  //processActors will make each actor around this actor move to the left
  public void processActors(ArrayList<Actor> actors)
  {
    Location[] locs = new Location[8];//making a new Array to hold the old positions
    Actor[] holdActors = new Actor[8];// making a new Array to hold the old actors
    for(int i = actors.size() - 1; i >=0; i--)//for loop to go through each index 
    {
      locs[i] = actors.get(i).getLocation();//storing the locations
    }
    for(int k = actors.size() - 1; k > 0; k--)//loop through all of the arraylist
    {
      if(actors.get(k) != null)
      {
        if(actors.get(k) instanceof Rock)//if the actor is a rock at this index
        {
          actors.get(k).moveTo(locs[k]);//move it back to the original place
        }
        else//otherwise if the actor is not a rock or null
        {
          if(!(actors.get(k - 1) instanceof Actor))//if there's a rock or blank in the desired move spot
          {
            actors.get(k - 1).removeSelfFromGrid();//to make sure the rock is removed if there is one there
            if(k > 0)//shifting locs then moving the actor to the new location
            {
              actors.get(k).moveTo(locs[k-1]);
            }
          }
            else//if it's the first location, move to the last location
            {
              if(!(actors.get(k - 1) instanceof Actor))
              {
              actors.get(k).moveTo(locs[8]);
              }
            }
          }
        }
      }
    }
  }
