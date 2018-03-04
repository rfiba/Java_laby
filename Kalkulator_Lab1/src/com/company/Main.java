package com.company;



public class Main {

    public static void main(String[] args) {
        Square t;
        try {
            t = new Square(-5);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error: " + e);
        }
        //t.print();
	    Triangle some = new Triangle(4,4,4);
	    some.print();
    }
}
