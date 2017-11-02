
import java.util.Scanner;
public class XPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   		Scanner s = new Scanner(System.in);
        		System.out.println("enter the number of rows=column");
        		int n = s.nextInt();
        		int i, j;
        		s.close();
        		for (i = 1; i <= n; i++)
        		{
        			for (j = 1; j <= n; j++) 
        			{
        				if (j == i)
        				{
        					System.out.print("*");
        				} 
        				else if (j == n - (i - 1)) 
        				{
        					System.out.print("*");
        				} 
        				else 
        				{
        					System.out.print(" ");
        				}
        			}
        			System.out.println();
        		}
        	}
        }


