package guice.jeya.firsttry;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {
	@Override
	protected void configure() {
		//this.bind(Jeya.class).to(JeyaImpl.class);
		this.bind(JeyaImpl.class).asEagerSingleton();
	}

}
