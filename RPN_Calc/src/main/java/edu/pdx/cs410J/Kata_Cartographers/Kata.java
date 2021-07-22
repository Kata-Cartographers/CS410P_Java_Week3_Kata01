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
    Stack<String> myOperatorStack = new Stack<String>();
    Stack<Integer> myOperandStack = new Stack<Integer>();
    String tempStr = null;
    Integer tempInt = null;

    //STAGE INPUT PROCESSING
    for (String str : args) {
      myStack.push(str);
    }

    while(!myStack.isEmpty())
    {
      tempStr = myStack.peek();
      //OPERATOR CHECK
      if(tempStr.equalsIgnoreCase("/")
        || tempStr.equalsIgnoreCase("*")
        || tempStr.equalsIgnoreCase("-")
        || tempStr.equalsIgnoreCase("+")
        || tempStr.equalsIgnoreCase("SQRT")
        || tempStr.equalsIgnoreCase("MAX"))
      {
        //tempStr = myStack.pop();
        //myOperatorStack.push(tempStr);
        myOperatorStack.push(myStack.pop()); //adding the operator
      }
      //OPERAND CHECK
      else {
        try {
          tempInt = Integer.parseInt(tempStr); //parsing the int, throwing except if needed
          myStack.pop(); //getting rid of the copy on the stack
          myOperandStack.push(tempInt); //adding the operand
        }
        catch (NumberFormatException e) {
          //disabled since maybe we don't want this happening every time
          //we get something unexpected, just keeping it silent right now
          System.err.println("Error, operand "+tempStr+" is not a number?");
        }
      }
    }
    while(!myOperatorStack.isEmpty())
    {
      tempStr = myOperatorStack.peek();
      //DIVISION
      if(tempStr.equalsIgnoreCase("/"))
      {
        if(myOperandStack.size() > 1)
        {
          return myOperandStack.pop() / myOperandStack.pop();
        }
      }
    }

    return 1;
  }
}