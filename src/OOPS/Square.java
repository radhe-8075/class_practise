package OOPS;

public class Square implements Shape  {
    public Square area;
    //class is an implements.
    //global variable.
     double side;
     public Square(double s){
         //constructor
         side=s;
     }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double parameter() {
        return 4*side;
    }

}
