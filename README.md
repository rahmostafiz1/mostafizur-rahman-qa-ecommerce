# 🧪 QA Ecommerce Automation Framework

Automated test suite for validating core workflows of the [SauceDemo Ecommerce](https://www.saucedemo.com) application using Selenium, TestNG, and Page Object Model (POM). Built for scalability, observability, and easy CI/CD integration.

## 🚀 Tech Stack

| Tool/Library           | Purpose                            |
|------------------------|------------------------------------|
| **Selenium WebDriver** | UI interaction and automation       |
| **TestNG**             | Test execution and lifecycle hooks |
| **Log4j2**             | Logging and debugging support       |
| **Java 17 (Maven)**    | Framework language and build tool   |

---
## ✅ Test Modules

- **Login Tests**
  - Valid and invalid credential flow
  - Error message validation
- **Inventory Tests**
  - Product sorting
  - Price and description assertion
- **Cart Tests**
  - Add/remove items
  - Persistence across navigation
- **Checkout Flow**
  - Form input validation
  - Total cost assertion

---
## 🔧 Setup & Execution

 **Clone Repo**

	git clone https://github.com/rahmostafiz1/qa-ecommerce.git
	cd qa-ecommerce

 **Install Dependencies**

	mvn clean install
	
 **Run Tests**   

	mvn test	
- **Output**
  - Logs:	logs/
  - Screenshots: screenshots/
   
---

## 👤 Author

**Mostafizur Rahman**  
🔗 [LinkedIn Profile](https://www.linkedin.com/in/mostafizurrahman3)  
📦 [GitHub Repository](https://github.com/rahmostafiz1/mostafizur-selenium-framework)

---

## 🏁 License

This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT)   
