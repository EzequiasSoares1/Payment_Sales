# Payment_Sales

This Java project was created to test my knowledge of object-oriented programming among other skills. The program's goal is to manage information about company employees, including salary calculations, benefits, sales, and generate some reports. Below are some details about the project.

## Project Structure

The project consists of several classes representing different types of employees:

- **Employee:** Abstract class that defines attributes and methods common to all employees.
- **Manager:** Class representing a manager, inherits from Employee.
- **Secretary:** Class representing a secretary, inherits from Employee.
- **Salesperson:** Class representing a salesperson, inherits from Employee and has a map of monthly sales.
- **Report:** Class responsible for generating reports based on employee information.

## Libraries:
- **Lombok:** For code reduction.
- **JUnit:** For writing and executing integration tests. (Tests are in the `Test` package)

## Implemented Features

1. **Calculate Total Paid (Salary and Benefits) to Employees in the Month:**
   - Receives a list of employees, month, and year.
   - Returns the total amount paid, considering salaries and benefits, in the month.

2. **Calculate Total Paid Only in Salaries in the Month:**
   - Receives a list of employees, month, and year.
   - Returns the total amount paid only in salaries in the month.

3. **Calculate Total Paid in Benefits for Employees Receiving Benefits:**
   - Receives a list of employees receiving benefits, month, and year.
   - Returns the total amount paid in benefits in the month.

4. **Identify Employee Who Received the Highest Amount in the Month:**
   - Receives a list of employees, month, and year.
   - Returns the employee who received the highest amount (salary and benefits) in the month.

5. **Identify the Name of the Employee Who Received the Highest Amount in Benefits in the Month:**
   - Receives a list of employees receiving benefits, month, and year.
   - Returns the name of the employee who received the highest amount in benefits in the month.

6. **Identify Salesperson Who Sold the Most in the Month:**
   - Receives a list of salespersons, month, and year.
   - Returns the salesperson who sold the most in the month.

## How to Use

### Clone the Repository:

```bash
git clone https://github.com/EzequiasSoares1/Payment_Sales


### Importe o Projeto:
**Utilize os Métodos Implementados ou execulte o arquivo `Main.java`**




