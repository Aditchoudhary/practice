package practice;

import package2.Modfier2;

public class AccessModifier {

	String defaultname;
	public String publicname;
	protected String protectedName;
	
	 String getDefaultname() {
		return defaultname;
	}

	 void setDefaultname(String defaultname) {
		this.defaultname = defaultname;
	}

	public String getPublicname() {
		return publicname;
	}

	public void setPublicname(String publicname) {
		this.publicname = publicname;
	}

	protected String getProtectedName() {
		return protectedName;
	}

	public void setProtectedName(String protectedName) {
		this.protectedName = protectedName;
	}

	public static void main(String[] args) {
		Modfier2.method();
	}

}
