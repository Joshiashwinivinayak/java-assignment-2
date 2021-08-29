//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;
class Area1 {
    int length;
    int breadth;
    area(int a, int b)
    {
         length = a;
         breadth = b;
    }
    public int returnArea()
    {
        return length * breadth;
    }
}
public class Rectangle4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the lenght of Recatangle: ");
         a = obj.nextInt();
        obj.nextLine();
        System.out.print("Enter the breadth of Recatangle:");
        b = obj.nextInt();
        area ob1 = new area(a,b);
        System.out.println("Area = "+ ob1.returnArea());
    }
} 