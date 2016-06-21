package guice.jeya.firsttry;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {
	@Override
	protected void configure() {
		this.bind(Jeya.class).to(JeyaImpl.class);
		this.bind(InjectingTest.class).to(InjectingTestImpl.class);
		this.bind
		(InterfaceToImplementByManyClasses.class).annotatedWith
		(AnnotationToImpl1.class).to
		(InterfaceToImplementByManyClassesImpl1.class);
		
		this.bind
		(InterfaceToImplementByManyClasses.class).annotatedWith
		(AnnotationToImpl2.class).to
		(InterfaceToImplementByManyClassesImpl2.class);
		//this.bind(JeyaImpl.class).asEagerSingleton();
	}

}
