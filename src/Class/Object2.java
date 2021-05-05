package Class;

public class Object2 {

	public static void main(String[] args) {
		Object1 box= new Object1();
		box.height=12.2432;
		box.weight=23.222;
		box.depth=14.1211;
		box.volume=box.height*box.weight*box.depth;
		System.out.println(box.volume);

	}

}
