1.IOC -> Inversion of control which is a container of objects of all classes.

2.Autowire -> autowiring in Spring, you don’t need to manually create an object of one class to use in another. The Spring Framework takes care of creating, managing, and injecting the required objects (beans) into your classes.

3.DI -> Dependency Injection means to provide (injecting) other class objects in to a class using annotations such as @Bean, @Autowired ,etc.

4.@component -> an object is created in ioc when it is annotated by @component annotation.By default the object is singleton object(bean).

5.@Qualifier("bean_name") -> to specify which bean to use.(Note: if both qualifier and primary there means, qualifier gets the first preference)

6.@Primary -> to specify that is the first preferred bean

7.@Controller -> It is used to define a class as a controller in the Spring MVC framework, which listens for incoming HTTP requests and handles them. It is a specialized component in the Spring framework, typically used to create web applications where HTTP requests are mapped to handler methods in the controller.

8.Dispatcher servlet - to map requests to sepecific controllers in spring.It is known as FrontController

9.@RestController -> To send data as json or data not as pages

10.@CrossOrigin -> To enable cors for a specific port

21.Jackson -> It is the library responsible for transforming java objects into json format

22.ORM -> Object Relational Mapping which means creating a table in db with the help of class in java.

23.@Entity -> To define a class as entity (table) to store data in db

24.@Id -> Primary key 

25.@Query -> To write JPQL (Java Persistence Query Language).

26.Spring AOP -> To maintain activity logs, validation(security) i.e for example validating the request before executing a method, etc

27.@Aspect -> Specifies the method which acts as a aspect

28.Advice -> Advice defines the action taken by an aspect at a specific join point. It determines what and when the aspect should do something.

29.Types of advice:
    Before Advice: Runs before the method execution.
    After Returning Advice: Runs after the method executes successfully.
    After Throwing Advice: Runs when the method throws an exception.
    After (Finally) Advice: Runs after the method execution, regardless of its outcome.
    Around Advice: Wraps the method execution, allowing complete control over whether and how it executes.

30.Join Point -> eg.A method like getUser() in the UserService class could be a join point.

31.Pointcut -> A pointcut is an expression that defines where the advice should be applied , eg.@Pointcut("execution(* com.example.service.*.*(..))")
public void serviceMethods() {}.
