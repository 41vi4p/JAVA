// 
// Write a program to display area of rectangle and triangle using abstract class

import java.util.*;

abstract class outline 
{
    float bs,ht;
    outline(){
        Scanner s= new Scanner(System.in);
        bs=s.nextFloat();
        ht=s.nextFloat();
    }
    abstract void area();

    
}
class rectangle extends outline
{
    void area()
    {
        System.out.println("Area of rectangle is "+(bs*ht));
    }
}
class triangle extends outline
{
    void area()
    {
        System.out.println("Area of triangle is "+(0.5*bs*ht));
    }
}

public class area {
    public static void main(String[] args) {
        System.out.println("Enter the base and height of rectangle: ");
        outline o= new rectangle();
        o.area();
        System.out.println("Enter the base and height of triangle: ");
        outline d=new triangle();
        d.area();
    }
}
