package test4click;
import info.gridworld.gui.WorldFrame;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class MainTest extends JApplet
{
    private static final long serialVersionUID = -1524028465898073836L;

    public void init()
    {
        ClickerWorld hope = new ClickerWorld();
        
        JFrame frame = new WorldFrame<AdamAndEve>(hope);
  setSize(450, 450);
  setContentPane(frame.getContentPane());
  setJMenuBar(frame.getJMenuBar());
    }
}