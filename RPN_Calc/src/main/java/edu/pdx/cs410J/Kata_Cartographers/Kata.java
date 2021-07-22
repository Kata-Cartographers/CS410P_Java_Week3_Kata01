package edu.pdx.cs410J.Kata_Cartographers;
import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {


  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public static int calc(String[] args) {
    Stack<String> myStack = new Stack<String>();

    //STAGE INPUT PROCESSING
    for(String str : args)
    {
      myStack.add(str);
    }

    //STAGE OPERATOR CHECK

    //STAGE OPERAND CHECK
    return 1;
  }
}