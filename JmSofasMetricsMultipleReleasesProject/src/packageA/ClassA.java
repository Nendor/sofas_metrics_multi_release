package packageA;

public class ClassA {

	public void publicVoidMethod1ClassA(){
		
	}
	public void publicVoidMethod2ClassA(){
		privateVoidMethod1ClassA();
	}
	
	private void privateVoidMethod1ClassA(){
		System.out.println("");
	}
}
