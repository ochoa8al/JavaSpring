package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		//Empleados Empleado1 = new JefeEmpleado();
		//System.out.println(Empleado1.getTareas());
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleados Juan = context.getBean("miEmpleado",Empleados.class);
		System.out.println(Juan.getTareas());
		context.close();
	}

}
