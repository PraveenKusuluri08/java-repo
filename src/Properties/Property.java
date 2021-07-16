package Properties;
import java.util.*;
public class Property {

	public static void main(String[] args) {
		
		Properties pt = new Properties();
		pt.put("mongodb","noSql");
		pt.put("firebase","noSql");
		pt.put("mySql","Sql");
		pt.put("dynamoDb","noSql");
		
		Set<?> st = pt.keySet();
		
		for(Object ob: st) {
			System.out.println(ob +" Data Bases "+pt.getProperty((String) ob));
		}
	}

}
