import java.awt.Color;
/*
In this part you will improve the game by providing a magic worker.
This will be the same as a worker, except he or she will always create magic
balls whenever he or she is asked to make balls.
In addition, a magic worker will secretly keep track of all the balls he or
she has ever made, by storing a reference to them in an array.
You will need to extend this array if it gets full and another ball is made.
*/
public class MagicWorker extends Worker
{
  // Constructor that overrides the worker constructor
  public MagicWorker(String name)
  {
    super(name);
  } // MagicWorker

  private static final int INITIAL_ARRAY_SIZE = 10;
  private static final int ARRAY_RESIZE_FACTOR = 2;
  private int noOfItemsInArray = 0;
  private MagicBall[] trackOfBalls = new MagicBall[INITIAL_ARRAY_SIZE];

  // Returns a newly created MagicBall with the given number and colour.
  // It overrides the makeNewBall method of Worker class
  public MagicBall makeNewBall(int number, Color colour)
  {
    MagicBall someBall = new MagicBall(number, colour);
    extendMagicBallArray(someBall);
    return someBall;
  } // makeNewBall

  private void extendMagicBallArray(MagicBall someBall)
  {
    // If the array of MagicBalls is full is expanded
    if (noOfItemsInArray == trackOfBalls.length)
    {
      MagicBall[] biggerArray = new MagicBall[trackOfBalls.length
                                              * ARRAY_RESIZE_FACTOR];

      for (int index = 0; index < noOfItemsInArray; index++)
        biggerArray[index] = trackOfBalls[index];

      trackOfBalls = biggerArray;
    } // if

    // Keep a reference for the magic balls that in the field
    trackOfBalls[noOfItemsInArray++] = someBall;
  } // extendMagicBallArray

  // doMagic method that will invoke doMagic from MagicBall class
  public void doMagic(int spellNumber)
  {
    for (int index = 0; index < noOfItemsInArray; index++)
      trackOfBalls[index].doMagic(spellNumber);
  } // doMagic

  public MagicWorkerImage makeImage()
  {
    return new MagicWorkerImage(this);
  } // makeImage
  
  // getClassHierarchy() method which will return the type of MagicWorker
  // next to superclasses' type (in this case 'Worker')
  public String getClassHierarchy()
  {
    return "Magic Worker>" + super.getClassHierarchy();
  } // getClassHierarchy
} // MagicWorker
