/*
This is a test class LotteryTestA, that creates one lottery GUI, and then just
one instance of each type of Person. All this kinds of Persons are added to
the GUI.
Your program should not make any machines, racks or balls, as they would be
distractions  from  the  test. Test  programs  should  generally contain
the  minimum  needed  to perform the test. You also do not need to have
any delays in your program.
*/
public class LotteryTestA
{
  public static void main(String[] args)
  {
    SpeedController speedController
      = new SpeedController(SpeedController.HALF_SPEED);

    LotteryGUI gui = new LotteryGUI("TV Studio - A", speedController);

    // 1st type of Person
    Punter punter = new Punter("Ian Arushfa Rishly Ving");
    gui.addPerson(punter);
    // 2nd type of Person
    AudienceMember audienceMember = new AudienceMember("Norma Lurges");
    gui.addPerson(audienceMember);
    // 3rd type of Person
    Director director = new Director("Mr. Boss-everywhere");
    gui.addPerson(director);
    // 4th type of MoodyPerson
    CleverPunter cleverPunter = new CleverPunter("Goose Wayne");
    gui.addPerson(cleverPunter);
    // 5th type of Person
    Worker worker = new Worker("Mr. nobody");
    gui.addPerson(worker);
    // 6th type of MoodyPerson
    Teenager teenager = new Teenager("Pewdiepie");
    gui.addPerson(teenager);
    // 7th type of Worker
    Worker trainee = new TraineeWorker("Mr. nobody2.0", 0);
    gui.addPerson(trainee);
    // 8th type of Person
    Psychic psychic = new Psychic("Ms. I-see-your-future");
    gui.addPerson(psychic);
    // 9th type of Person
    TVHost tvHost = new TVHost("Dr. Phil");
    gui.addPerson(tvHost);


  } // main
} // LotteryTestA
