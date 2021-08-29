//Java Program to Generate Multiplication Table

public class Multiplication_Table {
    public static void main(String[] args) {
        int num = 8;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}