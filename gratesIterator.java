

import java.util.Iterator;

class Student2 implements Iterable<Integer> {
    private ArrayList<Integer> grades = new ArrayList<>(); // List to store student grades
    private int index = 0; // Index for iteration

    // Method to add a grade to the list if it's non-negative
    public void addGrade(int grade) {
        if (grade >= 0) {
            grades.add(grade);
        }
    }

    // Method to calculate and return the average of the grades
    public Double getAverage() {
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    // Method to return an iterator for the grades
    @Override
    public Iterator<Integer> iterator() {
        index = 0; // Reset the index before returning the iterator
        return new GradeIterator(); // Return a new GradeIterator instance
    }

    // Inner class to implement the iterator for the grades
    private class GradeIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return index < grades.size(); // Check if there are more grades to iterate over
        }

        @Override
        public Integer next() {
            return grades.get(index++); // Return the next grade and increment the index
        }
    }
}

class School implements Iterable<Double> {
    private ArrayList<Student2> students = new ArrayList<>(); // List to store students
    private int index = 0; // Index for iteration

    // Method to add a student to the list
    public void addStudent(Student2 student) {
        students.add(student);
    }

    // Method to return an iterator for the average grades of students
    @Override
    public Iterator<Double> iterator() {
        index = 0; // Reset the index before returning the iterator
        return new AverageIterator(); // Return a new AverageIterator instance
    }

    // Inner class to implement the iterator for the average grades
    private class AverageIterator implements Iterator<Double> {
        @Override
        public boolean hasNext() {
            return index < students.size(); // Check if there are more students to iterate over
        }

        @Override
        public Double next() {
            return students.get(index++).getAverage(); // Return the average grade of the next student and increment the index
        }
    }
}

public class Ex1 {
    public static void main(String[] args) {
        // Create first student and add grades
        Student2 student1 = new Student2();
        student1.addGrade(80);
        student1.addGrade(90);

        // Create second student and add grades
        Student2 student2 = new Student2();
        student2.addGrade(60);
        student2.addGrade(70);

        // Iterate over and print grades of the first student
        for (int grade : student1) {
            System.out.println(grade);
        }

        // Create a school and add the students to it
        School school = new School();
        school.addStudent(student1);
        school.addStudent(student2);

        // Iterate over and print average grades of the students in the school
        for (Double avg : school) {
            System.out.println(avg);
        }

        // Iterate over and print average grades of the students in the school again
        for (Double avg : school) {
            System.out.println(avg);
        }
    }
}
