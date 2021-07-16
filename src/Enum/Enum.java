package Enum;

enum Mobile{
	APPLE,VIVO,SAMSUNG;
	
}
public class Enum {

	public static void main(String[] args) {
	
		Mobile obj = Mobile.APPLE;
		
		switch(obj) {
		case APPLE:
			System.out.println("The mobile is Apple ios");
			break;
		case VIVO:
			System.out.println("My mobile is vivo");
		}

	}

}
