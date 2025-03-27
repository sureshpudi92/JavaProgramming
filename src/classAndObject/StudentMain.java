package classAndObject;

public class StudentMain {
    public static void main(String[] args) {
        //Creating object with reference varaiable
        //1.Assigning data using object reference variable
        //Student s=new Student();
        /*s.sid=1001;
        s.sname="Hayaan";
        s.grade='A';
        s.printstudentdata();*/

        //2. assigning data by using user defined method
        // s.setstudentdata(110,"john",'A');
        //s.printstudentdata();

        //3. using constructor
        Student s=new Student(111,"john1",'B');
        s.printstudentdata();

    }
}
