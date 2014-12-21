class A{
	protected A(){
		System.out.println("Constructor of A called.");
	}
}

class B extends A{
	protected B(){
		System.out.println("Constructor of B called.");
	}
}

public class constructorAccess{
	public static void main(String[] args){
		B b = new B();				// DOUBT: How is this program complied successfully? Constructor B() is protected,
	}							// so it should not be accessible in constructorAccess class.
}