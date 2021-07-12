package DATE;
import java.util.*;
public class Date {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		System.out.println("Curent date is "+cl.getTime());
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter day");
		int dd = scn.nextInt();
		System.out.println("Enter month");
		
		int mm = scn.nextInt();
		
		System.out.println("Enter year");
		int yy= scn.nextInt();
		scn.close();
		System.out.println(findDate(mm,dd,yy));
	}
	
	public static String findDate(int mm,int dd,int yy) {
		Calendar cl = Calendar.getInstance();
		cl.set(Calendar.MONTH, mm-1);
		cl.set(Calendar.DAY_OF_MONTH, dd);
		cl.set(Calendar.YEAR, yy);
		return cl.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.ENGLISH).toUpperCase();
	}

}
