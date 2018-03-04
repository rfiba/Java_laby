package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean condition = true;
        int key;
        Scanner scanner = new Scanner(System.in);
        while(condition)
        {
            System.out.println("Press x to work with: 1 - triangle, 2 - square, 3 - circle, 4 exit");
            key = scanner.nextInt();
            switch(key){
                case 1:
                    System.out.println("Give values of sides:");
                    int aSide;
                    int bSide;
                    int cSide;
                    aSide = scanner.nextInt();
                    bSide = scanner.nextInt();
                    cSide = scanner.nextInt();

                    Triangle t;
                    try{
                        t = new Triangle(aSide, bSide, cSide);
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Error: " + e);
                        break;
                    }

                    t.print();
                    break;
                case 2:
                    System.out.println("Give value of side:");
                    int side;
                    side = scanner.nextInt();
                    Square s;
                    try{
                        s = new Square(side);
                    }
                    catch(IllegalArgumentException e){
                       System.out.println("Error: " + e);
                       break;
                    }
                    s.print();
                    break;
                case 3:
                    System.out.println("Give value of radius:");
                    int radius;
                    radius = scanner.nextInt();
                    Circle c;
                    try{
                        c = new Circle(radius);
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Error: " + e);
                        break;
                    }
                    c.print();
                    break;
                case 4:
                    condition = false;
                    break;
                    default:
                    System.out.println("Unknown command. Try again.");
                    break;
            }

        }
    }
}

