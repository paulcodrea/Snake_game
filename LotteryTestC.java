import java.awt.Color;
/*
Create a test class, LotteryTestC, containing a main() method.
This should simply create one lottery GUI, and then create a game
with a small machine and a rack, and insert them into
the GUI. It should then insert a small number of magic balls in
to the machine. These can then be tested by left clicking on them.
*/
public class LotteryTestC
{
  public static void main(String[] args)
  {
    SpeedController speedController
      = new SpeedController(SpeedController.HALF_SPEED);

    LotteryGUI gui = new LotteryGUI("TV Studio - C", speedController);

    Game game = new Game("Super Jack", 28,
                         "Slippery's Mile", 4);
    gui.addGame(game);

    // To add the MagicBalls we need the colors (from Worker.java)
    Color [] colour
      = new Color [] {Color.red, Color.orange, Color.yellow,
                      Color.green, Color.blue, Color.pink,
                      Color.magenta};

    // Using a loop to create the MagicBalls into the field
    for (int count = 1; count <= game.getRackSize(); count ++)
    {
      game.machineAddBall(new MagicBall(count, colour[count]));
      speedController.delay(40);
    } // for
  } // main

} // LotteryTestA
