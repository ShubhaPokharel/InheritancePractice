class A{   //parent class
	void money(){
		System.out.println("1 million dollars"); 
	}	
}
class B extends A{  //child class
	void clothes(){
		System.out.println("The child gets clothes");
	}

	public static void main(String[] args){
		A a = new A();
		a.money();  //this gets parent class property only
		// check what it prints out
		System.out.println("*******************************");
		B b = new B();
		b.money();

	}
}
