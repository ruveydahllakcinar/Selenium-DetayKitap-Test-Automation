# Detay Kitap E-Commerce Automation Tests

The Detay Kitap website is an e-commerce platform that allows customers to search for various books, add them to cart, and complete payment transactions. These automation tests aim to validate the smooth functioning of these core functionalities of the website. Thus, ensuring that the website operates stably after any changes or updates.


## Technologies Used

These automation tests are developed using the following technologies:

- **Selenium:** A tool used to automate control of web browsers.
- **WebDriverIO:** A Selenium-based automation testing framework.
- **JavaScript:** The programming language used to write test scenarios.
- **Node.js:** A runtime environment used to execute JavaScript.

## Features

- **Product Search Test:** A product search is made on the Detay Kitap website and the results are checked.
- **Add to Cart Test:** A product is selected and added to the cart. Basket contents are checked.
- **Payment Steps Test:** The steps required for the payment process (address information, payment method selection, order confirmation, etc.) are completed automatically and the results are verified.

## Requirements
To run the project, the following dependencies are required:
- These libraries are used to define the dependencies of the Maven project. You must add the necessary libraries in pom.xml `<dependencies> </dependencies>`
- Selenium Java: 4.1.0
- WebDriverManager: 5.0.3
- JUnit: 5.8.0
- Cucumber Java: 7.0.0
- Cucumber Junit: 7.0.0

```xml
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.0.0</version>
    <scope>test</scope>
</dependency>
```
```xml
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.0.0</version>
    <scope>test</scope>
</dependency>
```
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.8.0</version>
    <scope>test</scope>
</dependency>
```
```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.1.0</version>
</dependency>
```
```xml
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.0.3</version>
    <scope>test</scope>
</dependency>
```
