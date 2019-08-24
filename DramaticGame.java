/*
Create a new class DramaticGame which is a subclass of Game. This should
override makeMachine() with one which returns an instance of DramaticMachine.
*/
public class DramaticGame extends Game
{
  public DramaticGame(String machineName, int machineSize,
                      String rackName, int rackSize)
  {
    super(machineName, machineSize, rackName, rackSize);
  } // Game

  public Machine makeMachine(String machineName, int machineSize)
  {
    return new DramaticMachine(machineName, machineSize);
  } // makeMachine
} // DramaticGame
