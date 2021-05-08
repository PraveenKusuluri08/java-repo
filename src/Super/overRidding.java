package Super;


class AA
{
	public void show() {
		System.out.println("Heloo from A ");
	}
}
class BB extends AA{
//	@Override
	public void show() {
	//	super.show();
		System.out.println("Heloo from B ");
	}
}
public class overRidding {

	public static void main(String[] args) {
		
		AA obj = new BB();
		obj.show();
	}

}
