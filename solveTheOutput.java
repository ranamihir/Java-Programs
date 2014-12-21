class A{
	int a;
	int b;
	
	void ab(A a){
		a.a = 10;
		a.b = 20;
		
		System.out.println(this.a);		// 112
		System.out.println(this.b);		// 45
		a.cd(this);
	}
	
	void cd(A a){
		A a1 = a;
		a = null;
		a1.a += 40;				// a1.a = 152
		a1.b += 50;				// a1.b = 95
		
		System.out.println(a1.a);		// 152
		System.out.println(a1.b);		// 95
		
		System.out.println(this.a);		// a.a(= 10)
		System.out.println(this.b);		// a.b(= 20)
	}
}

public class solveTheOutput{
	public static void main(String[] args){
		A a1 = new A();
		a1.a = 112;
		a1.b = 45;
		a1.ab(new A());
	}
}

/*
	Output:
	112
	45
	152
	95
	10
	20
 */