package base;

import java.lang.reflect.Constructor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer{
	
  public void transform(ITestAnnotation annotation, Class<?> testclass, Constructor<?> testconstructor) {
	  annotation.setRetryAnalyzer(Retry.class);
  }

}
