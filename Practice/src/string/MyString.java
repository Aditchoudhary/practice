package string;

import java.util.Arrays;

public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Month1 = new String("Jan");
		//Month = "Feb";
		String Month = Month1;
		switch (Month) {
		case "Jan":
			System.out.println(" in jan month");
			break;
		case "Feb":
			System.out.println(" in feb month");
			break;
		default:
			break;
		}
		

		
		System.out.println(foo());
	}
	
	public static int foo() {
		//String s = "a";
		//System.out.println(Integer.parseInt(s));
		
		try {
			
			Object[] arr = new Object[]{"adit",3,4};
			System.out.println(arr);
			System.out.println(Arrays.deepToString(arr));
			
			
			
			
			return 21;	
		} 
		catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			return 23;
		}
		
	}
	

}
