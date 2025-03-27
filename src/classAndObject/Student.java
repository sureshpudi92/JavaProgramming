package classAndObject;

public class Student {
    int sid;
    String sname;
    char grade;

    void printstudentdata(){
        System.out.println(sid+" "+sname+" "+grade);
    }

    void setstudentdata(int id,String name,char g){

        sid=id;
        sname=name;
        grade=g;
    }
    Student(int id,String name,char g){
        sid=id;
        sname=name;
        grade=g;
    }
}
