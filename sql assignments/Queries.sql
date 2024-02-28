CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Age INT,
    DepartmentID INT
);


-- Inserting Data:
INSERT INTO Employees (EmployeeID, FirstName, LastName, Age, DepartmentID)
VALUES (1, 'John', 'Doe', 30, 101),
       (2, 'Jane', 'Smith', 25, 102),
       (3, 'Alice', 'Johnson', 35, 101);

-- Updating Data:



UPDATE Employees
SET Age = 31
WHERE EmployeeID = 1;


-- Deleting Data:

DELETE FROM Employees
WHERE EmployeeID = 2;


-- Altering Table (Adding a Column):
ALTER TABLE Employees
ADD Email VARCHAR(100);


