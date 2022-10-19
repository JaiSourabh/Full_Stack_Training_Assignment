package com.yash.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.orm.dao.EmployeeDao;
import com.yash.orm.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao empDao= context.getBean("employeeDao",EmployeeDao.class);
        Employee emp1=new Employee();
        emp1.setEmpid(101);
        emp1.setEmpname("Paman");
        emp1.setEmail("Paman@gmail.com");
//        int res=empDao.insert(emp1);
//        System.out.println(res+" : Employee created successfully");
//        Employee e1= empDao.getEmployeeById(101);
//        System.out.println(" Employee fetch "+ e1);
//        System.out.println("List of all Employee");
//        List<Employee> emplist=empDao.getAllEmployee();
//        System.out.println(emplist);
//        System.out.println("Employee Deleted");
//        empDao.deleteEmployee(102);
        System.out.println("Employee Updated");
        empDao.updateEmployee(emp1);
    }
}
