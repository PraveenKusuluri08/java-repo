package SimplePrograms;

import java.util.*;

public class Palindrome {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number to check whether it is palindrome or not : ");
    int number = scan.nextInt();
    scan.close();
    int sum = 0, rem = 0;
    int temp = number;

    while(number>0){
      rem=number%10;
      sum=(sum*10)+rem;
      number=number/10;
   //   System.out.println("The value of sum in the loop " + sum);
    }
   number =temp;
    if(temp==sum){
      System.out.println("The number is palindrome number");
    }
    else {
      System.out.println("The number is not palindrome");
    }
  }
}