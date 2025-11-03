# CodeAlpha_Project
# Student Grade Management System

A simple command-line Java application for managing student grades. This system allows you to add students, view their information, and generate statistical reports.

## Features

- **Add Students**: Register new students with their names and grades
- **View All Students**: Display a formatted list of all registered students
- **Summary Report**: Generate statistical analysis including:
  - Total number of students
  - Average grade
  - Highest and lowest grades
  - Top performer identification
- **Input Validation**: Ensures grades are within the valid range (0-100)

## Requirements

- Java Development Kit (JDK) 8 or higher
- Command-line interface (Terminal, Command Prompt, etc.)

## Installation

1. Download the `studentgrademanager.java` file
2. Save it to your desired directory

## Compilation

Open your terminal/command prompt and navigate to the directory containing the file, then compile:

```bash
javac studentgrademanager.java
```

## Running the Application

After compilation, run the program:

```bash
java studentgrademanager
```

## Usage

Upon starting the application, you'll see a menu with the following options:

### Main Menu
```
--- MENU ---
1. Add Student
2. View All Students
3. View Summary Report
4. Exit
```

### 1. Add Student
- Enter the student's name
- Enter a grade between 0 and 100
- Invalid grades will be rejected with an error message

### 2. View All Students
Displays a formatted table showing:
- Student number
- Student name
- Grade (formatted to 2 decimal places)

### 3. View Summary Report
Shows comprehensive statistics:
- Total number of students in the system
- Class average grade
- Highest grade achieved
- Lowest grade achieved
- Name of the top-performing student

### 4. Exit
Safely closes the application

## Example Usage

```
Enter your choice: 1
Enter student name: John Doe
Enter grade (0-100): 85.5
Student added successfully!

Enter your choice: 2
--- ALL STUDENTS ---
No.     Name                    Grade
---------------------------------------
1.      John Doe                85.50
```

## Data Storage

**Note**: This application stores data in memory using ArrayLists. All data will be lost when the program exits. For persistent storage, consider enhancing the application with file I/O or database integration.

## Code Structure

- **Main Method**: Controls the program flow and menu system
- **addStudent()**: Handles student registration with validation
- **viewAllStudents()**: Displays all registered students
- **calculateAverage()**: Computes the mean grade
- **findHighest()**: Identifies the maximum grade
- **findLowest()**: Identifies the minimum grade
- **viewSummaryReport()**: Generates comprehensive statistics

## Limitations

- Data is not persisted between sessions
- No ability to edit or delete existing student records
- No support for multiple grades per student
- Single-threaded, console-based interface only

## Future Enhancements

Potential improvements could include:
- File persistence (save/load from text or CSV files)
- Edit and delete student functionality
- Search students by name
- Grade distribution analysis
- Letter grade assignment (A, B, C, etc.)
- Export reports to file
- Graphical user interface (GUI)

## License

This is an educational project provided as-is for learning purposes.

## Author

Created as a student project for learning Java programming fundamentals.

---

**Happy Grade Managing! 📚**
