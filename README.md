# GradeIteratorExamples
Student and School Iterator Example  This repository contains Java classes that demonstrate the use of the `Iterable` interface to iterate over collections of grades and student averages.

The main classes included are `Student2`, which stores and iterates over student grades, and `School`, which stores and iterates over students to calculate and return their average grades.

## Classes and Methods

### Student2 Class

- Fields:
  - `private ArrayList<Integer> grades`: Stores the grades of a student.
  - `private int index`: Used for iteration purposes.

- Methods:
  - `public void addGrade(int grade)`: Adds a grade to the student's grade list if it is non-negative.
  - `public Double getAverage()`: Calculates and returns the average of the student's grades.
  - `public Iterator<Integer> iterator()`: Returns an iterator to iterate over the student's grades.

- Inner Class: GradeIterator
  - Implements `Iterator<Integer>` to iterate over the grades.
  - `public boolean hasNext()`: Checks if there are more grades to iterate over.
  - `public Integer next()`: Returns the next grade and advances the iterator.

### School Class

- Fields:
  - `private ArrayList<Student2> students`: Stores the students.
  - `private int index`: Used for iteration purposes.

- Methods:
  - `public void addStudent(Student2 student)`: Adds a student to the school's student list.
  - `public Iterator<Double> iterator()`: Returns an iterator to iterate over the average grades of the students.

- Inner Class: AverageIterator
  - Implements `Iterator<Double>` to iterate over the average grades of students.
  - `public boolean hasNext()`: Checks if there are more students to iterate over.
  - `public Double next()`: Returns the average grade of the next student and advances the iterator.

### Main Class (Ex1)

The `Ex1` class contains the `main` method to demonstrate the usage of `Student2` and `School` classes:

- Creates instances of `Student2` and adds grades.
- Iterates over and prints the grades of a student.
- Creates an instance of `School`, adds students to it, and iterates over and prints the average grades of the students.

## Usage

1. Compile the code:

   ```bash
   javac Ex1.java
   ```

2. Run the compiled code:
bash
   java Ex1
   

3. Expected Output:  
   80
   90
   85.0
   65.0
   85.0
   65.0
 

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details

