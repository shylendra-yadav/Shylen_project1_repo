package base;

import java.lang.reflect.Constructor;

import org.apache.poi.ss.formula.functions.T;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer{
	
  public void transform(ITestAnnotation annotation, Class<T> testclass, Constructor<T> testconstructor) {
	  annotation.setRetryAnalyzer(Retry.class);
  }

}
