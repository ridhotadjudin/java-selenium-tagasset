![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium_4.0.0-43B02A?style=flat-square&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG_7.6.0-FF7300?style=flat-square&logo=testng&logoColor=white)
![Cucumber](https://img.shields.io/badge/Cucumber_7.3.4-23D96C?style=flat-square&logo=cucumber&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green.svg)

# 🏷️ Selenium + Cucumber BDD — Tag Asset Management

Automated end-to-end test suite for the **Tag Asset** (Asset Tagging) management system using Java, Selenium 4, TestNG, and Cucumber BDD. Built on the **Page Object Model** pattern with Gherkin feature files, the project covers login, dashboard, user management, roles, asset owners, data groups, and system settings.

---

## 📑 Table of Contents

- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Project Structure](#-project-structure)
- [Prerequisites](#-prerequisites)
- [Getting Started](#-getting-started)
- [Test Scenarios](#-test-scenarios)
- [Design Patterns](#-design-patterns)
- [Reports](#-reports)
- [Author](#-author)

---

## ✨ Features

- **BDD with Cucumber** — Gherkin feature files for business-readable test specifications
- **Page Object Model** — Dedicated page classes for every application module
- **Comprehensive Coverage** — Tests across 9 application modules (Login, Dashboard, BTL Account, Home, Data Groups, Asset Owners, Settings, Users, Roles)
- **Data-Driven Testing** — Excel data provider for parameterized test execution
- **Utility Layer** — Shared helper methods in `Utility.java` for common operations
- **Maven Lifecycle** — Full build, test, and report generation via Maven

---

## 🛠 Tech Stack

| Technology | Version | Purpose |
|---|---|---|
| Java | 11+ | Programming language |
| Selenium WebDriver | 4.0.0 | Browser automation |
| TestNG | 7.6.0 | Test execution and assertion framework |
| Cucumber | 7.3.4 | BDD framework with Gherkin syntax |
| Maven | 3.x | Build and dependency management |
| Excel DataProvider | — | Parameterized data injection from spreadsheets |

---

## 📁 Project Structure

```
java-selenium-tagasset/
├── src/
│   ├── main/java/
│   │   └── nextag/pom/
│   │       ├── LoginPage.java          # Login page object
│   │       ├── MainPage.java           # Main navigation page object
│   │       ├── AkunBTLPage.java        # BTL account management page
│   │       ├── BerandaPage.java        # Home (Beranda) page object
│   │       ├── DataGroupPage.java      # Data group management page
│   │       ├── PemilikAsetPage.java    # Asset owner management page
│   │       ├── PengaturanPage.java     # Settings page object
│   │       ├── PenggunaPage.java       # User management page object
│   │       ├── PeranPage.java          # Role management page object
│   │       └── Utility.java            # Shared utility methods
│   └── test/
│       ├── java/
│       │   ├── stepdefinitions/        # Cucumber step definitions
│       │   └── runners/               # TestNG-Cucumber runner classes
│       └── resources/
│           └── features/              # Gherkin feature files
├── testdata/                          # Excel test data files
├── pom.xml                            # Maven project configuration
└── README.md
```

---

## 📋 Prerequisites

- **Java JDK** 11 or higher
- **Apache Maven** 3.6+
- **Google Chrome** browser
- **ChromeDriver** matching your Chrome version

---

## 🚀 Getting Started

### Installation

```bash
# Clone the repository
git clone https://github.com/ridhotadjudin/java-selenium-tagasset.git
cd java-selenium-tagasset

# Install dependencies
mvn clean install -DskipTests
```

### Running Tests

```bash
# Run the full test suite
mvn test

# Run with a specific Cucumber tag
mvn test -Dcucumber.filter.tags="@login"

# Run a specific feature
mvn test -Dcucumber.features="src/test/resources/features/login.feature"

# Generate Cucumber HTML report
mvn verify
```

---

## 🧪 Test Scenarios

| Scenario Name | Type | Description |
|---|---|---|
| Login Validation | Functional | Verifies login with valid and invalid credentials, and validates error messages |
| Dashboard Navigation | Functional | Confirms all dashboard modules are accessible and display correct content |
| BTL Account Management | CRUD | Tests create, view, update, and delete operations on BTL account records |
| Data Group CRUD | CRUD | Validates full lifecycle management of data groups including search and filter |
| Asset Owner Management | CRUD | Tests asset owner registration, modification, and removal workflows |
| User Management | CRUD | Verifies user creation, profile editing, activation/deactivation, and deletion |
| Role-Based Access | Authorization | Validates that users see only the modules and actions permitted by their assigned role |
| Settings Configuration | Functional | Tests system settings updates and verifies changes persist after save |
| Data-Driven Login | Data-Driven | Executes login scenarios against multiple credential sets from Excel data files |

---

## 🏗 Design Patterns

### Page Object Model (POM)

Every application module maps to a dedicated page class inside the `nextag.pom` package. Each class encapsulates element locators and interaction methods, providing a clean API for test steps:

```
LoginPage       → enterUsername(), enterPassword(), clickLogin()
DataGroupPage   → createGroup(), searchGroup(), editGroup(), deleteGroup()
PenggunaPage    → addUser(), deactivateUser(), assignRole()
```

When the UI changes, only the corresponding page class needs updating — all consuming tests remain stable.

### BDD with Cucumber

Gherkin feature files describe test scenarios in plain English using Given/When/Then syntax. Step definition classes in `stepdefinitions/` bind these natural language steps to Selenium actions through the page objects. This three-layer architecture (Feature → Step Definition → Page Object) keeps each concern isolated and testable.

### Utility Abstraction

`Utility.java` centralizes cross-cutting concerns such as explicit waits, screenshot capture, Excel data reading, and browser setup. This prevents code duplication across page classes and provides a single location for infrastructure-level changes.

### TestNG-Cucumber Integration

TestNG runner classes bridge Cucumber's BDD engine with TestNG's execution and reporting capabilities. This combination delivers Gherkin-level readability with TestNG's powerful suite configuration, parallel execution, and listener support.

---

## 📊 Reports

| Report | Location | Description |
|---|---|---|
| Cucumber HTML Report | `target/cucumber-reports/` | Rich visual report with scenario pass/fail, step details, and embedded screenshots |
| TestNG Report | `test-output/index.html` | Framework-level execution summary with suite and method breakdown |
| Surefire Report | `target/surefire-reports/` | Maven-generated report compatible with CI/CD dashboard integrations |

View reports after a test run:

```bash
start target\cucumber-reports\index.html
```

---

## 📄 License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.

---

## 👤 Author

**Ridho Tadjudin**

[![Website](https://img.shields.io/badge/Website-ridhotadjudin.id-blue?style=flat-square&logo=google-chrome&logoColor=white)](https://ridhotadjudin.id)
[![GitHub](https://img.shields.io/badge/GitHub-ridhotadjudin-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/ridhotadjudin)

