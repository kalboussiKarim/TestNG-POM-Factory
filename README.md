# TestNG POM & Factory

This project demonstrates the implementation of the **Page Object Model (POM)** design pattern and the use of **PageFactory** in the Page Object class for efficient and maintainable test automation.

## Features and Examples

### 1. **Page Object Model (POM) Design Pattern**
   - Illustrates the use of POM to structure test automation frameworks.
   - Provides a clear separation of test logic and web element locators.
   - Demonstrates how to improve test maintainability by encapsulating page-specific behaviors in dedicated classes.

### 2. **PageFactory Implementation**
   - Introduces the use of the `@FindBy` annotation to define web element locators in the Page Object class.
   - Utilizes the `PageFactory.initElements()` method to initialize web elements automatically.
   - Simplifies element interaction by promoting cleaner and more readable code.

## How to Use
1. Clone the repository:
   ```bash
   git clone https://github.com/kalboussiKarim/TestNG-POM-Factory.git
   ```
2. Import the project into your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
3. Explore the examples in the provided code files.
4. Run the tests to observe the application of POM and PageFactory in action.

## Prerequisites
- Java Development Kit (JDK) installed.
- TestNG library integrated with your project.
- Selenium WebDriver dependency added to your project.
- A basic understanding of Java programming and Selenium WebDriver.
