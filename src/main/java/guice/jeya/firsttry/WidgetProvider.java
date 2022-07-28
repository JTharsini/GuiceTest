package guice.jeya.firsttry;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class WidgetProvider implements Provider<Widget> {
	final Service service;
	
	@Inject
	WidgetProvider(Service service)
	{
		this.service = service;
	}
	
	@Override
	public Widget get() {
		return new Widget(service);
	}
}