public class Student
{
    //initializing the variables
    private int prn;
    private String name;
    private String DOB;
    private int marks;

    //creating constructor for each of the variable
    Student(int p, String nm, String db, int m) {
        prn = p;
        name = nm;
        DOB = db;
        marks = m;
    }

    //functions to get and set PRN
    public int getPrn() {
        return prn;
    }
    public void setPrn(int p) {
        prn = p;
    }

    //functions to get and set Name
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    //functions to get and set DOB
    public String getDOB() {
        return DOB;
    }
    public void setDOB(String d) {
        DOB = d;
    }

    //functions to get and set Marks
    public int getMarks() {
        return marks;
    }
    public void setMarks(int m) {
        marks = m;
    }
}