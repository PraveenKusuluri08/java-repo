package characters;
import java.util.Arrays;
public class StringTrimNoLibrary {

	public static String stringSort(String input) {
		char[] str1 = input.toCharArray();
		Arrays.sort(str1);
		return new String(str1);
	}
	
	public static void main(String[] args) {
		String str = "Hello world";
		
		String str3 = stringSort(str);
		
		System.out.println(str3);
		

		
	}

}
