package packageA;

public class ClassB {
	public void publicVoidMethod1ClassB() {
		ClassA ca = new ClassA();
		ca.publicVoidMethod1ClassA();
	}

	public void publicVoidMethod2ClassB() {
		ClassA ca = new ClassA();
		ca.publicVoidMethod2ClassA();
		ca.publicVoidMethod2ClassA();
	}
}
