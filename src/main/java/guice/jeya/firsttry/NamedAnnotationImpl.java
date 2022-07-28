package guice.jeya.firsttry;

import java.lang.annotation.Annotation;

import com.google.common.base.Preconditions;
import com.google.inject.name.Named;

public class NamedAnnotationImpl implements Named{
	private final String value;

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return Named.class;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return value;
	}

	 public NamedAnnotationImpl(String value)
	 {
		 this.value = (String)(Preconditions.checkNotNull(value, "name"));
	 }
}
