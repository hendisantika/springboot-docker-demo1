package com.hendisantika.springbootdockerdemo1;

import com.hendisantika.springbootdockerdemo1.model.Employee;
import com.hendisantika.springbootdockerdemo1.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootDockerDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerDemo1Application.class, args);
    }

    //for testing only
    @Bean
    public CommandLineRunner demo(EmployeeRepository repository) {
        return (args) -> {

            Employee employee = new Employee();
            employee.setId("1");
            employee.setFullName("Uzumaki Naruto");
            employee.setEmail("uzumaki_naruto@gmail.com");
            employee.setManagerEmail("sarutobi@gmail.com");

            repository.save(employee);

        };
    }

}
