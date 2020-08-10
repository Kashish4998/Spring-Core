package com.spring.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		FixedDeposit ob=(FixedDeposit)ctx.getBean("obj");
		
		
		  ob.setAccntHolderName("Kashish"); ob.setAccountNumber(1); ob.setAmt(1000);
		  ob.setTenure(2); System.out.println(ob.getAccntHolderName() +"\n"
		  +ob.getAccountNumber() +"\n" +ob.getAmt() +"\n" +ob.getInterestRate() +"\n"
		  +ob.getTenure());
		 
		// TODO Auto-generated method stub

	}

}
