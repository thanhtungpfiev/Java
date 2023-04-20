package clients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import parts.SmallEngine;
import vehicles.Vehicle;

/**
 * tungdt9
 * Jul 27, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Vehicle aCar = (Vehicle) context.getBean("mrBeansCar");
		aCar.crankIgnition();
	}
}
