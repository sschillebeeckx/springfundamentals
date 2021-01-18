package be.abis.ch06aop.aspect;

import be.abis.ch06aop.exception.PersonNotWelcomeException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Before("execution(public * be.abis.ch06aop.service.*.welcome*(..))")
	public void beforeWelcome(){
		System.out.println("Receptionist stands up:");
	}
	
	@AfterReturning(pointcut="AopPointcuts.execWelcome()")
	public void afterWelcomeOK(JoinPoint jp){
		System.out.println("Person is guided to lounge.");
	}
	
	@AfterThrowing(pointcut="AopPointcuts.execWelcome()",throwing="exc")
	public void afterNotWelcome(PersonNotWelcomeException exc){
		System.out.println("you are escorted back to the door " /*+exc.getMessage()*/);
	}
	
	@After("AopPointcuts.execGet()")
	public void afterGetting(JoinPoint jp){
		System.out.println("finished calling getter method " + jp.getSignature().getName());
	}
	
	@Around("AopPointcuts.listCompanyNames()")
	public Object timing(ProceedingJoinPoint pjp){
		
		Object o =null;
		try {
			long start = System.nanoTime();
			o = pjp.proceed();
			long end= System.nanoTime();
			System.out.println("time taken by " + pjp.getSignature().getName() +" : " + ((end-start)/1000000.0) + " milliseconds");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return o;
				
	}

}
