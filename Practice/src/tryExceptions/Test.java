package tryExceptions;

import java.util.LinkedList;
import java.util.List;

public class Test {

	static LinkedList<Integer> lt = new LinkedList<>();
	
	public static void main(String[] args) {
		lt.add(1);
		List<Integer>  li = getList();
		li.remove(0);
		
		List<Integer>  lt = getList();
		System.out.println(lt.size());
		
	
	}
	
	public static List<Integer> getList(){
		
		return lt;
	}
	
}
