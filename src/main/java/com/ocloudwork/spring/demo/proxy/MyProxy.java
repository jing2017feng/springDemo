package com.ocloudwork.spring.demo.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyProxy {


	private static final Logger logger = LoggerFactory.getLogger(MyProxy.class);

	public void breforPerformance() {
		//logger.info("MyProxy breforPerformance().");
	}

	public void afterPerformance() {
		//logger.info("MyProxy afterPerformance().");
	}

	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		// 加逻辑的时候, 不要依赖执行的的先后顺序
//		System.out.println("method around start!");
//		org.aspectj.lang.Signature signature = pjp.getSignature();
//		Object[] obs = pjp.getArgs();
//		org.aspectj.lang.JoinPoint.StaticPart part = pjp.getStaticPart();
		Object o = pjp.getTarget();
		logger.info("------------------------------before excute method,method name is:'"+o.getClass().getName()+"."+pjp.getSignature().getName()+"'");
		Object proceed = pjp.proceed();
		logger.info("------------------------------after excute method");
		return proceed;
	}

}
