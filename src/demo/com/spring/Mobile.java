package demo.com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sim airtel = new Airtel();
		airtel.calling();
		airtel.data();*/
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("beans.xml"); 
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();

	}

}
