package Interface;
//all the methods in the interface are public abstract
interface Writer {
	 void write();
}
class abc{
	
}

class pen extends abc implements Writer {
	public void write() {
		System.out.println("I'm Pen");
	}
}

class pencil implements  Writer {
	public void write() {
		System.out.println("I'm Pencil");
	}
}

class kit {
	public void getData(Writer penandpencil) {
		penandpencil.write();
	}
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		kit k = new kit();
		Writer p = new pen();
		Writer pencil = new pencil();
		k.getData(pencil);

	}

}
