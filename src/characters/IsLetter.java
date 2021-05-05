package characters;
import java.util.*;
public class IsLetter {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		String str1;
		System.out.println("Enter string");
		str1=scan.next();
		scan.close();
		System.out.println("Char at location of 3 - " + str1.charAt(3));
		
		//isLetter :The method determines whether the specified char value is a letter.
		String str2;
		str2=" checking p is letter " + Character.isLetter('p');
		System.out.println(str2 );
	}

}
