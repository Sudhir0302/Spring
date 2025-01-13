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
