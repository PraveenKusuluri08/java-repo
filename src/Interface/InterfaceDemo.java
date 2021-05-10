package Interface;

abstract class Writer {
	public abstract void write();
}

class pen extends Writer {
	public void write() {
		System.out.println("I'm Pen");
	}
}

class pencil extends Writer {
	public void write() {
		System.out.println("I'm Pencil");
	}
}

class kit {
	public void getData(Writer penandpencil) {
		penandpencil.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		kit k = new kit();
		Writer p = new pen();
		Writer pencil = new pencil();
		k.getData(pencil);
	}

}
