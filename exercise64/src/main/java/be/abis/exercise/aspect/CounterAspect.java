package be.abis.exercise.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CounterAspect {

	private static int counter=0;
	
	@Before("execution(* findCourse*(..))")
	public void count(){
		++counter;
	}

	public static int getCounter() {
		return counter;
	}

	
	

}
