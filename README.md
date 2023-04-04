# Assignment-3


Student Management System and working on class, attributes and various operations.

This is a Java program for a Student Management System. The program contains two classes: Student.java and StudentDemo.java. The former defines a student class and has methods to set and get values of variables such as prn (Personal Registration Number), name, DOB (Date of Birth), and marks. The latter class has methods to perform operations on the student class such as adding students, displaying all students, searching for a student by PRN, name, or position in the array, updating student information, and deleting a student.

In the Student class, the constructor initializes the values of prn, name, DOB, and marks for the student object. The getPrn(), setPrn(), getName(), setName(), getDOB(), setDOB(), getMarks(), and setMarks() methods provide access to and modification of these variables, respectively.

In the StudentDemo class, the constructor initializes an array of student objects and sets the count of students to 0. The addStudent() method adds a specified number of students to the array by taking input for each student's prn, name, DOB, and marks. The displayAllStudent() method displays all the students in the array along with their details. The searchByPRN(), searchByName(), and searchByIndex() methods search for a student by the PRN, name, or position in the array, respectively. The UpdateStudent() method updates the details of a student by searching for the student by their PRN and prompting the user to enter the new details. Finally, the deleteStudent() method deletes a student from the array by their PRN.
