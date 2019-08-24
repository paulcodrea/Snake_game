/*
In a dramatic machine, a ball will be picked at random, then, starting
with the first ball in the machine, each ball will be flashed in turn,
until the one to be ejected is reached.At that point, the chosen ball
will be flashed and ejected as before.
*/
public class DramaticMachine extends Machine
{
  public DramaticMachine(String name, int size)
  {
    super(name, size);
  } // DramaticMachine

  public String getType()
  {
    return "Dramatic Lottery Machine";
  } // getType

  public Ball ejectBall()
  {
    if (getNoOfBalls() <= 0)
      return null;
    else
    {
      // Math.random() * getNoOfBalls yields a number
      // which is >= 0 and < number of balls.
      int ejectedBallIndex = (int)(Math.random() * getNoOfBalls());

      // For loop to flash all the balls until the random ball that will be
      // ejected.
      for (int indexForBall = 0; indexForBall < ejectedBallIndex;
           indexForBall++)
        getBall(indexForBall).flash(4, 5);

      // The ball is ejected and it flashes
      Ball ejectedBall = getBall(ejectedBallIndex);
      ejectedBall.flash(4, 5);

      swapBalls(ejectedBallIndex, getNoOfBalls() - 1);
      removeBall();
      return ejectedBall;
    } // else
  } // ejectBall

} // DramaticMachine
