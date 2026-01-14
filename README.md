# honeyquote-automation-assessment
Selenium BDD Automation – AutomationExercise

This project automates the Signup and Login flow of the AutomationExercise website using Selenium WebDriver, Java, Cucumber (BDD), TestNG, and Maven.

--------------------------------------------------
SETUP INSTRUCTIONS
--------------------------------------------------

Before running the tests, ensure the following are installed on your system:

1. Java Development Kit (JDK) 11 or higher  
   - Java should be installed and JAVA_HOME should be configured.

2. Maven  
   - Maven should be installed and accessible via command line.

3. Google Chrome Browser  
   - Chrome must be installed since the tests run using ChromeDriver.
   - ChromeDriver is managed automatically using WebDriverManager.

--------------------------------------------------
CLONE THE REPOSITORY
--------------------------------------------------

Clone the Git repository using the following command:

git clone <repository-url>

After cloning, navigate to the project directory.

--------------------------------------------------
PROJECT WORKING DIRECTORY
--------------------------------------------------

Before executing the tests, make sure you are inside the Maven project directory where the pom.xml file is present.

Run the following command:

cd automationexercise-bdd

This step is mandatory. Maven commands will fail if executed from any other directory.

--------------------------------------------------
STEPS TO EXECUTE THE TESTS
--------------------------------------------------

Once you are inside the automationexercise-bdd directory, run:

mvn clean test

This command will:
- Clean previous build files
- Compile the project
- Execute all Cucumber scenarios using TestNG

--------------------------------------------------
WHAT THE TEST AUTOMATES
--------------------------------------------------

The automated scenario covers the following flow:

- Launch the AutomationExercise application
- User signup with valid details
- Validation of successful account creation
- Logout
- Login using the same credentials
- Validation of successful login
- Logout again

--------------------------------------------------
ASSUMPTIONS AND LIMITATIONS
--------------------------------------------------

Assumptions:
- The AutomationExercise website is accessible during test execution.
- Chrome browser is installed and compatible with ChromeDriver.
- Internet connection is stable during execution.

Limitations:
- The application may display third-party ads which are not part of the application functionality.
- Ads may sometimes interfere with automation and cannot always be controlled via Selenium.
- Tests are executed only on Chrome browser.
- The password used in the test is hardcoded for demonstration purposes.

--------------------------------------------------
TOOLS AND FRAMEWORKS USED
--------------------------------------------------

- Java
- Selenium WebDriver
- Cucumber (BDD)
- TestNG
- Maven
- Page Object Model (POM)

--------------------------------------------------

