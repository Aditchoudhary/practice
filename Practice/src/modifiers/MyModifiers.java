package modifiers;

public class MyModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.foo();
		b.protectedValue = 3;
		A a = new A();
		a.foo();
		
		A ab = new B();
		ab.foo();
	}

}

class A {
	
	protected int protectedValue;
	protected void foo() {
		System.out.println("inside class A");
	}
}

class B extends A{
	
}