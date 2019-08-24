public class LotteryTestD
{
  public static void main(String[] args)
  {
    SpeedController speedController
      = new SpeedController(SpeedController.HALF_SPEED);

    LotteryGUI gui = new LotteryGUI("TV Studio - test D", speedController);

    // Creates 2 magic workers, who will fill the grid with magic balls
    MagicWorker magicWorker1 = new MagicWorker("Rocky Flintstone");
    gui.addPerson(magicWorker1);
    speedController.delay(40);

    MagicWorker magicWorker2 = new MagicWorker("Belinda Blinked");
    gui.addPerson(magicWorker2);
    speedController.delay(40);

    // Creating 2 games
    Game game1 = new Game("My dad wrote this game", 16,
                          "Blinking", 4);
    gui.addGame(game1);

    Game game2 = new Game("Oh Magic Johnson", 36,
                          "Getting the ball", 6);
    gui.addGame(game2);

    // Filling the games with magic balls
    magicWorker1.fillMachine(game1);
    speedController.delay(40);

    magicWorker2.fillMachine(game2);
    speedController.delay(40);

    // Eject balls in the 1st game
    for (int count = 1; count <= game1.getRackSize(); count++)
    {
      speedController.delay(40);
      game1.ejectBall();
    } // for

    // Sort the magic balls in the 1st rack
    game1.rackSortBalls();
    speedController.delay(40);

    // Eject balls in the 2nd game
    for (int count = 1; count <= game2.getRackSize(); count++)
    {
      speedController.delay(40);
      game2.ejectBall();
    } // for

    // Sort the magic balls in the 2nd rack
    game2.rackSortBalls();
    speedController.delay(40);

  } // main
} // LotteryTestD
