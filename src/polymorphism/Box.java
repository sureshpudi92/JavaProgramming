package polymorphism;

public class Box {

    double width, height, depth;

    Box(){ // default constructor
        width = height = depth = 0;
    }
    Box(double w, double h, double d){ // parameterized constructor
        width = w;
        height = h;
        depth = d;
    }
    Box(double len){ // constructor with one parameter
        width= height = depth = len;
    }

    double volume(){
        return(width*height*depth);
    }
}
