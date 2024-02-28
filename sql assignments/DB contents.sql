-- Create a table to store information about users
CREATE TABLE Users (
    UserID INT PRIMARY KEY,
    UserName VARCHAR(50),
    Email VARCHAR(100)
);

-- Insert some sample data into the Users table
INSERT INTO Users (UserID, UserName, Email)
VALUES (1, 'John Doe', 'john@example.com'),
       (2, 'Jane Smith', 'jane@example.com'),
       (3, 'Alice Johnson', 'alice@example.com');

-- Retrieve all data from the Users table
SELECT * FROM Users;
