package practice;

public class IfCondition {
boolean a;


	public static void main(String[] args) {
		boolean a;
		int value;
		//The local variable a may not have been initialized
		//System.out.println(a);

		IfCondition condition = new IfCondition();
		System.out.println(condition.a);
		
		/*if(value=1) {
			System.out.println("in IF");
		}else {
			System.out.println("in else");
		}*/
		
		if(a=true){
		System.out.println("In if");
		}
		else{
			System.out.println("In else");
		}
		System.out.println(a=true);
		int i;
		System.out.println(i=2);
		
	}

}
