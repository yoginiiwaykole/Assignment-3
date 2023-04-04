import java.util.Scanner;

public class StudentDemo {
    private Student[] students;
    private int count;
    Scanner sc = new Scanner(System.in);

    //initializing constructor
    public StudentDemo() {
        students = new Student[100];
        count = 0;
    }

    // Function to addStudent
    public void addStudent()
    {
        System.out.println("Add Students");
        System.out.println("---------------");
        System.out.print("Enter number of students to add: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println("Student " + (i+1));
            System.out.println("====================\n");

            System.out.print("Enter PRN: ");
            int prn = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter DOB (dd-mm-yy): ");
            String DOB = sc.next();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            students[count] = new Student(prn, name, DOB, marks);
            count++;
        }
    }

    // Function to display all student entries
    public void displayAllStudent()
    {
        if (count == 0)
        {
            System.out.println("No students added yet.");
            return;
        }

        else
        {
            System.out.println("Display All Students");
            System.out.println("---------------");
            for(int i=0;i<count;i++)
            {
                System.out.println("Student " + (i+1));
                System.out.println("PRN: "+students[i].getPrn());
                System.out.println("Name: "+students[i].getName());
                System.out.println("DOB: "+students[i].getDOB());
                System.out.println("Marks: "+students[i].getMarks());
                System.out.println("====================\n");
            }
        }

    }

    // Function to search student data by PRN
    public void searchByPRN()
    {
        System.out.print("Enter PRN: ");
        int prn = sc.nextInt();
        for(int i=0;i<count;i++)
        {
            if(students[i].getPrn() == prn)
            {
                System.out.println("Student " + (i+1));
                System.out.println("PRN: "+students[i].getPrn());
                System.out.println("Name: "+students[i].getName());
                System.out.println("DOB: "+students[i].getDOB());
                System.out.println("Marks: "+students[i].getMarks());
                System.out.println("====================\n");
            }
        }
    }

    // Function to search student data by Name
    public void searchByName()
    {
        System.out.print("Enter Name: ");
        String name = sc.next();
        for(int i=0;i<count;i++)
        {
            if(students[i].getName().equals(name))
            {
                System.out.println("Student " + (i+1));
                System.out.println("PRN: "+students[i].getPrn());
                System.out.println("Name: "+students[i].getName());
                System.out.println("DOB: "+students[i].getDOB());
                System.out.println("Marks: "+students[i].getMarks());
                System.out.println("====================\n");
            }
        }
    }

    // Function to search student data by Index value
    public void searchByIndex()
    {
        System.out.print("Enter Index: ");
        int pos = sc.nextInt();
        System.out.println("Student " + (pos));
        System.out.println("PRN: "+students[pos-1].getPrn());
        System.out.println("Name: "+students[pos-1].getName());
        System.out.println("DOB: "+students[pos-1].getDOB());
        System.out.println("Marks: "+students[pos-1].getMarks());
        System.out.println("====================\n");
    }

    // Function to update specific student data
    public void UpdateStudent()
    {
        System.out.println("Enter PRN of student to update: ");
        int prn = sc.nextInt();

        for (int i = 0; i < count; i++)
        {
            if (students[i].getPrn() == prn)
            {
                System.out.println("Name: "+students[i].getName());
                System.out.print("Enter new name (or press enter to keep the old data): ");
                String newName = sc.nextLine();
                if (!newName.isEmpty())
                {
                    students[i].setName(newName);
                }

                System.out.println("DOB: "+students[i].getDOB());
                System.out.println("Enter new DOB (or press enter to keep the old data): ");
                String newDOB = sc.nextLine();
                if (!newDOB.isEmpty())
                {
                    students[i].setDOB(newDOB);
                }

                System.out.println("Marks: "+students[i].getMarks());
                System.out.println("Enter new Marks (or press enter to keep the old data): ");
                String newMarks = sc.nextLine();
                if(!newMarks.isEmpty())
                {
                    int marks = Integer.parseInt(newMarks);
                    students[i].setMarks(marks);
                }
            }
        }
    }

    // Function to delete specific student data
    public void deleteStudent() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter PRN of student to delete: ");
        int prn = sc1.nextInt();
        sc1.close();
        for (int i = 0; i < count; i++)
        {
            if (students[i].getPrn() == prn)
            {
                for (int j = i; j < count - 1; j++)
                {
                    students[j] = students[j + 1];
                }
                count--;
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    //MAIN FUNCTION
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StudentDemo studentArray = new StudentDemo();

        //create a menu
        System.out.println("Student Management System");
        System.out.println("=========================");
        System.out.println("1. Add Students");
        System.out.println("2. Display All Students");
        System.out.println("3. Search Students");
        System.out.println("4. Update Students");
        System.out.println("5. Delete Students");
        System.out.println("6. Exit");
        System.out.println("=========================");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                studentArray.addStudent();
                break;

            case 2:
                studentArray.displayAllStudent();
                break;

            case 3:
                System.out.println("Search by:");
                System.out.println("1. PRN");
                System.out.println("2. Name");
                System.out.println("3. Index");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int searchChoice = sc.nextInt();
                switch(searchChoice)
                {
                    case 1:
                        studentArray.searchByPRN();
                        break;

                    case 2:
                        studentArray.searchByName();
                        break;

                    case 3:
                        studentArray.searchByIndex();
                        break;

                    case 4:
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
                break;

            case 4:
                studentArray.UpdateStudent();
                break;

            case 5:
                studentArray.deleteStudent();
                break;

            case 6:
                break;

            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}