package Practiceproject3;
interface First 
{  
    default void show() 
    { 
        System.out.println("It is first Default "); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("It is second Default"); 
    } 
}  
public class TestClass implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        TestClass ob = new TestClass(); 
        ob.show(); 
    } 
}
