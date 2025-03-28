package encapsulation;

public class ThisKeyword {

    int x,y;


    /*void setData(int x , int y) { // method to set the values of x and y
        this.x=x; // this.x refers to the instance/class variable x
        this.y=y; // this.y refers to the instance/class variable y
    }
    */

    ThisKeyword(int x, int y) { // constructor to initialize the values of x and y
        this.x = x; // this.x refers to the instance/class variable x
        this.y = y; // this.y refers to the instance/class variable y

    }
    void display(){
        System.out.println(x+" "+y);

    }

  public static void main(String[] args) {
        //ThisKeyword th=new ThisKeyword();
        ThisKeyword th=new ThisKeyword(10,30);//invoking constructor at the time of object creation
        //th.setData(10,20);
        th.display();

    }
}
