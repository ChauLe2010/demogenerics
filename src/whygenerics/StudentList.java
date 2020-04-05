package whygenerics;

import whygenerics.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {
    ArrayList studentList=new ArrayList();
   // ArrayList<Student> studentList=new ArrayList();
    public void inputList(){
        Student student1=new Student(1,"Thanh","Ha noi",9);
        Student student2=new Student(2,"Hung","Ha noi",9);
        Student student3=new Student(3,"Son","Ha noi",9);
        studentList.add("Chau");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
    }
    public void displayList(){
        Iterator iterator=studentList.iterator();
        while(iterator.hasNext()){
            Student student=new Student();
            Object obj=iterator.next();
            if(obj instanceof Student){
                student =(Student) obj;
                student.display();
            }
        }
    }
}
