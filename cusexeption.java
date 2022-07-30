package Practiceproject3;

public class cusexeption
    {
        public static void main(String[] args)
        {

            int a=85,b=8,rs;

            try
            {
                if(b==0)        
                    throw(new ArithmeticException("It won't divided by zero."));
                else
                {
                    rs = a / b;
                    System.out.print("\n\tThe Answer is : " + rs);
                }
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }

            System.out.print("\n\tthe end of code.");
        }
    }
