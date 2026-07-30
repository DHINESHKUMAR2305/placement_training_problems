						Maximum Passenger


import java.util.*;


public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    
	    int n = scan.nextInt();
	    int max = 0;
	    int current = 0;
	    while(n!=0)
	    {
	        int out = scan.nextInt();
	        int in = scan.nextInt();
	        
	        current = current + in - out;
	        
	        max = Math.max(current , max);
	        
	        n--;
	        
	    }
	    
	    System.out.println(max);
	    
	    System.out.println("-----------");
	    System.out.println(max);
	    
	    
	}
}