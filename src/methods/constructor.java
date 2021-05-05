package methods;

class Cal {
  int n1, n2;

  public Cal(int n1, int n2) {

    this.n1 = n1;
    this.n2 = n2;
  }
}

public class constructor {
  public static void main(String[] args) {
    Cal obj = new Cal(2, 5);

    System.out.println("The value in the constructor " + obj.n1);
    System.out.println("The value in the constructor " + obj.n2);

  }
}
