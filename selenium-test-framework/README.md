# 🧪 Selenium Test Automation Framework (Java + TestNG)

This is a modular and scalable **UI Test Automation Framework** built using **Selenium WebDriver**, **Java**, and **TestNG**, designed for headless execution, robust logging, and easy integration into CI/CD pipelines.

---

## 🚀 Features

- ✅ Page Object Model (POM) architecture  
- ✅ Cross-browser and headless support  
- ✅ Logging with Log4j2 (console + file)  
- ✅ Screenshots on test failure  
- ✅ Externalized configuration via `config.properties`  
- ✅ Easily extensible for additional pages, components, and environments  

---

## 🧰 Tech Stack

| Component     | Version      |
|---------------|--------------|
| Java          | 17           |
| Selenium      | 4.12.1       |
| TestNG        | 7.9.0        |
| Maven         | Latest       |
| Log4j2        | 2.20.0       |

---

## 📂 Folder Structure

```
selenium-test-framework/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── pages/
│   │   └── resources/
│   │       ├── config.properties
│   │       └── log4j2.xml
│   ├── test/
│   │   ├── java/
│   │   │   ├── base/
│   │   │   ├── tests/
│   │   │   └── utils/
├── logs/
├── screenshots/
├── pom.xml
└── README.md
```

---

## ⚙️ Configuration

Customize your test run via `config.properties`:
```properties
browser=chrome
headless=true
baseUrl=https://example.com
timeout=10
```

---

## ▶️ How to Run Tests

### Using Maven
```bash
mvn clean test
```

### Run Specific Test Classes
```bash
mvn -Dtest=LoginTest test
```

---

## 📄 Screenshots & Logs

- 📸 Screenshots saved in `/screenshots/` on failure  
- 📄 Logs stored in `/logs/test.log` using Log4j2

---

## 📌 Future Enhancements

- [ ] Add data-driven testing support  
- [ ] Integrate GitHub Actions for CI  
- [ ] Include HTML test reports (Surefire or ExtentReports)

---

## 👤 Author

**Mostafizur Rahman**  
🔗 [LinkedIn Profile](https://www.linkedin.com/in/mostafizurrahman3)  
📦 [GitHub Repository](https://github.com/rahmostafiz1/mostafizur-selenium-framework)

---

## 🏁 License

This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT)
