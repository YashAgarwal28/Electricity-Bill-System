# Electricity-Bill-System
 This project is a simple electricity bill management system developed using Core Java. It provides functionalities such as calculating bills, managing customer details, user authentication, and more. The system utilizes MySQL for database management and XAMPP's phpMyAdmin for database connectivity.

# Features
**#** Admin Functions:

- Creation of new customers with assigned meter information.
- Viewing all customer details.
- Calculating bills for all customers.

**#** Customer Functions:

- Creating a personal account after admin approval.
- Viewing account information.

# Project Components:
- CalculateBill: Module responsible for calculating electricity bills.
- conn: Handles database connectivity.
- CustomerDetails: Manages customer information.
- Home: Home screen module.
- Login: User authentication module.
- Main Screen: Main interface module.
- New Customer: Module for adding new customers.
- Signup: User registration module.
- ViewInformation: Module for viewing customer information.

# Modules Overview
- Database Connection Module: Handles connection to MySQL Database.
- Main Screen Module: Initializes the system and calls the login module.
- Login Module: Manages user login and registration.
- Signup Module: Enables user registration as a customer or admin.
- Home Module: Displays options based on user type (admin or customer).
- New Customer Module: Allows admin to create new customers.
- Customer Details Module: Displays details of all customers for admin.
- Calculate Bill Module: Enables admin to calculate bills for customers.
- View Information Module: To view account information.


# Setup Instructions:
# Install MySQL Server and Workbench:
- If not already installed, download and install MySQL Server and Workbench on your system.

# Download Dependencies:

- MySQL Connector: [Download Link](https://static.javatpoint.com/src/jdbc/mysql-connector.jar)
- R2xml: [Download Link](https://sourceforge.net/projects/finalangelsanddemons/files/rs2xml.jar/download)
- Images: [download link](https://drive.google.com/drive/folders/1SlwaPUSpnnBfeyfzufR8wUzCd2QGg3Me?usp=drive_link)


# Importing the MySQL Connector JAR File & R2xml JAR File into Your Java Project
After downloading the MySQL Connector/J JAR file & R2xml JAR file, you need to import it into your Java project. The process may vary depending on the development environment or build tool you are using. Here we are using Eclipse IDE:

Eclipse IDE:

To import the MySQL Connector/J JAR file & R2xml JAR file into your Eclipse project, follow these steps:

1. Open Eclipse and select your Java project.
2. Right-click on your project and select “Build Path” > “Configure Build Path”.
3. In the “Libraries” tab, click on “Add External JARs”.
4. Browse to the location where you downloaded the MySQL Connector/J JAR file & R2xml JAR file and select it.
5. Click “Apply” and then “OK” to save the changes.

# Image Folder:

- Keep all the downloaded images in the "icon" folder within the project directory.

# Database Configuration:

- Start XAMPP and launch phpMyAdmin.
- Create a new database for the project and configure the connection details in the conn module.

# Run the Project:
Once configured, run the project using Eclipse IDE.

# Note:
Make sure to have XAMPP with phpMyAdmin running and the necessary MySQL server and Workbench installed for proper database connectivity.




