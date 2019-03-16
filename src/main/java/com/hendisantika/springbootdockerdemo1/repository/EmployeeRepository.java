package com.hendisantika.springbootdockerdemo1.repository;

import com.hendisantika.springbootdockerdemo1.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-docker-demo1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-16
 * Time: 10:57
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
