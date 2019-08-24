import java.awt.Color;

/*
 * A kind of person.
 */

public class TVHost extends Person
{
  // Constructor is given the person's name.
  public TVHost(String name)
  {
    super(name);
  }  // TVHost


  // Returns the name of the type of Person.
  public String getPersonType()
  {
    return "TV Host";
  } // getPersonType


  // Returns the Person's colour.
  public Color getColour()
  {
    return Color.pink;
  } // getColour


  // Returns the Person's current saying.
  public String getCurrentSaying()
  {
    return "Welcome, suckers!";
  } // getCurrentSaying

  // getClassHierarchy() method which will return the type of TVHost
  // next to superclasses' type (in this case 'Person')
  public String getClassHierarchy()
  {
    return getPersonType() + ">" + super.getClassHierarchy();
  } // getClassHierarchy

} // class TVHost
