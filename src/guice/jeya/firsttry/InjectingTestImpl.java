package guice.jeya.firsttry;

import com.google.inject.Inject;

public class InjectingTestImpl implements InjectingTest{
	@Inject
	Jeya jeya;
	
	public void print() {
		// TODO Auto-generated method stub
		jeya.print("Print from InjectingTest");
	}
}
