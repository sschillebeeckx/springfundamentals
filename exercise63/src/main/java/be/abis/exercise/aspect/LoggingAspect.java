package be.abis.exercise.aspect;

import be.abis.exercise.exception.EnrollException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@After("execution(public * be.abis.exercise.service.*.addC*(..)) ")
	public void logAddingCourse(JoinPoint jp){
		System.out.println("method "  + jp.getSignature().getName() + " finished.");
	}
	
	@AfterReturning("AopPointcuts.execEnroll()")
	public void logPersonEnrolled(){
		System.out.println("enrollment was processed ok");
	}
	
	@AfterThrowing(pointcut="AopPointcuts.execEnroll()",throwing="exc")
	public void logProblemEnrolling(EnrollException exc){
		System.out.println(exc.getMessage());
	}

}
