package Practiceproject3;

public class exeptionBlock {

    public static void main(String[] args)
    {
        int a=5,b=0,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + rs);
        }
    }
}
