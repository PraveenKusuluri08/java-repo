package SimplePrograms;
import java.util.*;
public class Factorial {
  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter the number to print Factorial");
    int n=scan.nextInt();
    scan.close();
    int fact=1;
    for(int i=1;i<=n;i++)
    {
      fact*=i;
    }
    System.out.println("The factorial of the number is " + fact);
  }
}
