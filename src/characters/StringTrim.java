package characters;

public class StringTrim {
	 
	
	
	public static void main(String[] args) {
//		String trim
			String str=" Hello world     wedwewq";
//		first approach
//			we can use replace and replaceAll 
		String str1 = str.replace(" ", "");
		String str2 =str1.replaceAll("\s","");
		System.out.println(str1);
		System.out.println(str2);
	}

}
