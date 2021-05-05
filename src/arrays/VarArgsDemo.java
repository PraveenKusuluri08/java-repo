package arrays;

class Value {
	public int add(int... n) // for passing the more values do not including as the arguments
//	we use spread operator for passing more values and values return as array
//	variable length arguments
	{
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}

public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value obj = new Value();
		System.out.println(obj.add(12, 52, 3, 3, 5, 2, 4));

	}

}
