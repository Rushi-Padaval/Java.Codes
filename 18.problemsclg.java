//Write a program to craete array of object

class Main {
    public static void main (String[] args) {
        //here we declare the array
        Student[] arr;
        //intialize the memeroy of 2 arrays 
        arr = new Student[2];
        //here we declare the 1st array
        arr[0] = new Student (12345678,"UP");
        //here we declare the 2nd array
        arr[1] = new Student (56789,"AB");
        // now we display the array
   System.out.println(
    "Student data in Student arr 0: ");
   arr[0].display();
   System.out.println(
    "Student data in Student arr 1: ");
   arr[1].display();
    }
}
class Student {

    public int id;
    public String name;

    Student(int id,String name) {
    this.id = id;
    this.name = name;
    }
    public void display()
    {
   System.out.println("Student id is: " + id + " " + "and Student name is: " + name);
}
}


