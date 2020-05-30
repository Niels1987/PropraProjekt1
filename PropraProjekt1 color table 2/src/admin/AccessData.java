package admin;

public class AccessData {
	
	// Attributes
	private static String usrname = "root";
	private static String password = "root";
	
	// Methods
	public static String getUsrname() {
		return usrname;
	}
	
	public static void setUsrname(String name) {
		usrname = name;
	}
	
	public static void setPassword(String pswd) {
		password = pswd;
	}
	
	public static boolean chekUsrname(String name) {
		if (name.equals(usrname)) {
			return true;
		}
		return false;
	}
	
	public static boolean checkPassword(String pswd) {
		if (pswd.equals(password)) {
			return true;
		}
		return false;
	}
}
