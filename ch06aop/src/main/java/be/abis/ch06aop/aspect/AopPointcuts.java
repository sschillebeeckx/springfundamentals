package be.abis.ch06aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class AopPointcuts {
	
	@Pointcut("execution(* welcome*(..))")
	public void execWelcome(){}
	
	@Pointcut("execution(* be.abis.ch06aop.service.*.get*(..))")
	public void execGet(){}
	
	@Pointcut("execution(* be.abis.ch06aop.service.*.getNamesOf*(..))")
	public void listCompanyNames(){}
	
}
