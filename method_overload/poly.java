package method_overload;

public class poly {
    public static void main(String args[])
    {
        System.out.println("Sum of 2 numbers: "+add(2,3));
        System.out.println("Sum of 3 numbers: "+add(2,3,4));
    }
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static int add(int a, int b, int c)
    {
        return a+b+c;
    }   
}
