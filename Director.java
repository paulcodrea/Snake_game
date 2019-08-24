import java.awt.Color;

/*
 * A kind of person.
 */

public class Director extends Person
{
  // Constructor is given the person's name.
  public Director(String name)
  {
    super(name);
  }  // Director


  // Returns the name of the type of Person.
  public String getPersonType()
  {
    return "Director";
  } // getPersonType


  // Returns the Person's colour.
  public Color getColour()
  {
    return Color.gray;
  } // getColour


  // Returns the Person's current saying.
  public String getCurrentSaying()
  {
    return "This business is MY pleasure";
  } // getCurrentSaying

  // getClassHierarchy() method which will return the type of Director
  // next to superclasses' type (in this case 'Person')
  public String getClassHierarchy()
  {
    return getPersonType() + ">" + super.getClassHierarchy();
  } // getClassHierarchy

} // class Director
