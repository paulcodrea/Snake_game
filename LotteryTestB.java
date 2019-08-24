/*
This should simply create
one lottery GUI, and then create a dramatic game, and insert it into the GUI.
It should then fill up the game’s machine with a number of balls (feel free
to get a worker to do this – you would not need to add him or her to the GUI)
and then eject a number of balls until the rack is full. You probably want
to have a delay before each eject. Having any other actions (e.g. more persons,
more machines) would be a distraction.
*/
public class LotteryTestB
{
  public static void main(String[] args)
  {
    SpeedController speedController
      = new SpeedController(SpeedController.HALF_SPEED);

    LotteryGUI gui = new LotteryGUI("TV Studio - B", speedController);

    DramaticGame dramaticGame = new DramaticGame("Super Dramatic Jack", 49,
                                                 "Slippery's Mile", 7);
    gui.addGame(dramaticGame);

    // The worker will fill the machine
    Worker worker = new Worker("Mr. nobody");
    worker.fillMachine(dramaticGame);

    // Using a loop to eject the number of balls that are inserted (in this
    // case, 7 balls)
    for (int count = 1; count <= dramaticGame.getRackSize(); count ++)
    {
      dramaticGame.ejectBall();
      speedController.delay(40);
    } // for
  } // main

} // LotteryTestA
