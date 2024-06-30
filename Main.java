import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Java Refresher");
    try (Scanner readInput = new Scanner(System.in)) {
      System.out.println("Please enter the first number: ");
      long num1 = readInput.nextLong();
      System.out.println("Please enter the second number: ");
      long num2 = readInput.nextLong();
      System.out.println("The sum of the two numbers is: " + sum(num1, num2));
    }
  }

  private static long sum(long num1, long num2) {
    return num1 + num2;
  }
}