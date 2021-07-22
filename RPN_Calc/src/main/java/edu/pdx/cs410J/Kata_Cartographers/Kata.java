package edu.pdx.cs410J.Kata_Cartographers;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {


  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Missing Command Line!");
      System.exit(1);
    }
    Queue<String> Operation = new LinkedList<String>();
    Stack<String> result = new Stack<>();
    for (String arg : args) {
      Operation.offer(arg);
    }
    while (!Operation.isEmpty()) {
      String s = Operation.poll();
      int number1;
      int number2;
      switch (s) {
        case "+":
          if (result.peek().contains("max")) {
            number1 = Integer.parseInt(result.pop().substring(3));
          } else {
            number1 = Integer.parseInt(result.pop());
          }
          if (result.peek().contains("max")) {
            number2 = Integer.parseInt(result.pop().substring(3));
          } else {
            number2 = Integer.parseInt(result.pop());
          }
          result.push(String.valueOf(number1 + number2));
          break;
        case "-":
          if (result.peek().contains("max")) {
            number1 = Integer.parseInt(result.pop().substring(3));
          } else {
            number1 = Integer.parseInt(result.pop());
          }
          if (result.peek().contains("max")) {
            number2 = Integer.parseInt(result.pop().substring(3));
          } else {
            number2 = Integer.parseInt(result.pop());
          }
          result.push(String.valueOf(number2 - number1));
          break;
        case "*":
          if (result.peek().contains("max")) {
            number1 = Integer.parseInt(result.pop().substring(3));
          } else {
            number1 = Integer.parseInt(result.pop());
          }
          if (result.peek().contains("max")) {
            number2 = Integer.parseInt(result.pop().substring(3));
          } else {
            number2 = Integer.parseInt(result.pop());
          }
          result.push(String.valueOf(number1 * number2));
          break;
        case "/":
          if (result.peek().contains("max")) {
            number1 = Integer.parseInt(result.pop().substring(3));
          } else {
            number1 = Integer.parseInt(result.pop());
          }
          if (result.peek().contains("max")) {
            number2 = Integer.parseInt(result.pop().substring(3));
          } else {
            number2 = Integer.parseInt(result.pop());
          }
          result.push(String.valueOf(number2 / number1));
          break;
        case "SQRT":
          if (result.peek().contains("max")) {
            number1 = Integer.parseInt(result.pop().substring(3));
          } else {
            number1 = Integer.parseInt(result.pop());
          }

          result.push(String.valueOf(Math.sqrt(number1)));
          break;
        case "MAX":
          int max = 0;
          Stack<String> help = new Stack<>();
          while (!result.isEmpty()) {
            String temp;
            temp = result.pop();
            if (!temp.contains("max")) {
              number1 = Integer.parseInt(temp);
              if (number1 > max) {
                max = number1;
              }
            } else {
              help.push(temp);
            }

          }

          while (!help.isEmpty()) {
            result.push(help.pop());
          }
          result.push(String.valueOf("max" + max));
          break;
        default:
          //System.out.println(s);
          result.push(s);
          break;
      }
      //System.out.println("stack:" + result);
    }
    if (result.peek().contains("max")) {
      String temp = result.pop().substring(3);
      System.out.println(temp);
      System.exit(0);
    }
    System.out.println(result.peek());
    System.exit(0);
  }
}