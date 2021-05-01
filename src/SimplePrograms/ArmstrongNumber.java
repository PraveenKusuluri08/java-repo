package SimplePrograms;

import java.util.*;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number to check whether the number is armstrong number ");
    int number = scan.nextInt();
    scan.close();

    int rem = 0, cube = 0;
    int temp = number;

    while (number > 0) {
      rem = number % 10;
      number /= 10;
      cube = cube + (rem * rem * rem);
    }

    if (temp == cube) {
      System.out.println("The give number is armstrong number");
    } else {
      System.out.println("not armstrong number");
    }
  }
}
