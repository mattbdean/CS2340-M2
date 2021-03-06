package edu.gatech.oad.antlab.person;


/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string
 *
 *  @author Bob
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
      char[] name = input.toCharArray();
      String val = "";
      if (name.length >= 2) {
        char first = name[0];
        char second = name[1];
        for (int i = 2; i < name.length; i++) {
          name[i - 2] = name[i];
        }
        name[name.length - 2] = first;
        name[name.length - 1] = second;
        for (int i = 0; i < name.length; i++) {
          val += name[i];
        }
        return val;
    } else if (name.length == 1) {
        return input;
    }
	  //Person 1 put your implementation here
	  return null;
	}

	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
