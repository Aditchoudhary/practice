package package2;

import practice.AccessModifier;

public class Modfier2 extends AccessModifier{
	
	
	public static void method(){

	AccessModifier accessModifier = new AccessModifier();
	
	//System.out.println(accessModifier.defaultname);
	//The field AccessModifier.name is not visible
	
	System.out.println(accessModifier.publicname);
	//The field accessModifier.publicname is visible
	
	//System.out.println(accessModifier.protectedName);
	//The field AccessModifier.protectedName is not visible
	
	//System.out.println(accessModifier.getDefaultname());
	
	System.out.println(accessModifier.getPublicname());
	
	System.out.println(accessModifier.getPublicname());
	}
}
