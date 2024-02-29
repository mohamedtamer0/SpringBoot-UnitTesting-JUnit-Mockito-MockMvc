# SpringBoot-UnitTesting-JUnit-Mockito-MockMvc



## JUnit

- Develop JUnit Tests
- Set up projects to use JUnit
- Apply JUnit assertions: Equals/Not Equals and Null/NotNull
- Apply JUnit assertions: Same/Not Same and True/False
- Leverage JUnit lifecycle annotations
- Define custom display names for JUnit tests
- Check for exceptions and timeouts
- Define execution order in JUnit tests
- Perform code coverage analysis for JUnit tests
- Apply conditionals with JUnit tests


## Test Driven Development (TDD)

- Apply Test Driven Development for build tests and application code
- Create a failing test first
- Update your code to make the tests pass
- Take your tests from RED to GREEN
- Apply TDD to a coding project
- Leverage parameterized tests with TDD



## Spring Boot Unit Testing Support
- Explore annotations for Spring Boot Unit Testing support
- Apply the @SpringBootTest annotation
- Read Spring Boot application properties and inject values using the @TestPropertySource annotation
- Perform assertEquals and assertNotEquals
- Leverage Spring Boot singleton beans and prototype beans



## Mocking with Mockito
- Identify the need for mocking during test development
- Leverage Mockito in JUnit tests
- Applying the @MockBean annotation for injection
- Throwing exceptions with Mocks


## Spring Reflection Utils
- Identify use cases for applying reflection in your JUnit tests
- Apply ReflectionTestUtils to access non-public fields and methods
- Integrate Spring Reflection Utils in your JUnit tests



## Database Integration Testing
- Identify the need for database integration testing during test development
- Add database setup and clean code using @BeforeEach and @AfterEach
- Leverage an embedded database to ease with testing setup and maintenance.
- External SQL statements using @Sql annotation



## Testing Spring Boot MVC Web Apps with MockMvc
- Apply Spring Boot using testing for a Spring MVC CRUD web app
- Identify use cases for testing Spring MVC @Controller
- Configure the JUnit test case using @AutoConfigureMockMvc
- Inject the MockMvc dependency for testing Spring MVC Controllers
- Send HTTP Requests to Spring MVC Controllers and assert the results
- Assert the view name returned by the Spring MVC Controller
- Assert model attributes for the desired values



## Testing Spring Boot REST APIs with MockMvc
- Apply Spring Boot using testing for a Spring REST CRUD API
- Inject the MockMvc dependency for testing Spring MVC @RestController
- Send HTTP Requests to Spring MVC @RestController and assert the results
- Leverage Jackson Object Mapper to send JSON data to REST API endpoint
- Expect successful response and desired content type
- Apply JsonPath to verify contents of JSON response
