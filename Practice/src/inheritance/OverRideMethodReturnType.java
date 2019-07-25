package inheritance;

public class OverRideMethodReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		i= foo();
		System.out.println(i);
	}
private static int foo() {
	// TODO Auto-generated method stub
	int i=20;
	return i;
	
	//C c = new D();
	//c.foo();

	}
}


class Z{
	
	
}


class A extends Z{
	
	
}

class B extends A{
	
	
}


class C{
	
	public A foo() {
		 int i=6;
		
		return new A();
	}
}

class D extends C{
	
	public B foo() {
		return new B();
	}
}


