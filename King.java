//Jaz Harris
//King Class

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/*King can move in any of the nine adjacent spaces
 * but only if there isn't another piece of the same color
 * also needs to know how to do castle-king side
 */
public class King extends Critter
{
  