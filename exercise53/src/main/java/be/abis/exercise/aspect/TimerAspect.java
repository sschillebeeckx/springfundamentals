package be.abis.exercise.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimerAspect {

	@Around("execution(public * be.abis.exercise.service.*.find*(..))")
	public Object timing(ProceedingJoinPoint pjp) throws Throwable {
		Object o =null;
		try {
			long start = System.nanoTime();
			o = pjp.proceed();
			long end= System.nanoTime();
			System.out.println("time taken by " + pjp.getSignature().getName() +" : " + ((end-start)/1000000.0) + " milliseconds");
		} catch (Throwable e) {
			throw e;
		}
		
		return o;
				
	}
	
	
	
	

}
