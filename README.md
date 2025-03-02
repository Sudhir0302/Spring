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

32.Jackson is the main library responsible for converting JSON data to Java objects (Deserialization) and Java objects to JSON (Serialization) in Spring Boot.

33.@RequestBody annotation tells Spring Boot to convert the JSON payload into a Java object.

34.A payload refers to the actual data that is transmitted in a request or response. In the context of APIs, the payload is usually the body of an HTTP request or response that carries the necessary information.

35.ORM stores object data into the table in db directly without the need of raw sql query.

36.ORM is a concept or technique that maps objects in a programming language to database tables.

37.Hibernate is a framework that provides an implementation of ORM in Java.

38.save is depricated since hibernate v6.Instead we can use persist to save data in db.

39.DispatcherServlet is the heart of request processing in Spring Boot.It acts as a front controller, routing requests to the appropriate controllers.

40.@Configuration - used to define and manage bean objects(class objects) within springcontainer.
Working:
    *When a class is annotated with @Configuration, Spring Boot treats it as a configuration class.
    *It allows you to define beans using @Bean inside it.
    *The objects (beans) created inside the @Configuration class are managed by Spring's IoC (Inversion of Control) container.
    *Instead of manually creating objects using new, Spring Boot automatically injects these objects where required.
    so we can use @Autowired to use a class's objects instead of using getBean().
    
**similary for these @Component, @Service, or @Repository, Spring Boot automatically registers the class as a bean.**

41.When a object(referrence type) is annotated with @Autowired means ,springboot automatically injects the desired bean(object).If want a different bean type(object type) means use @Qualifier.

42.Working of Spring Security 
    *User tries to log in (Spring Security intercepts the request).
    *Spring calls UserDetailsService.loadUserByUsername() (because DaoAuthenticationProvider needs to fetch user details).
    *Spring sees @Service MyUserDetailsService (which implements UserDetailsService).
    *Spring injects MyUserDetailsService where UserDetailsService is needed.
    *Inside MyUserDetailsService, we return new UserPrincipal(user);.
    *Spring sees UserPrincipal implements UserDetails, so it accepts it.
    *Spring Security then compares the password and authenticates the user.

so UserDetailsService is an interface and then MyUserDetailsService is a class which implements UserDetailsService inteface . so that it must override the methods in that interface and then inside MyuserDetailsService we're overriding another interface UserDetails which returns an object of UserDetails , so we need to create a class UserPrinicpal which implements UserDetails.
Then finaly the UserDetailsService returns object of UserDetailsService to the authProvider method and then the springsecurity does the rest to authenticate the user.
So,here Polymorphism comes into play where the classes like MyuserDetailsService which implements UserDetailsService and UserPrinicpal which implements UserDetails are managedby spring IOC and DI ,to call desired overridden method while executing.

43.IOC Container holds all objects (beans) in a centralized place.IOC -  a warehouse that stores ready-made objects (beans).Whenever an object is needed, Spring retrieves and injects it.

44.There are two types of IOC Containers in Spring:
    BeanFactory (Lightweight)
    ApplicationContext (Advanced, commonly used in Spring Boot) - Spring Boot by default uses ApplicationContext.
    
45.Spring IOC Workflow  - (check SpringSecurity folder)
Spring IOC Container                       
    1. MyUserDetailsService (implements UserDetailsService)  
    2. UserPrincipal (implements UserDetails)                
    3. UserRepo (JPA Repository)        

(Spring creates and manages these beans)
Application Code (Uses @Autowired)            
    Calls MyUserDetailsService.loadUserByUsername()    
    MyUserDetailsService needs UserRepo object         
    Spring injects UserRepo into MyUserDetailsService  
    MyUserDetailsService returns UserPrincipal         
    Spring Security uses UserPrincipal for Auth        

47.DaoAuthenticationProvider is a built-in authentication provider that fetches user details from a database via a UserDetailsService. It verifies user credentials and grants access if they are correct.
    How DaoAuthenticationProvider Works?
    Step 1: *User Tries to Log In
            *The user enters username and password.
            *The request is sent to Spring Security.
    Step 2: *Spring Security Calls DaoAuthenticationProvider
            *It retrieves user details using UserDetailsService.
            *It verifies if the username exists in the database.
            *It compares passwords (plain or hashed).
    Step 3: *Authentication Result
            *If authentication succeeds → User is granted access.
            *If authentication fails → Access is denied.

