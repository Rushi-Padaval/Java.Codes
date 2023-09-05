//example  of static variables
//java program to demonstare the use of stativ variables 
class Student{
    int rollno;//instance variable
    String name;
    //constructor
    static String collage = "ITS";//static variable 
    Student(int r, String n);
    {
    rollno = r;
    name = n;
    }
    //method to display the values 
    void display (){System.out.println(rollno+""+name+""+collage);}
} 
//Test class to show the values of objects 
public class Teststatic Variable1 {
    public static void main(String args[]) {
        Student s1 = new Studen(111,"karan");
        Student s2 = new Student(222,"Aryan");
        //we can change the collage of all objects by the single line of code 
        //Student.collage ="BBDIT";
        s1.display();
        s2.display();
    }
    }