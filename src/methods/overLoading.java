package methods;

class casio {
  public void add(int n1, int n2) {
    System.out.println(n1 + n2);
  }
  public void add(int n1, int n2,int n3) {
    System.out.println(n1 + n2+n3);
  }
  public void add(float n1, float n2) {
    System.out.println(n1 + n2);
  }
  public void add(double n1, double n2) {
    System.out.println(n1 + n2);
  }
 
}

public class overLoading {
  public static void main(String[] args) {
    casio obj = new casio();
    obj.add(5, 6);
    obj.add(5, 6,7);
    obj.add(5.9, 6.8);
    obj.add(5.464, 6.775);
  }
}
