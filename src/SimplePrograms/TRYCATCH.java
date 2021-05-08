package SimplePrograms;

public class TRYCATCH {

	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		try {
			System.out.println("try block" + a[9]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
