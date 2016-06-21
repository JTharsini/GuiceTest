package guice.jeya.firsttry;

import com.google.inject.Inject;

public class InjectingTestImpl implements InjectingTest{
	@Inject
	Jeya jeya;
	
	@Inject @AnnotationToImpl1
	InterfaceToImplementByManyClasses impl1;
	
	@Inject @AnnotationToImpl2
	InterfaceToImplementByManyClasses impl2;
	
	public void print() {
		// TODO Auto-generated method stub
		jeya.print("Print from InjectingTest");
	}

	@Override
	public void printImpl1() {
		// TODO Auto-generated method stub
		impl1.print();
	}

	@Override
	public void printImpl2() {
		// TODO Auto-generated method stub
		impl2.print();
	}
}
