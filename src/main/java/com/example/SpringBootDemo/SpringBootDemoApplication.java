package com.example.SpringBootDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ImportResource("classpath:app-config.xml")
public class SpringBootDemoApplication implements CommandLineRunner, ApplicationContextAware {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Autowired
	private Employee emp1;

	@Autowired
	private ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	@Override
	public void run(String... args) throws Exception {

		Employee emp1 = (Employee) context.getBean(Employee.class);
		Employee emp2 = (Employee) context.getBean(Employee.class);

		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());

		Person person1 = (Person) context.getBean("person1");
		Person person2 = (Person) context.getBean("person2");

		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());

		//Manager manager = (Manager) context.getBean(Manager.class);
		Manager man1 = (Manager) context.getBean("man1");
		Manager man2 = (Manager) context.getBean("man2");
		Manager man3 = (Manager) context.getBean("man3");

		System.out.println(man1.hashCode());
		System.out.println(man2.hashCode());
		System.out.println(man3.hashCode());
	}

}
