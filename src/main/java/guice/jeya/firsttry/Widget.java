package guice.jeya.firsttry;

public class Widget {
	Service service;
	Widget(Service service)
	{
		this.service = service;
	}
	
	public void print() {
		service.print();
	}
}