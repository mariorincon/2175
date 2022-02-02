
public class Telephone {
	
	public static boolean isFormatted(String phone) {
		//(XXX)XXX-XXXX
		if(phone.contains("(") || phone.contains("-")) {
			return true;
		}
		else
			return false;
	}
	
	public static String unformat(String phone) {
		
		String unformat = "";
		for(int i=0; i<phone.length(); i++) {
			char c = phone.charAt(i);
				if(Character.isDigit(c)){
				unformat += c;
				}				
		}
		return unformat;
	}
	
	public static String format(String phone) {
		
		String format = "(";
		format += phone.substring(0,3);
		format += ")";
		format += phone.substring(3,6);
		format += "-";
		format += phone.substring(6,10);
		
		return format;
	}

}
