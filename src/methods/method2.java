package methods;
import java.util.*;
public class method2 {
  static void even(int n){
      if(n%2==0){
       System.out.println("even number");
      }
      else {
        System.out.println("Odd number");
      }
  }
  // Prime number or not
  static void Prime(int n){
    int i,count=0;
    for(i=1;i<=n;i++){
      if(n%i==0){
        count++;
      }
    }
    if(count==2){
      System.out.println("The number Prime number");
    }
    else{
      System.out.println("the number is not prime");
    }
  }

  // perfect number or not
static void Perfect(int n){
  int sum=0;
  int i,rem;
  for(i=1;i<n;i++){
    rem=n%i;
    if(rem==0){
      sum=sum+i;
    }
  }
  if(sum==n){
    System.out.println("The number is perfect number");
  }
  else {
    System.out.println("The number is not perfect");
  }
}
// Palindrome number or not
static void Palindrome(int n){
  int rem=0,rev=0;
  int temp=n;
  while(n>0){
    rem=n%10;
    rev=(rev*10)+rem;
    n/=10;
  }
  String result = (temp==rev) ? "Palindrome number" : "not Palindrome number";
  System.out.println("The Number is " + result);
}

// Armstrong number or not
static void ArmstrongNumber(int n){
  int rem,cube=0;
  int temp =n;
  while(n!=0){
    rem=n%10;
    n=n/10;
    cube=cube+(rem*rem*rem);
  }
  String result =(temp==cube) ? "Armstrong number" : "Not Armstrong number";
  System.out.println("The  number is " + result);
}

  public static void main(String[]args){
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter any number");
    int n =scan.nextInt();
    scan.close();
    System.out.println("The number is ");
    System.out.println("-------------------------");
    even(n);
    Prime(n);
    Perfect(n);
    Palindrome(n);
    ArmstrongNumber(n);
    System.out.println("--------------------------");
  }

}



