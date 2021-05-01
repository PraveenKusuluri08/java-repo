package SimplePrograms;
import java.util.*;
public class ReverseNumber {
  public static void main(String[]args){
    Scanner scan = new Scanner (System.in);
    int rem=0,rev=0;
    System.out.println("Enter the number to reverse");
    int n = scan.nextInt();
    scan.close();

    if(n!=0){
    while(n>0){
      rem = n%10;
      rev=rev*10+rem;
      n/=10;
      System.out.println("Reverse value in the loop " + rev);
      System.out.println("The value of n "+n);
      System.out.println("the value of rem "+ rem);
    }
    System.out.println("The reversed number is " + rev);
  }
  else{
    System.out.println("Enter the nuber except Zero");
  }
    
  }
}
