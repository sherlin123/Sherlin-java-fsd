package Practiceproject3;

public class Objects {

    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        Objects s = new Objects(); 
        System.out.println(s.sum(17, 20)); 
        System.out.println(s.sum(18, 20, 30)); 
        System.out.println(s.sum(19.5, 20.5)); 
    } 
}
