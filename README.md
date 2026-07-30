# JUnit Testing - Customer Service

A simple Java Maven project demonstrating **JUnit 5 Unit Testing** for a Customer Management Service. This project covers the fundamentals of writing and executing unit tests using JUnit Jupiter while following a clean project structure.

---

## 📌 Project Overview

This project implements a basic **Customer Service** that performs CRUD-like operations on an in-memory customer list.

The main purpose of this project is to learn and practice:

- JUnit 5
- Unit Testing
- Test Lifecycle
- Assertions
- Exception Handling
- Maven Project Structure

---

## 🚀 Features

- Add Customer
- Get All Customers
- Get Customer by ID
- Delete Customer
- Calculate Total Customer Balance
- Custom Exception Handling
- JUnit 5 Test Cases

---

## 🛠 Tech Stack

| Technology | Version |
|------------|----------|
| Java | 25 |
| Maven | Latest |
| JUnit Jupiter | 5.13.4 |
| Lombok | 1.18.42 |

---

## 📂 Project Structure

```
junit-testing-master
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.stschool.ecommerce
│   │           ├── App.java
│   │           ├── model
│   │           │     └── Customer.java
│   │           ├── service
│   │           │     └── CustomerService.java
│   │           └── exception
│   │                 ├── CustomerExistsException.java
│   │                 └── CustomerNotFoundException.java
│   │
│   └── test
│       └── java
│           └── com.stschool.ecommerce.service
│                 └── CustomerServiceTest.java
│
├── pom.xml
└── README.md
```

---

## 📖 CustomerService Methods

### save(Customer customer)

Adds a new customer.

Throws:

- CustomerExistsException

---

### getAllCustomers()

Returns all customers.

---

### getCustomerById(int id)

Returns a customer using ID.

Throws:

- CustomerNotFoundException

---

### deleteCustomer(int id)

Deletes a customer by ID.

Throws:

- CustomerNotFoundException

---

### getTotalBalance()

Returns the sum of all customer balances.

---

## ✅ JUnit Concepts Used

- @Test
- @BeforeEach
- @AfterEach
- @DisplayName
- Assertions
  - assertEquals()
  - assertThrows()
  - assertTrue()
  - assertFalse()
  - assertNotNull()

---

## ▶️ Running the Tests

### Clone the repository

```bash
git clone https://github.com/your-username/junit-testing.git
```

### Navigate into the project

```bash
cd junit-testing-master
```

### Run Tests

```bash
mvn test
```

---

## 📷 Sample Test

```java
@Test
@DisplayName("Should add customer successfully when valid data is provided")
void ShouldAddCustomerWhenValidData() {

    Customer customer = new Customer(
        3,
        "John",
        "john@test.com",
        1500
    );

    Customer result = customerService.save(customer);

    assertEquals("John", result.getName());
    assertEquals(3, customerService.getAllCustomers().size());
}
```

---

## 📚 Learning Outcomes

By completing this project you will understand:

- What Unit Testing is
- Why JUnit is important
- Test Driven Development (TDD) basics
- Test Lifecycle
- Writing maintainable test cases
- Exception testing
- Maven test execution

---

## 🔮 Future Improvements

- Mockito Integration
- Parameterized Tests
- Nested Tests
- Test Coverage with JaCoCo
- Spring Boot Version
- REST API Testing
- Integration Testing

---

## 👨‍💻 Author

**Nithin Reddy Bommireddy**

- GitHub: https://github.com/nithinreddybommireddy
- LinkedIn: https://www.linkedin.com/in/nithinreddybommireddy/

---

## ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub.

Happy Coding! 🚀
