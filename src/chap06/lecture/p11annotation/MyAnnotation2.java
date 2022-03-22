package chap06.lecture.p11annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
	// 어노테이션이 어느 범위까지 유지할 것인지 지정해야 한다. 
	// 기본 값: Class 
	// source, runtime 범위를 지정할 수 있다.  

}
