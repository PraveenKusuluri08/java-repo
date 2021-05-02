package methods;

class calc {
  int n1, n2;
  String operation;

  public calc() {
    n1 = 0;
    n2 = 0;
    operation = "----------";
    System.out.println("The values are " + n1 + " "  + n2 + " " + operation);
  }

  public calc(int n1) {
    this.n1 = n1;
    n2 = 0;
    operation = "----------";
    System.out.println("The values are " + n1 + " "  + n2 + " " + operation);
  }

  public calc(int n1,int n2) {
    this.n1 = n1;
    this.n2 = n2;
    operation = "----------";
    System.out.println("The values are " + n1 + " "  + n2 + " " + operation);
  }

  public calc(int n1,int n2,String operation) {
    this.n1 = n1;
    this.n2 = n2;
    this.operation = "Praveen";
    System.out.println("The values are " + n1 + " "  + n2 + " " + operation);
  }
}

public class overLoadingConstructor {
      public static void main(String[]args){
        calc obj=new calc(1);
       
      }
}
