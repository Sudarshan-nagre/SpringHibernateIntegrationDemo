import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.shid.config.AppConfig;
import com.shid.model.Employee;
import com.shid.service.EmployeeService;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeService service = (EmployeeService) context.getBean("employeeService");

		/*
		 * Create Employee1
		 
		Employee employee1 = new Employee();
		employee1.setName("Shyam Sundar");
		employee1.setSalary(new BigDecimal(10000));
		employee1.setAddress("pune");

		
		Employee employee2 = new Employee();
		employee2.setName("Virat Kohli");
		employee2.setSalary(new BigDecimal(20000));
		employee2.setAddress("Delhi");

		service.saveEmployee(employee1);
		service.saveEmployee(employee2);*/
		
		service.getEmployeeList().forEach(emp->System.out.println(emp.getName()));

		context.close();
	}
}
