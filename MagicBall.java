import java.awt.Color;
/*
Normal. It behaves just like an ordinary ball.
•Invisible. It cannot be seen.
•Flashing. It keeps flashing all the time.
•Counting. It keeps flashing all the time, and its observable v
alue keeps changing each time it flashes. The value appears to count
from 0 to 99 and round again.  The actual value of the ball does not
change however, only the value returned by the getValue() method.
*/
public class MagicBall extends Ball
{
  // value 1: initial statue
  // value 2: it is not visible
  // value 3: it is flashing
  // value 4: it is flashing and is changing its value
  private int changingStateMagicBall = 1;

  // This is the actual value of the ball, it will change if the ball is in
  // counting mode.
  private final int initialValue;

  public MagicBall(int requiredValue, Color requiredColour)
  {
    super(requiredValue, requiredColour);
    initialValue = requiredValue;
  } // Ball

  public void doMagic(int spellNumber)
  {
    switch (spellNumber)
    {
      case 1: if (changingStateMagicBall < 4)
                changingStateMagicBall++;
              else if (changingStateMagicBall == 4)
                changingStateMagicBall = 1;
              getImage().update();
              break;
      case 2: changingStateMagicBall = 1;
              getImage().update();
              break;
    } // switch
  } // doMagic

  public boolean isVisible()
  {
    if (changingStateMagicBall == 2)
      return false;
    else
      return true;
  } // isVisible

  // If the state of the ball is 3 or 4 (as said in the handbook),
  // it will flash. (For the ball in state 4 it will also get different values)
  public boolean isFlashing()
  {
    if (changingStateMagicBall == 3 || changingStateMagicBall == 4)
      return true;
    else
      return false;
  } // isFlashing

  private int indexValue = 0;

  // To implement the counting state, ou will need to override this method
  public int getValue()
  {
    // If the ball is in the counting mode
    if (changingStateMagicBall == 4)
    {
      if (indexValue < 99)
         indexValue++;
       else
         indexValue = 0;
    } // if
    else
      indexValue = initialValue;

    return indexValue;
  } // getValue

  public MagicBallImage makeImage()
  {
    return new MagicBallImage(this);
  } // makeImage

} // MagicBall
